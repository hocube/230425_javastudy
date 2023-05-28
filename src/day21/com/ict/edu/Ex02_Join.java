package day21.com.ict.edu;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Ex02_Join extends JPanel{
	Ex02_Main main;
	JButton jb;
	
//main에 있는 CardLayout과 pg1을 사용하기 위해서 정보를 받아야 한다.
//여기서 새로 만들면 정보 교류를 할 수 없다.
//단, 전달 정보가 많으면 클래스(객체) 자체를 받자.
	
	//클래스 자체를 받는 법
public Ex02_Join(Ex02_Main main) {
	//생성자에서 받은 정보는 무조건 전역 변수로 만들자.
	this.main = main;  //main에 찾아가서 받음.
	
	jb = new JButton("뒤로가기");
	
	add(new JLabel("회원가입 창입니다."));
	add(jb);
	
	
	jb.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//cardLayout.show(pg1,"login");
			main.cardLayout.show(main.pg1, "login");
			//여기선 main 클래스 자체를 가지고 왔기 때문에 main.으로 해야 함.
		}
	});
}
}
