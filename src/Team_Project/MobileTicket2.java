package Team_Project;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MobileTicket2 extends JFrame {
	JPanel NorthPanel;
	
	public MobileTicket2() {
		super("모바일티켓");

		NorthPanel = new JPanel(new GridLayout(5, 1, 0, 10));
		NorthPanel.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10)); // 여백 추가

		// "영화 입장권" 라벨 추가
		JLabel titleLabel = new JLabel("영화 입장권");
		titleLabel.setFont(new Font("굴림", Font.BOLD, 25));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER); // 가운데 정렬
		titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10)); // 여백 추가
		JLabel line = new JLabel("===============================================");
		NorthPanel.add(titleLabel);
		NorthPanel.add(line);

		JLabel NameLabel = new JLabel("스파이더맨");
		NameLabel.setFont(new Font("돋움", Font.BOLD, 20));

		JLabel DayLabel = new JLabel("2023-06-20(화)");
		DayLabel.setFont(new Font("돋움", Font.BOLD, 18));

		JLabel TimeLabel = new JLabel("10:30 ~ 11:50");
		TimeLabel.setFont(new Font("돋움", Font.BOLD, 18));

		JLabel RoomLabel = new JLabel("1층 (1관)");
		RoomLabel.setFont(new Font("돋움", Font.BOLD, 18));

		JLabel SeatLabel = new JLabel("G열7 G열8");
		SeatLabel.setFont(new Font("돋움", Font.BOLD, 18));

		NorthPanel.add(NameLabel);
		NorthPanel.add(DayLabel);
		NorthPanel.add(TimeLabel);
		NorthPanel.add(RoomLabel);
		NorthPanel.add(SeatLabel);

		add(NorthPanel, BorderLayout.NORTH);

		setSize(350, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false); // 크기 조절 비활성화
	}

	public static void main(String[] args) {
		new MobileTicket2();
	}
}