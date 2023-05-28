package day17.co.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex01_Calc extends JFrame {
//패널 3개 필요
	public Ex01_Calc() {
		super("계산기");
		
		JPanel np = new JPanel();  //j panel
		
		//라벨 3개, 텍스트 필드 3개
		JLabel jl1 = new JLabel("수1 : ");  //순서대로
		JTextField jtf1 = new JTextField(5); 
		JLabel jl2 = new JLabel("수2 : ");  //순서대로
		JTextField jtf2 = new JTextField(5); 
		JLabel jl3 = new JLabel("연산자 : ");  //순서대로
		JTextField jtf3 = new JTextField(5); 
		
		//패널에 버튼 붙이기
		np.add(jl1);
		np.add(jtf1);
		np.add(jl2);
		np.add(jtf2);
		np.add(jl3);
		np.add(jtf3);
		
		//두번째꺼 (가운데 빈 부분)
		//가운데 부분 textarea 패널 안씀
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true);  //자동 줄 바꾸기
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		//편집 불가하게 만들자
		jta.setEditable(false);
		
		
		//세번째꺼
		JPanel sp = new JPanel();
		
		//버튼3개
		JButton jb1 = new JButton("계  산");
		JButton jb2 = new JButton("종  료");
		JButton jb3 = new JButton("취  소");
		//버튼 붙이기
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);

		
		//프레임에 붙어야 함. 위치 설정
	    add(np,BorderLayout.NORTH);  //첫번째꺼
	    add(jsp,BorderLayout.CENTER); //두번째꺼
	    add(sp,BorderLayout.SOUTH);  //세번째꺼

	 
	    
	    Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new Ex01_Calc();
	}
}
