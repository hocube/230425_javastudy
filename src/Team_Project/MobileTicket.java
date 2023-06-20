package Team_Project;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class MobileTicket extends JFrame {
	JPanel MainPanel, NorthPanel, LabelPanel, ButtonPanel;
	JButton cancel;

	public MobileTicket() {
		super("모바일티켓");

		NorthPanel = new JPanel(new BorderLayout());
		JPanel headerPanel = new JPanel(new BorderLayout());

		// "영화 입장권" 제목 패널
		JLabel titleLabel = new JLabel("영화 입장권");
		titleLabel.setFont(new Font("굴림", Font.BOLD, 25));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER); // 가운데 정렬
		titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10)); // 여백 추가
		JLabel line = new JLabel("===============================================");
		headerPanel.add(titleLabel, BorderLayout.NORTH);
		headerPanel.add(line, BorderLayout.CENTER);
		NorthPanel.add(headerPanel, BorderLayout.NORTH);

		// 라벨 패널
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel NameLabel = new JLabel("스파이더맨");
		NameLabel.setFont(new Font("굴림", Font.BOLD, 20));
		p1.add(NameLabel);

		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel DayLabel = new JLabel("2023-06-20(화)");
		DayLabel.setFont(new Font("굴림", Font.BOLD, 18));
		p2.add(DayLabel);

		JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel TimeLabel = new JLabel("10:30 ~ 11:50");
		TimeLabel.setFont(new Font("굴림", Font.BOLD, 18));
		p3.add(TimeLabel);

		JPanel p4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel RoomLabel = new JLabel("1층 (1관)");
		// (roomNumber + "(1층) "+ seatStr + " 총(" +person+"명)");
		RoomLabel.setFont(new Font("굴림", Font.BOLD, 18));
		p4.add(RoomLabel);

		JPanel p5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel SeatLabel = new JLabel("G열7 G열8");
		SeatLabel.setFont(new Font("굴림", Font.BOLD, 18));
		p5.add(SeatLabel);

		// 한 패널에 붙이기(그리드로 만들기 위해)
		JPanel LabelPanel = new JPanel();
		LabelPanel.setLayout(new GridLayout(5, 1));

		LabelPanel.add(p1);
		LabelPanel.add(p2);
		LabelPanel.add(p3);
		LabelPanel.add(p4);
		LabelPanel.add(p5);

		// 안내문구 패널
		JPanel p6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel line2 = new JLabel("===============================================");
		p6.add(line2);

		JTextArea textArea = new JTextArea("긴 텍스트");
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);

		JPanel p7 = new JPanel(new BorderLayout());
		JTextArea text = new JTextArea("- 티켓 교환 및 환불은 티켓 표기시간 20분 전까지 매표소에서 가능합니다.");
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		text.setEditable(false);
		text.setMargin(new Insets(0, 10, 0, 10)); // 상, 좌, 하, 우 여백 설정
		p7.add(text, BorderLayout.CENTER);

		JPanel p8 = new JPanel(new BorderLayout());
		JTextArea text2 = new JTextArea("- 지연 입장에 의한 관람불편을 최소화하고자 본 영화는 약 10분 후에 시작됩니다.");
		text2.setLineWrap(true);
		text2.setWrapStyleWord(true);
		text2.setEditable(false);
		text2.setMargin(new Insets(0, 10, 10, 10)); // 상, 좌, 하, 우 여백 설정
		p8.add(text2, BorderLayout.CENTER);

		JPanel p9 = new JPanel(new BorderLayout());
		JTextArea text3 = new JTextArea("- 관람에티켓을 위한 사전입장을 부탁드립니다.");
		text3.setLineWrap(true);
		text3.setWrapStyleWord(true);
		text3.setEditable(false);
		text3.setMargin(new Insets(10, 10, 15, 10)); // 상, 좌, 하, 우 여백 설정
		p9.add(text3, BorderLayout.CENTER);
		
		JPanel p10 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel line3 = new JLabel("===============================================");
		text3.setMargin(new Insets(10, 10, 10, 10)); // 상, 좌, 하, 우 여백 설정
		p10.add(line3);

		// 한 패널에 붙이기(그리드로 만들기 위해)
		JPanel LabelPanel2 = new JPanel(new BorderLayout());
		
		JPanel textPanel = new JPanel(new GridLayout(5, 0, 0, 0));
												// 행, 열, 수평, 수직
		textPanel.add(p6);
		textPanel.add(p7);
		textPanel.add(p8);
		textPanel.add(p9);
		textPanel.add(p10);

		LabelPanel2.add(textPanel, BorderLayout.NORTH);
		
		JPanel CenterPanel = new JPanel(new BorderLayout());
		CenterPanel.add(LabelPanel, BorderLayout.NORTH);
		CenterPanel.add(LabelPanel2, BorderLayout.CENTER);

		
		// 버튼
		ButtonPanel = new JPanel();
		ButtonPanel.setLayout(new BoxLayout(ButtonPanel, BoxLayout.Y_AXIS));
		// 이미지 크기 조정
		ImageIcon icon = new ImageIcon(getClass().getResource("/images/barcode2.png"));
		Image image = icon.getImage().getScaledInstance(350, 100, Image.SCALE_DEFAULT);
		ImageIcon resizedIcon = new ImageIcon(image);

		// 이미지를 JLabel에 추가
		JLabel img = new JLabel(resizedIcon);
		img.setHorizontalAlignment(JLabel.CENTER);
		ButtonPanel.add(img);
        
        cancel = new JButton("예매 취소");
        cancel.setFont(new Font("돋움", Font.BOLD, 15)); 
        cancel.setPreferredSize(new Dimension(50, 30)); 
        ButtonPanel.add(cancel);
        
        add(ButtonPanel, BorderLayout.SOUTH);
		
		add(cancel, BorderLayout.SOUTH);

		add(NorthPanel, BorderLayout.NORTH);
		add(CenterPanel, BorderLayout.CENTER);

		MainPanel = new JPanel(new BorderLayout());
		MainPanel.add(NorthPanel, BorderLayout.NORTH);
		MainPanel.add(CenterPanel, BorderLayout.CENTER);
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