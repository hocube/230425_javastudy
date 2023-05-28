package day17.co.ict.edu5;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex02_Calc extends JFrame{
	public Ex02_Calc() {
		super("계산기");
		
	//첫번째 패널 생성
	JPanel np = new JPanel();
	
	//텍스트필드 생성
	JTextField jtf1 = new JTextField(25);
	
	//두번째꺼
	JPanel cp = new JPanel(new GridLayout(5,3,10,10));
	
	JButton jb1 = new JButton("1");
	JButton jb2 = new JButton("2");
	JButton jb3 = new JButton("3");
	JButton jb4 = new JButton("4");
	JButton jb5 = new JButton("5");
	JButton jb6 = new JButton("6");
	JButton jb7 = new JButton("7");
	JButton jb8 = new JButton("8");
	JButton jb9 = new JButton("9");
	JButton jb10 = new JButton("0");
	JButton jb11 = new JButton("+");
	JButton jb12 = new JButton("-");
	JButton jb13 = new JButton("*");
	JButton jb14 = new JButton("/");
	JButton jb15 = new JButton("=");
	
	//버튼 붙이기
	np.add(jtf1);
	
	cp.add(jb1);
	cp.add(jb2);
	cp.add(jb3);
	cp.add(jb4);
	cp.add(jb5);
	cp.add(jb6);
	cp.add(jb7);
	cp.add(jb8);
	cp.add(jb9);
	cp.add(jb10);
	cp.add(jb11);
	cp.add(jb12);
	cp.add(jb13);
	cp.add(jb14);
	cp.add(jb15);
	
	//프레임에 붙이기
	add(np,BorderLayout.NORTH);
	add(cp);
	
	Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
	setBounds(ds.width / 2 - 150, ds.height / 2 - 150, 300, 300);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
public static void main(String[] args) {
	new Ex02_Calc();
}
}
