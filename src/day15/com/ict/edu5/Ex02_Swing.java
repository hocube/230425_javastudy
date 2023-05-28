package day15.com.ict.edu5;

import javax.swing.JFrame;

//부모로 만들어서 쓰는 거
public class Ex02_Swing extends JFrame {

	public Ex02_Swing() {
		super("Swing으로 만든 창"); //부모 생성자
		setSize(300, 300);
		setLocation(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		//Ex02_Swing test = new Ex02_Swing();
		new Ex02_Swing();
		//이렇게 하면 생성자 안에서 모두 끝남.
	}
}
