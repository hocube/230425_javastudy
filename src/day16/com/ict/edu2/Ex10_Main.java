package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Ex10_Main extends JFrame {
	public Ex10_Main() {
		super("JTap_2");
		
		//JPanel을 상속한 클래스 객체로 만들기
		Ex10_Blue blue = new Ex10_Blue(); //객체생성
		Ex10_Cyan cyan = new Ex10_Cyan(); //객체생성
		Ex10_Green green = new Ex10_Green(); //객체생성
		
		//JPanel들을 만들었으니 JTab에 넣기
		JTabbedPane jtab = new JTabbedPane();
		jtab.addTab("블루 탭2", blue);
		jtab.addTab("시안 탭2", cyan);
		jtab.addTab("그린 탭2", green);
		
		//JTab을 JFrame에 넣기
		add(jtab);
			
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex10_Main();
	}
}
