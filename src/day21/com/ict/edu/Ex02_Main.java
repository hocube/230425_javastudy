package day21.com.ict.edu;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02_Main extends JFrame{
	JPanel pg1;
	CardLayout cardLayout;
	
	
	public Ex02_Main() {
		super("카드레이아웃2");
		
		pg1 = new JPanel();
		cardLayout = new CardLayout();
		pg1.setLayout(cardLayout);  //이제 패널이 아닌 카드 레이아웃을 가진 큰 컨테이너가 됨.
		
		
		//main의 정보를 주고 객체생성 시킴. 객체 생성을 해야지만 써먹을 수 있다.
		//위에 줄에 있는 정보들이 Ex02_Login으로 넘어감. 
		Ex02_Login login = new Ex02_Login(cardLayout, pg1);
		
		Ex02_Join join = new Ex02_Join(this); //Ex02_Join에서 클래스 자체를 받았기 때문에 this로 
		
		Ex02_Login_ok loginok = new Ex02_Login_ok(this);
		
		//카드레이아웃은 호출 이름과 패널을 넣어줘야 함
		pg1.add("login", login); 
		pg1.add("join", join);
		pg1.add("loginok", loginok);
		
		add(pg1);
		
		//보고싶은 화면으로 설정
		//cardLayout.show(pg1,"loginok");
		
		setLocationRelativeTo(null);
		setSize(500, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
public static void main(String[] args) {
	new Ex02_Main();
}
}
