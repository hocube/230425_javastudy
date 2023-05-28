package day17.co.ict.edu5;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex03_Calc extends JFrame {
	public Ex03_Calc() {
		super("성적계산");

		// 첫번째
		JPanel np = new JPanel();

		np.setLayout(new FlowLayout());
		JLabel jl1 = new JLabel("이름");
		JTextField jtf1 = new JTextField(10);

		// 패널에 버튼 붙이기
		np.add(jl1);
		np.add(jtf1);

		JPanel np2 = new JPanel();
		np2.setLayout(new FlowLayout());
		JLabel jl2 = new JLabel("국어");
		JTextField jtf2 = new JTextField(10);
		JLabel jl3 = new JLabel("영어");
		JTextField jtf3 = new JTextField(10);
		JLabel jl4 = new JLabel("수학");
		JTextField jtf4 = new JTextField(10);

		// 패널에 버튼 붙이기
		np2.add(jl2);
		np2.add(jtf2);
		np2.add(jl3);
		np2.add(jtf3);
		np2.add(jl4);
		np2.add(jtf4);

		// 이름, 국어, 영어, 수학, 한번에 들어갈 패널 생성
		JPanel npanel = new JPanel();
		npanel.setLayout(new BorderLayout());

		npanel.add(np, BorderLayout.NORTH);
		npanel.add(np2, BorderLayout.SOUTH);

		// 두번째
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		// 편집 불가
		jta.setEditable(false);

		// 세번째

		JPanel sp = new JPanel();

		JButton jb1 = new JButton("계 산");
		JButton jb2 = new JButton("종 료");
		JButton jb3 = new JButton("취 소");

		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);

		// 프레임에 붙이기
		add(npanel, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(sp, BorderLayout.SOUTH);

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Ex03_Calc();
	}
}