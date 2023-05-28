package day17.co.ict.edu5;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

//콤보박스
public class Ex01_Calc extends JFrame {
	public Ex01_Calc() {
		super("계산기3");

		// 첫번째
		JPanel np = new JPanel();

		JLabel jl1 = new JLabel("수1: ");
		JTextField jtf1 = new JTextField(5);
		JLabel jl2 = new JLabel("수2: ");
		JTextField jtf2 = new JTextField(5);
		JLabel jl3 = new JLabel("연산자: ");

		// 콤보박스
		String[] oper = { "선택하세요", "+", "-", "*", "/" };
		JComboBox<String> jcom = new JComboBox<>(oper);

		jcom.setSelectedIndex(0);

		// 패널에 버튼 붙이기
		np.add(jl1);
		np.add(jtf1);
		np.add(jl2);
		np.add(jtf2);
		np.add(jl3);
		np.add(jcom);

		// 두번째꺼
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		// 편집 불가
		jta.setEditable(false);

		// 세번째꺼
		JPanel sp = new JPanel();

		JButton jb1 = new JButton("계 산");
		JButton jb2 = new JButton("종 료");
		JButton jb3 = new JButton("취 소");

		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);

		// 프레임에 패널 붙이기
		add(np, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(sp, BorderLayout.SOUTH);

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Ex01_Calc();
	}
}
