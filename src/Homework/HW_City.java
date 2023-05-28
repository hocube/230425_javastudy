package Homework;

import java.awt.BorderLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class HW_City extends JPanel {
	HW_CardLayout mainFrame;
	JPanel jp;
	JTextField jtf;
	JButton jb1, jb2, back;
	JTextArea jta;
	JScrollPane jsp;

	public HW_City(HW_CardLayout mainFrame) {
		this.mainFrame = mainFrame;
		// 첫 줄
		jp = new JPanel();
		jtf = new JTextField(15);
		jb1 = new JButton("확인");
		jb2 = new JButton("취소");
		back = new JButton("뒤로가기");

		jp.add(new JLabel("나라 입력: "));
		jp.add(jtf);
		jp.add(jb1);
		jp.add(jb2);
		jp.add(back);

		// 텍스트 부분
		jta = new JTextArea(10, 30);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);

		// 붙이기
		add(jp, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);

		jtf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dataPrn();
			}
		});

		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dataPrn();
			}
		});

		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtf.setText("");
				jta.setText("");
				// 커서 위치 지정
				jtf.requestFocus();
			}
		});
		
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				mainFrame.cardLayout.show(mainFrame.pg1, "main");
			}
		});

	}

	// 위에 중복되는 코드가 있으므로 메서드를 만들자
	public void dataPrn() {
		// map 정보
		HashMap<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");

		// key 관리
		Set<String> keys = map.keySet();

		// 입력을 안하고 엔터쳤을 때. 길이가 0
		if (jtf.getText().length() == 0) {
			jta.append("데이터를 입력하세요.\n");
			// 커서 위치 지정
			jta.requestFocus();
		} else {
			String str = jtf.getText().trim();
			// 혹시 있을 앞뒤 공백 제거
			// 입력한 값이 key 값에 있는지 검사
			if (keys.contains(str)) {
				// 사용자가 입력한 값을 넣고 확인
				// key를 누르면 value가 온다.
				String city = map.get(str);
				jta.append(str + "의 수도는 " + city + " 입니다.\n");
			} else {
				jta.append("데이터에 없는 나라입니다.\n");
			}
			// 입력 후 엔터치면 jtf창 리셋됨.
			jtf.setText("");
			jtf.requestFocus();
		}
	}
}