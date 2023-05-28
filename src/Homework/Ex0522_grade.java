package Homework;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex0522_grade extends JFrame implements ActionListener{
	
	JPanel jp1,jp2,jp3,jp4;
	JLabel name, kor, eng, math;
	JTextField jtf1, jtf2, jtf3, jtf4;
	JTextArea jta;
	JScrollPane jsp;
	JButton jb1, jb2, jb3;
	
	
	public Ex0522_grade() {
		super("성적");
		
		//첫 줄
		jp1 = new JPanel();
		
		name = new JLabel("이 름: ");
		jtf1 = new JTextField(10);
		
		jp1.add(name);
		jp1.add(jtf1);
		
		
		//둘째 줄
		jp2 = new JPanel();
		
		kor = new JLabel("국 어: ");
		jtf2 = new JTextField(10);
		eng = new JLabel("영 어: ");
		jtf3 = new JTextField(10);
		math = new JLabel("수 학: ");
		jtf4 = new JTextField(10);
		
		jp2.add(kor);
		jp2.add(jtf2);
		jp2.add(eng);
		jp2.add(jtf3);
		jp2.add(math);
		jp2.add(jtf4);

		
		//텍스트창
		jta = new JTextArea(10,0);
		jta.setLineWrap(true);
		jta.setEditable(false);
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		//마지막 줄
		jp3 = new JPanel();
		
		jb1 = new JButton("계 산");
		jb2 = new JButton("종 료");
		jb3 = new JButton("초기화");
		
		jp3.add(jb1);
		jp3.add(jb2);
		jp3.add(jb3);
		
		//패널에 모으기(패널2, jsp, 패널3)
		jp4 = new JPanel();
		jp4.setLayout(new BorderLayout());
		jp4.add(jp2, BorderLayout.NORTH);
		jp4.add(jsp,BorderLayout.CENTER);
		jp4.add(jp3, BorderLayout.SOUTH);
		
		add(jp1,BorderLayout.NORTH);
		add(jp4,BorderLayout.CENTER);
		
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton)e.getSource();
		
		if(obj == jb1) {
			int korNum = Integer.parseInt(jtf2.getText());
			int engNum = Integer.parseInt(jtf3.getText());
			int mathNum = Integer.parseInt(jtf4.getText());
			int sum = korNum + engNum + mathNum;
			double avg = (sum/3.0);
			String hak;
			if (avg >= 90) {
				hak = "A학점";
			}else if(avg >= 80) {
				hak = "B학점";
			}else if(avg >= 70) {
				hak = "C학점";
			}else {
				hak = "F학점";
			}
			
			jta.append("이름 : " + jtf1.getText() + "\n");
			jta.append("총점 : " + sum + "\n");
			jta.append("평균 : " + (int)(avg*10)/10.0 + "\n");
			jta.append("학점 : " + hak + "\n");
			
			
		}else if(obj == jb2) {
			System.exit(0);
		}else if(obj == jb3) {
			jtf1.setText("");
			jtf2.setText("");
			jtf3.setText("");
			jtf4.setText("");
			jta.setText("");
		}
		
	}
	
public static void main(String[] args) {
	new Ex0522_grade();
}
}
