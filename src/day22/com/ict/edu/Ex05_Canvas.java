package day22.com.ict.edu;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Ex05_Canvas extends Canvas {
	//초기값
	int x = -50;  //화면에 안보이게 하기 위해 초기값 -50했음.
	int y = -50;
	int wh = 30;  //원 크기
	
	@Override
	public void paint(Graphics g) {
		int r1 = (int)(Math.random() * 256);
		int g1 = (int)(Math.random() * 256);
		int b1 = (int)(Math.random() * 256);
		
		g.setColor(new Color(r1, g1, b1));
		g.fillOval(x-wh/2, y-wh/2, wh, wh); //이렇게 해야지만 가운데 찍힘.
	
	}
	
	//기존 내용을 그대로 남겨 두고 추가하자
	@Override
	public void update(Graphics g) {
		paint(g);
	}
}
