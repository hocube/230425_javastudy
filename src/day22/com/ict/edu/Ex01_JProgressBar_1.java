package day22.com.ict.edu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Ex01_JProgressBar_1 extends JFrame{
	JPanel jp;
	JButton jb;
	JProgressBar jp1, jp2;
	
	
	public Ex01_JProgressBar_1() {
		super("프로그레스바 스레드");
		
		jp = new JPanel();
		jb = new JButton("start");
		jp1 = new JProgressBar();
		jp2 = new JProgressBar();
		jp.add(jb);
		jp.add(jp1);
		jp.add(jp2);
		add(jp);
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//멀티 스레드 처리
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
public static void main(String[] args) {
	new Ex01_JProgressBar_1();
}
}
