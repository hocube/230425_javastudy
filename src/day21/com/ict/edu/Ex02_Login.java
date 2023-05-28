package day21.com.ict.edu;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Ex02_Login extends JPanel{
	//main만 Jframe을 상속 받음
	CardLayout cardLayout;  //main에 있는걸 가져와서 전역변수로 만듦
	JPanel pg1;  //main에 있는걸 가져와서 전역변수로 만듦
	
	JButton jb1, jb2;
	//main에 있는 CardLayout과 pg1을 사용하기 위해서 정보를 받아야 한다.
	//여기서 새로 만들면 정보 교류를 할 수 없다.
	public Ex02_Login(CardLayout cardLayout, JPanel pg1) {
		//생성자에서 받은 정보는 무조건 전역 변수로 만들자.
		this.cardLayout = cardLayout;
		this.pg1 = pg1;
		
		jb1 = new JButton("회원가입");
		jb2 = new JButton("로그인");
		
		//본인이 Jpanel이니깐 여기에 그냥 붙임.
		add(jb1);
		add(jb2);
		
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(pg1, "join"); //회원가입 버튼이니깐
			}
		});
		
		
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(pg1, "loginok"); //로그인 버튼이니깐
			}
		});
		
	}
}
