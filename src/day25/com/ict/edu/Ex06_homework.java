package day25.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.ScrollPane;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class Ex06_homework extends JFrame {
	JPanel pg1, jp1, jp2, jp3, jp4, jp5, lbpanel, tfpanel;
	JLabel jl1, jl2, jl3, jl4;
	JTextField jtf1, jtf2, jtf3, jtf4;
	JButton jb1, jb2, jb3, jb4, jb5, jb6;
	JTextArea jta;

	public Ex06_homework() {
		super("DB 연동 정보");
		// 위에 4줄
		pg1 = new JPanel();
		pg1.setLayout(new BoxLayout(pg1, BoxLayout.Y_AXIS));

		jp1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jl1 = new JLabel("CUSTID :                        ");
		jtf1 = new JTextField(20);
		jp1.add(jl1);
		jp1.add(jtf1);

		jp2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jl2 = new JLabel("NAME :                         ");
		jtf2 = new JTextField(20);
		jp2.add(jl2);
		jp2.add(jtf2);

		jp3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jl3 = new JLabel("ADDRESS :                      ");
		jtf3 = new JTextField(20);
		jp3.add(jl3);
		jp3.add(jtf3);

		jp4 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jl4 = new JLabel("PHONE :                        ");
		jtf4 = new JTextField(20);
		jp4.add(jl4);
		jp4.add(jtf4);

		pg1.add(jp1);
		pg1.add(jp2);
		pg1.add(jp3);
		pg1.add(jp4);

		// 텍스트창
		jta = new JTextArea();
		jta.setEditable(true);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		// 버튼 6개
		jp5 = new JPanel();

		jb1 = new JButton("전체보기");
		jb2 = new JButton("삽입");
		jb3 = new JButton("삭제");
		jb4 = new JButton("검색");
		jb5 = new JButton("불러오기");
		jb6 = new JButton("고치기");

		jp5.add(jb1);
		jp5.add(jb2);
		jp5.add(jb3);
		jp5.add(jb4);
		jp5.add(jb5);
		jp5.add(jb6);

		add(pg1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp5, BorderLayout.SOUTH);

		// pack();
		setSize(500, 500);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Ex06_homework();
	}
}
