package day22.com.ict.edu;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Ex05_Main extends JFrame{
	//객체 생성
	Ex05_Canvas canvas = new Ex05_Canvas();
	
	public Ex05_Main() {
		super("원 찍기");
		
		add(canvas);
		
		setSize(300, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	 //마우스 이벤트(마우스로 찍으니깐)
	 //ItemListener, ActionListener처럼 오버라이딩 메서드가 하나가 아니라
	 //2개 이상이면 불필요한 메서드까지 오버라이딩 하게 된다.
	 //이러한 단점을 고친 것이 Adapter()이다.
	 /*
	 canvas.addMouseListener(new MouseListener() {
		@Override
		public void mouseReleased(MouseEvent e) {}
		@Override
		public void mousePressed(MouseEvent e) {}
		@Override
		public void mouseExited(MouseEvent e) {}
		@Override
		public void mouseEntered(MouseEvent e) {}
		@Override
		public void mouseClicked(MouseEvent e) {}
	});
	 */
		
	 //어댑터
	 canvas.addMouseListener(new MouseAdapter() {
		 @Override
		public void mouseClicked(MouseEvent e) {
		//마우스 찍힌 곳의 좌표를 전달 해줘야함.
	    canvas.x=e.getX();
		canvas.y=e.getY();
		canvas.repaint();  //지우고 다시 
		}
	});
		
		
	}
public static void main(String[] args) {
	new Ex05_Main();
}
}
