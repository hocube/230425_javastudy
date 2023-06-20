package Team_Project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MobileTicket extends JFrame {
	JPanel MainPanel, NorthPanel, LabelPanel, ButtonPanel;
	JButton cancel;

	public MobileTicket() {
		super("모바일티켓");

		NorthPanel = new JPanel(new BorderLayout());
		JPanel headerPanel = new JPanel(new BorderLayout());

		// "영화 입장권" 
		JLabel titleLabel = new JLabel("영화 입장권");
		titleLabel.setFont(new Font("굴림", Font.BOLD, 25));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER); // 가운데 정렬
		titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10)); // 여백 추가
		JLabel line = new JLabel("===============================================");
		headerPanel.add(titleLabel, BorderLayout.NORTH);
		headerPanel.add(line, BorderLayout.CENTER);
		NorthPanel.add(headerPanel, BorderLayout.NORTH);

		
		LabelPanel = new JPanel();
		LabelPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10)); // 가운데 정렬 및 간격 설정
		LabelPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // 여백 추가
		JPanel Panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JLabel NameLabel = new JLabel("스파이더맨");
		NameLabel.setFont(new Font("굴림", Font.BOLD, 20));
		
		JLabel DayLabel = new JLabel("2023-06-20(화)"); 
		DayLabel.setFont(new Font("굴림", Font.BOLD, 18));
		
		JLabel TimeLabel = new JLabel("10:30 ~ 11:50");
		TimeLabel.setFont(new Font("굴림", Font.BOLD, 18));
		
		JLabel RoomLabel = new JLabel("1층 (1관)"); 
		//(roomNumber + "(1층)   "+ seatStr + "    총(" +person+"명)");
		RoomLabel.setFont(new Font("굴림", Font.BOLD, 18));
		
		JLabel SeatLabel = new JLabel("G열7 G열8");
		SeatLabel.setFont(new Font("굴림", Font.BOLD, 18));
		
		LabelPanel.add(NameLabel);
		LabelPanel.add(DayLabel);
		LabelPanel.add(TimeLabel);
		LabelPanel.add(RoomLabel);
		LabelPanel.add(SeatLabel);
		
		ButtonPanel = new JPanel();
		cancel = new JButton("예매 취소");
		cancel.setFont(new Font("돋움", Font.BOLD, 20));
		ButtonPanel.add(cancel);
		
		MainPanel = new JPanel(new BorderLayout());
		MainPanel.add(NorthPanel, BorderLayout.NORTH);
		MainPanel.add(LabelPanel, BorderLayout.CENTER);
		MainPanel.add(ButtonPanel, BorderLayout.SOUTH);
		
		add(MainPanel);
		
		setSize(350, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false); // 크기 조절 비활성화

	}

	public static void main(String[] args) {
		new MobileTicket();
	}
}
