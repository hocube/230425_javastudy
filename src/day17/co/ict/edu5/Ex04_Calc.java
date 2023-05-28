package day17.co.ict.edu5;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex04_Calc extends JFrame {
	public Ex04_Calc() {
		super("카페 주문");

		// 첫 줄
		JPanel np1 = new JPanel();
		JLabel jl1 = new JLabel("원하는 음료 선택하세요");
		np1.add(jl1);

		// 둘째 줄
		JPanel np2 = new JPanel();
		JRadioButton jrb1 = new JRadioButton();
		jrb1.setText("아메리카노(3000)");

		JRadioButton jrb2 = new JRadioButton("카페모카(4000)");
		JRadioButton jrb3 = new JRadioButton("카페라떼(3500)");
		JRadioButton jrb4 = new JRadioButton("과일쥬스(3000)");

		np2.add(jrb1);
		np2.add(jrb2);
		np2.add(jrb3);
		np2.add(jrb4);

		// 셋째 줄
		JPanel np3 = new JPanel();
		JLabel jL1 = new JLabel("수량 : ");
		JTextField jtf1 = new JTextField(10);
		JLabel jL2 = new JLabel("입금액 : ");
		JTextField jtf2 = new JTextField(10);

		np3.add(jL1);
		np3.add(jtf1);
		np3.add(jL2);
		np3.add(jtf2);

		// 첫째, 둘째, 셋째 줄 하나의 패널에 넣기
		JPanel npanel = new JPanel();
		npanel.setLayout(new BorderLayout());
		npanel.add(np1, BorderLayout.NORTH);
		npanel.add(np2, BorderLayout.CENTER);
		npanel.add(np3, BorderLayout.SOUTH);

		// 가운데
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jta.setEditable(false);

		// 마지막
		JPanel sp = new JPanel();

		JButton jb1 = new JButton("계 산");
		JButton jb2 = new JButton("종 료");
		JButton jb3 = new JButton("취 소");

		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);

		add(npanel, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(sp, BorderLayout.SOUTH);

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Ex04_Calc();
	}
}
