package day18.co.ict.edu2;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

//그리드 사용
public class Ex05_Join extends JFrame {
	public Ex05_Join() {
		super("회원가입");
		
		//1~6줄 까지 넣어줄 패널
		JPanel pg1 = new JPanel(new GridLayout(6,1));
		
		// 첫번째 줄
		JPanel jp1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
											  //JPanel을 왼쪽 정렬할 때 사용

		JTextField name = new JTextField(10);
		JRadioButton man = new JRadioButton("남");
		JRadioButton woman = new JRadioButton("여");
		ButtonGroup bg = new ButtonGroup();

		bg.add(man);
		bg.add(woman);

		jp1.add(new JLabel("이 름 : "));
		jp1.add(name);
		jp1.add(new JLabel("성 별 : "));
		jp1.add(man);
		jp1.add(woman);

		// 두번째 줄
		JPanel jp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JTextField birth = new JTextField(10);

		jp2.add(new JLabel("생년월일: "));
		jp2.add(birth);

	

		// 세번째 줄
		JPanel jp3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JTextField addr = new JTextField(10);
		
		jp3.add(new JLabel("주 소: "));
		jp3.add(addr);
		
		
		
		
		//네번째 줄
		JPanel jp4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		String[] items = {"부 서", "기획부", "총무부", "홍보부", "생산부"};
		JComboBox<String> jcom = new JComboBox<>(items);
		
		jp4.add(new JLabel("부 서 명 : "));
		jp4.add(jcom);
		
	
		
		//다섯번째 줄
		JPanel jp5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JCheckBox jb1 = new JCheckBox(" 운 동 ");
		JCheckBox jb2 = new JCheckBox(" 영 화 ");
		JCheckBox jb3 = new JCheckBox(" 독 서 ");
		JCheckBox jb4 = new JCheckBox(" 컴퓨터 ");
		
		jp5.add(new JLabel("취 미 : "));
		jp5.add(jb1);
		jp5.add(jb2);
		jp5.add(jb3);
		jp5.add(jb4);		
	
		
		//여섯번째 줄
		JPanel jp6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jp6.add(new JLabel("자 기 소개: "));
		JTextArea jta = new JTextArea(10,0);
		
		//자동 줄 바꿈
		jta.setLineWrap(true);
		//편집 불가능하게 하는거
		jta.setEditable(true);
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		//일곱번째 줄
		JPanel jp7 = new JPanel();
		JButton jb20 = new JButton("저 장");
		JButton jb21 = new JButton("종 료");
		JButton jb22 = new JButton("취 소");
		
		jp7.add(jb20);
		jp7.add(jb21);
		jp7.add(jb22);
		
		
		pg1.add(jp1);
		pg1.add(jp2);
		pg1.add(jp3);
		pg1.add(jp4);
		pg1.add(jp5);
		pg1.add(jp6);
		
		add(pg1,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		add(jp7,BorderLayout.SOUTH);
		
		
		pack(); // 자기 크기에 맞춰서 출력
		setLocationRelativeTo(null);
		//Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		//setBounds(ds.width/2-200, ds.height/2-200, 400, 400); //내가 크기 지정
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Ex05_Join();
	}
}