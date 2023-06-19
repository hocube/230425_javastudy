package Team_Project;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PointCharge extends JFrame{
	JPanel jp1, jp2, jp3, jp4, centerPanel;
	JRadioButton jrb1, jrb2, jrb3, jrb4, jrb5, jrb6;
	JButton pay, cancel;
	ButtonGroup bg1, bg2;
	
	public PointCharge() {
		super("포인트 충전");
		
		jp1 = new JPanel();
		jp1.add(new JLabel("포인트 충전"));
		
		// 5000원, 10000원, 15000원
		jp2 = new JPanel();
		bg1 = new ButtonGroup();
		jrb1 = new JRadioButton("5000원");
		jrb2 = new JRadioButton("10000원");
		jrb3 = new JRadioButton("15000원");
		bg1.add(jrb1);
		bg1.add(jrb2);
		bg1.add(jrb3);
		jp2.setLayout(new GridLayout(3,0));
		jp2.add(jrb1);
		jp2.add(jrb2);
		jp2.add(jrb3);
		
		// 20000원, 25000원, 30000원
		jp3 = new JPanel();
		bg2 = new ButtonGroup();
		jrb4 = new JRadioButton("20000원");
		jrb5 = new JRadioButton("25000원");
		jrb6 = new JRadioButton("30000원");
		bg2.add(jrb4);
		bg2.add(jrb5);
		bg2.add(jrb6);
		jp3.setLayout(new GridLayout(3,0));
		jp3.add(jrb4);
		jp3.add(jrb5);
		jp3.add(jrb6);
		
		//결재, 취소
		jp4 = new JPanel();
		pay = new JButton("결재");
		cancel = new JButton("취소");
		jp4.add(pay);
		jp4.add(cancel);
		
		// 가운데 패널 생성 및 설정
		centerPanel = new JPanel(new GridLayout(1, 2));
		centerPanel.add(jp2, BorderLayout.WEST);
        centerPanel.add(jp3, BorderLayout.EAST);
		
		add(jp1, BorderLayout.NORTH);
		add(centerPanel, BorderLayout.CENTER);
		add(jp4, BorderLayout.SOUTH);
			
		
		setSize(350, 250);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new PointCharge();
	}
}
