package day23.com.ict.edu;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Ex01_Main extends JFrame {
	Ex01_Canvas canvas = new Ex01_Canvas();

	public Ex01_Main() {
		super("키 이벤트로 이미지 움직이기");

		add(canvas);
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		// key 이벤트
		// 키보드를 사용해서 이벤트 함.
		/*
		 * addKeyListener(new KeyListener() {
		 * 
		 * @Override public void keyTyped(KeyEvent e) {}
		 * 
		 * @Override public void keyReleased(KeyEvent e) {}
		 * 
		 * @Override public void keyPressed(KeyEvent e) {} });
		 */

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// 눌려진 키 값을 구하자
				int key = e.getKeyCode();
				//키가 오른쪽이나 왼쪽일 때 실행
				switch (key) {
				case KeyEvent.VK_LEFT:
				//x좌표가 0이랑 같거나 작으면 좌표는 0
				//그럼 안 넘어 가게 됨.
					if(canvas.x <= 0) {
					canvas.x = 0;
					}else {
					canvas.x = canvas.x-10;
					}
					break;

				case KeyEvent.VK_RIGHT:
					//
					if(canvas.x >= canvas.getWidth()-100) {
					canvas.x = canvas.getWidth()-100;
					}else {
					canvas.x = canvas.x + 10;
					}
					break;
				}
				canvas.repaint();
			}
		});

	}

	public static void main(String[] args) {
		new Ex01_Main();
	}
}
