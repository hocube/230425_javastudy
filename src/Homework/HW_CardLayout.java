package Homework;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HW_CardLayout extends JFrame{
	JPanel pg1,  bp1;
	CardLayout cardLayout;
	JButton jb1, jb2, jb3;
	
	public HW_CardLayout() {
		super("카드레이아웃 연습");
		
		pg1 = new JPanel();
		cardLayout = new CardLayout();
		pg1.setLayout(cardLayout); // 패널을 카드 레이아웃으로 설정
		
		//객체 생성
		HW_Calc calc = new HW_Calc(this);
		HW_Grade grade = new HW_Grade(this);
		HW_City city = new HW_City(this);
		
		jb1 = new JButton("계산기");
		jb2 = new JButton("성적 계산기");
		jb3 = new JButton("수도 맞추기");
		
		//버튼 패널
		bp1 = new JPanel();
		bp1.add(jb1);
		bp1.add(jb2);
		bp1.add(jb3);
		
		//카드레이아웃은 호출 이름과 패널을 넣어줘야 함
		pg1.add("main", bp1);
		pg1.add("calc", calc);
		pg1.add("grade", grade);
		pg1.add("city", city);
		
		
		add(pg1);
		
		cardLayout.show(pg1, "main");
		
		//화면 설정
		//pack();
		setLocationRelativeTo(null);
		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(pg1, "calc");
				
			}
		});
		
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(pg1, "grade");
			}
		});
		
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(pg1, "city");
			}
		});
	
	}
public static void main(String[] args) {
	new HW_CardLayout();
}
}