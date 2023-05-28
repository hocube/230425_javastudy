package day17.co.ict.edu5;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex05_Calc extends JFrame {
	public Ex05_Calc() {
		super("회원가입");

		// 첫 줄
		JPanel np1 = new JPanel();
		np1.setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel jl1 = new JLabel("이름 : ");
		JTextField jtf1 = new JTextField(10);
		
		JLabel jl2 = new JLabel(" 성별 : ");
		JRadioButton jrb1 = new JRadioButton();
		jrb1.setText("남자");
		JRadioButton jrb2 = new JRadioButton("여자");
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);

		np1.add(jl1);
		np1.add(jtf1);
		np1.add(jl2);
		np1.add(jrb1);
		np1.add(jrb2);

		// 둘째 줄
		JPanel np2 = new JPanel();
		np2.setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel j13 = new JLabel("생년월일 : ");
		JTextField jtf2 = new JTextField(15);

		np2.add(j13);
		np2.add(jtf2);

		// 셋째 줄
		JPanel np3 = new JPanel();
		np3.setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel j14 = new JLabel("주  소 : ");
		JTextField jtf3 = new JTextField(20);

		np3.add(j14);
		np3.add(jtf3);

		// 첫째, 둘째, 셋째 줄 한 패널에 넣기 : npanel1
		JPanel npanel1 = new JPanel();
		npanel1.setLayout(new FlowLayout(FlowLayout.LEFT));
		npanel1.setLayout(new BorderLayout());
		npanel1.add(np1, BorderLayout.NORTH);
		npanel1.add(np2, BorderLayout.CENTER);
		npanel1.add(np3, BorderLayout.SOUTH);

		
		
		
		
		
		// 두번째 패널 첫째 줄
		JPanel np4 = new JPanel();
		np4.setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel jl5 = new JLabel("부 서 명 : ");
		String[] team = { "부서", "기획", "관리", "영업", "생산" };
		JComboBox<String> jcom = new JComboBox<>(team);
		jcom.setSelectedIndex(0);

		np4.add(jl5);
		np4.add(jcom);

		
		// 두번째 패널 둘째 줄
		JPanel np5 = new JPanel();
		np5.setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel jl6 = new JLabel("취 미 : ");

		JCheckBox jcb1 = new JCheckBox();
		jcb1.setText("운동");
		JCheckBox jcb2 = new JCheckBox("영화");
		JCheckBox jcb3 = new JCheckBox("독서");
		JCheckBox jcb4 = new JCheckBox("컴퓨터");

		np5.add(jl6);
		np5.add(jcb1);
		np5.add(jcb2);
		np5.add(jcb3);
		np5.add(jcb4);

		
		// 두번째 패널 셋째 줄
		JPanel np6 = new JPanel();
		np6.setLayout(new FlowLayout(FlowLayout.LEFT));
		JLabel jl7 = new JLabel("자 기 소 개");
		np6.add(jl7);

		
		
		// 두번째 패널 첫째, 둘째, 셋째 줄 한 패널에 넣기 : npanel2
		JPanel npanel2 = new JPanel();
		npanel2.setLayout(new BorderLayout());
		npanel2.add(np4, BorderLayout.NORTH);
		npanel2.add(np5, BorderLayout.CENTER);
		npanel2.add(np6, BorderLayout.SOUTH);

		// 첫번째 두번째 패널을 다시 또 한 패널에 넣기 : npanel12
		JPanel npanel12 = new JPanel();
		npanel12.setLayout(new BorderLayout());
		npanel12.add(npanel1, BorderLayout.NORTH);
		npanel12.add(npanel2, BorderLayout.SOUTH);

		// 가운데 칸
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true);
		JScrollPane jsp = new JScrollPane(jta, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jta.setEditable(false);

		// 맨 밑
		JPanel sp = new JPanel();
		JButton jb1 = new JButton("저 장");
		JButton jb2 = new JButton("종 료");
		JButton jb3 = new JButton("취 소");

		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);

		add(npanel12, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(sp, BorderLayout.SOUTH);

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Ex05_Calc();
	}
}
