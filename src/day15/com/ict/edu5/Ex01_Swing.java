package day15.com.ict.edu5;

import javax.swing.JFrame;

public class Ex01_Swing {
	public static void main(String[] args) {
		//jframe을 객체로 만들어서 접근해서 쓰는거
		JFrame jframe = new JFrame("Swing으로 만든 창");
		
		//또 다른 방법
		/*
		JFrame jframe = new JFrame();
		jframe.setTitle("Swing으로 만든 창");
		*/
		
		//창 크기
		jframe.setSize(600, 600);
		//창 위치
		jframe.setLocation(0, 0);
		
		//표시여부(기본 : false)
		jframe.setVisible(true);
	}
}
