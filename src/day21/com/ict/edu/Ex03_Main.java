package day21.com.ict.edu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex03_Main extends JFrame{
	JPanel jp;
	JButton jb1, jb2;
	
	public Ex03_Main() {
		super("여러 창 사용하기");
		jp = new JPanel();
		
		jb1 = new JButton("회원가입");
		jb2 = new JButton("로그인");
		
		jp.add(jb1);
		jp.add(jb2);
		
		add(jp);
		
		setSize(500, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false); //자기는 없어지고 새로운 창만 뜸. 실제는 안보이게 만든거임.
				//익명 내부 클래스에서는 this를 사용할 때 클래스.this를 사용해야 한다.
				new Ex03_Join(Ex03_Main.this);   //객체 생성
					//내부 클래스는 외부 클래스를 통해서만 들어갈 수 있으니 Ex03_Main.this로 해야 함.
				//new를 했기 때문에 얘는 항상 새로 만들어진다.
			}
		});
		
		
	}

	public static void main(String[] args) {
		new Ex03_Main();
	}
}
