package day20.com.ict.edu3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

// 0530~0531
// CUSTID : , NAME : , ADDRESS : , PHONE :
// JTA
// 전체보기 삽입 삭제 검색 불러오기 고치기

public class L extends JFrame {
	JPanel jp, jpBtn, jpId, jpName, jpAddr, jpPhone;
	JLabel jlId, jName, jlAddr, jlPhone;
	JTextField jtfId, jtfName, jtfAddr, jtfPhone;
	JTextArea jta;
	JButton jb1, jb2, jb3, jb4, jb5, jb6;

	public L() {
		super("DB 연동 정보");

		jp = new JPanel(new GridLayout(4, 2, -7, -7));

		jpId = new JPanel();
		jlId = new JLabel("CUSTID : ");
		jpId.setLayout(new FlowLayout(FlowLayout.RIGHT));
		jpId.add(jlId);

		jtfId = new JTextField(30);
		jpId.add(jtfId);

		jpName = new JPanel();
		jName = new JLabel("NAME : ");
		jpName.setLayout(new FlowLayout(FlowLayout.RIGHT));
		jpName.add(jName);

		jtfName = new JTextField(30);
		jpName.add(jtfName);

		jpAddr = new JPanel();
		jlAddr = new JLabel("ADDRESS : ");
		jpAddr.setLayout(new FlowLayout(FlowLayout.RIGHT));
		jpAddr.add(jlAddr);

		jtfAddr = new JTextField(30);
		jpAddr.add(jtfAddr);

		jpPhone = new JPanel();
		jlPhone = new JLabel("PHONE : ");
		jpPhone.setLayout(new FlowLayout(FlowLayout.RIGHT));
		jpPhone.add(jlPhone);

		jtfPhone = new JTextField(30);
		jpPhone.add(jtfPhone);

		jlId.setHorizontalAlignment(JLabel.CENTER);
		jName.setHorizontalAlignment(JLabel.CENTER);
		jlAddr.setHorizontalAlignment(JLabel.CENTER);
		jlPhone.setHorizontalAlignment(JLabel.CENTER);
		
		jp.add(jlId);
		jp.add(jpId);
		jp.add(jName);
		jp.add(jpName);
		jp.add(jlAddr);
		jp.add(jpAddr);
		jp.add(jlPhone);
		jp.add(jpPhone);

		JTextArea jta = new JTextArea(29, 52);
		jta.setLineWrap(true);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setSize(getPreferredSize());
		// 편집 불가능하게 만들자
		jta.setEditable(false);

		jpBtn = new JPanel();
		jb1 = new JButton("전체보기");
		jb2 = new JButton("삽입");
		jb3 = new JButton("삭제");
		jb4 = new JButton("검색");
		jb5 = new JButton("불러오기");
		jb6 = new JButton("고치기");

		jpBtn.add(jb1);
		jpBtn.add(jb2);
		jpBtn.add(jb3);
		jpBtn.add(jb4);
		jpBtn.add(jb5);
		jpBtn.add(jb6);

		add(jp, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jpBtn, BorderLayout.SOUTH);

		pack();
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new L();
	}
}
