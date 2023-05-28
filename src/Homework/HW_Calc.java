package Homework;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class HW_Calc extends JPanel implements ActionListener, ItemListener {
	HW_CardLayout mainFrame;
	JPanel jp1, jp2;
	JLabel jl1, jl2, jl3;
	JTextField su1, su2;
	JRadioButton jrb1, jrb2, jrb3, jrb4;
	ButtonGroup bg;
	JTextArea jta;
	JButton jb1, jb2, jb3, back;
	String oper = "";

	public HW_Calc(HW_CardLayout mainFrame) {
		this.mainFrame = mainFrame;
		// 첫 줄
		jp1 = new JPanel();

		jl1 = new JLabel("수1: ");
		su1 = new JTextField(5);
		jl2 = new JLabel("수3: ");
		su2 = new JTextField(5);
		jl3 = new JLabel("연산자: ");
		jrb1 = new JRadioButton(" + ");
		jrb2 = new JRadioButton(" - ");
		jrb3 = new JRadioButton(" * ");
		jrb4 = new JRadioButton(" / ");

		jp1.add(jl1);
		jp1.add(su1);
		jp1.add(jl2);
		jp1.add(su2);
		jp1.add(jl3);
		jp1.add(jrb1);
		jp1.add(jrb2);
		jp1.add(jrb3);
		jp1.add(jrb4);

		bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);

		// 텍스트 창
		jta = new JTextArea(5, 10);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jsp.setPreferredSize(new Dimension(400, 200));
		jta.setLineWrap(true);
		jta.setEditable(false);

		// 셋째 줄
		jp2 = new JPanel();

		jb1 = new JButton("계산");
		jb2 = new JButton("종료");
		jb3 = new JButton("초기화");
		back = new JButton("뒤로가기");

		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
		jp2.add(back);

		add(jp1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp2, BorderLayout.SOUTH);


		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		back.addActionListener(this);

		jrb1.addItemListener(this);
		jrb2.addItemListener(this);
		jrb3.addItemListener(this);
		jrb4.addItemListener(this);

	}

	// 라디오 버튼
	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == e.SELECTED) {
			JRadioButton obj1 = new JRadioButton();
			obj1 = (JRadioButton)e.getSource();
			oper = obj1.getText();
		}
	}

	// 버튼
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton) e.getSource();

		if (obj == jb1) {
			int num1 = Integer.parseInt(su1.getText());
			int num2 = Integer.parseInt(su2.getText());
			int res = 0;

			if (" + ".equals(oper)) {
				res = num1 + num2;
			} else if (" - ".equals(oper)) {
				res = num1 - num2;
			} else if (" * ".equals(oper)) {
				res = num1 * num2;
			} else if (" / ".equals(oper)) {
				res = num1 / num2;
			}
			jta.append(num1 + oper + num2 + "=" + res + "\n");
		} else if (obj == jb2) {
			System.exit(0);
		} else if (obj == jb3) {
			su1.setText("");
			su2.setText("");
			jta.setText("");
		} else if (obj == back) {
			mainFrame.cardLayout.show(mainFrame.pg1, "main");
		}
	}
}