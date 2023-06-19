package Team_Project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pay extends JFrame {
	JPanel northPanel, centerPanel, jp1, jp2, jp3;
	JTextField remainingPoints, payPoint;
	JButton pay, cancel;

	public Pay() {
		super("결제");

		// 잔여포인트
		jp1 = new JPanel();
		jp1.setLayout(new BoxLayout(jp1, BoxLayout.Y_AXIS));
		
		JPanel jp1_1 = new JPanel();
		jp1_1.setPreferredSize(new Dimension(180, 50)); 
		jp1_1.setBackground(Color.WHITE);
		
		JPanel jp1_2 = new JPanel();
		jp1_2.setLayout(new BoxLayout(jp1_2, BoxLayout.X_AXIS));
		jp1_2.add(new JLabel("  잔여 포인트  :  "));
		remainingPoints = new JTextField(10);
		remainingPoints.setText("DB정보1");
		remainingPoints.setBorder(BorderFactory.createEmptyBorder());
		jp1_2.add(remainingPoints);
		jp1_2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		jp1_2.setMaximumSize(new Dimension(jp1_1.getPreferredSize()));
		
		jp1.add(jp1_1);
		jp1.add(jp1_2);
		jp1.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));

		// 결제포인트
		jp2 = new JPanel();
		jp2.setLayout(new BoxLayout(jp2, BoxLayout.Y_AXIS));
		JPanel jp2_1 = new JPanel();
		jp2_1.setPreferredSize(new Dimension(180, 0)); 
		jp2_1.setBackground(Color.WHITE);
		
		JPanel jp2_2 = new JPanel();
		jp2_2.setLayout(new BoxLayout(jp2_2, BoxLayout.X_AXIS));
		jp2_2.add(new JLabel("  결제 포인트  :  "));
		payPoint = new JTextField(10);
		payPoint.setText("DB정보2");
		payPoint.setBorder(BorderFactory.createEmptyBorder());
		jp2_2.add(payPoint);
		jp2_2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		jp2_2.setMaximumSize(new Dimension(jp2_1.getPreferredSize()));
		
		
		jp2.add(jp2_1);
		jp2.add(jp2_2);
		

		// 결제, 취소 버튼
		jp3 = new JPanel();
		pay = new JButton("결제하기");
		cancel = new JButton("취소하기");
		jp3.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));
		jp3.add(pay);
		jp3.add(Box.createHorizontalStrut(20));
		jp3.add(cancel);
		jp3.setBorder(BorderFactory.createEmptyBorder(30, 0, 20, 5));
												//    상, 좌, 하, 우

		setLayout(new BorderLayout());
		add(jp1, BorderLayout.NORTH);
		add(jp2, BorderLayout.CENTER);
		add(jp3, BorderLayout.SOUTH);
		add(Box.createVerticalStrut(20), BorderLayout.WEST);
		add(Box.createVerticalStrut(20), BorderLayout.EAST);

		setSize(350, 250);
		setLocationRelativeTo(null); //현재 화면의 중앙에 표시
		setVisible(true); // 닫힐 때 프로그램이 종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false); // 크기 조절 비활성화

	}

	public static void main(String[] args) {
		new Pay();
	}
}
