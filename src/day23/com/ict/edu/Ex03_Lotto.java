package day23.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex03_Lotto extends JFrame {
	JPanel jp;
	JButton jb;
	Image[] images = new Image[45];
	CanvasTest canvas = new CanvasTest(); 
	

	public Ex03_Lotto() {
		super("로또 자동 생성기");
		
		jp = new JPanel();
		jb = new JButton("번호 생성");
		jp.add(jb);
		add(jp, BorderLayout.EAST);
		add(canvas, BorderLayout.CENTER);
		
		setSize(900, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				canvas.repaint();  //버튼 누르면 다시 해 주세요.
			}
		});
	}
	
	//내부 클래스
	private class CanvasTest extends Canvas{
		//생성자
		//맨 처음에도 나오게 하려고 생성자가 필요
		public CanvasTest() {
			//배열에 이미지 (1 : 1 매칭)
			for (int i = 0; i < images.length; i++) {
				images[i] = Toolkit.getDefaultToolkit().getImage("src/lotto_img/"+(i+1)+".gif");
			//(i+1)하는 이유는 배열이니깐 0이고, 그림은 1번부터니깐//0번 방에는 1번 그림, 1번 방에는 2번 그림....
			}
		}
		@Override
		public void paint(Graphics g) {
			int[]su = new int[6];
			TreeSet<Integer> set = new TreeSet<>();
			for (int i = 0; i < su.length; i++) {
				int k = (int)(Math.random()*45)+1;
				if(! set.add(k)) {
					i--;
				}
			}
			int number = 0;
			//끄집어 내기
			for (Integer k : set) {
				g.drawImage(images[k-1], number++*120, 25, this); //처음에 0이고 그림 크기가 120
				//한번 할 때마다 120씩 너비를 띄어서 해야 겹치지 않음.
			}
		}
	}

	public static void main(String[] args) {
		new Ex03_Lotto();
	}
}
