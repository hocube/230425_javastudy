package Team_Project;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

public class TicketList extends JFrame {
	JPanel Panel;
	JTable table;
	JButton ticketButton;

	public TicketList() {
		super("티켓 리스트");

		Panel = new JPanel(new BorderLayout());
		JPanel headerPanel = new JPanel(new BorderLayout());

		// "티켓 리스트" 라벨 추가
		JLabel titleLabel = new JLabel("티켓 리스트");
		titleLabel.setFont(new Font("굴림", Font.BOLD, 25));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER); // 가운데 정렬
		titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10)); // 여백 추가
		headerPanel.add(titleLabel, BorderLayout.NORTH);
		Panel.add(headerPanel, BorderLayout.NORTH);

		// JTable의 컬럼 이름 배열
		String[] columnNames = { "영화이름", "상영일자", "상영시간", "좌석" };

		// JTable의 초기 데이터 배열
		Object[][] data = { { "영화1", "2023-06-21", "10:00", "A1, A2, A3" },
				{ "영화2", "2023-06-22", "14:00", "B1, B2, B3" }, 
				{ "영화3", "2023-06-23", "18:00", "C1, C2, C3" },
				{ "영화4", "2023-06-24", "19:00", "D1, D2, D3" }};

		// DefaultTableModel을 사용하여 JTable 생성
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		table = new JTable(model);

		// JScrollPane을 사용하여 JTable을 스크롤 가능하도록 추가
		JScrollPane scrollPane = new JScrollPane(table);
		// JScrollPane의 크기를 조정
		scrollPane.setPreferredSize(new Dimension(800, 400));
		// JPanel에 JScrollPane 추가
		Panel.add(headerPanel, BorderLayout.NORTH);
		Panel.add(scrollPane, BorderLayout.CENTER);

		// "티켓 확인" 버튼 생성
		ticketButton = new JButton("티켓 확인");
		ticketButton.setFont(new Font("돋움", Font.BOLD, 20));
		Panel.add(ticketButton, BorderLayout.SOUTH);

		// JFrame에 Panel 추가
		add(Panel);

		setSize(350, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false); // 크기 조절 비활성화

		// "티켓 확인" 버튼의 ActionListener 등록
//        ticketButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // 티켓 확인 버튼이 클릭되었을 때의 동작 구현
//                int selectedRow = table.getSelectedRow();
//                if (selectedRow != -1) {
//                    String movieName = (String) table.getValueAt(selectedRow, 0);
//                    String screeningDate = (String) table.getValueAt(selectedRow, 1);
//                    String screeningTime = (String) table.getValueAt(selectedRow, 2);
//                    String seats = (String) table.getValueAt(selectedRow, 3);
//
//                    // 모바일 티켓 창을 열거나 해당 정보를 활용하는 동작을 구현
//                    openMobileTicketWindow(movieName, screeningDate, screeningTime, seats);
//                } else {
//                    JOptionPane.showMessageDialog(null, "티켓을 선택해주세요.", "오류", JOptionPane.ERROR_MESSAGE);
//                }
//            }
//        });

	}

	public static void main(String[] args) {
		new TicketList();
	}
}
