package day25.com.ict.edu;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex06_homework extends JFrame{
	JPanel jp1, jp2;
	JLabel jl1, jl2, jl3, jl4;
	JTextField jtf1, jtf2, jtf3, jtf4;
	JButton jb1, jb2, jb3, jb4, jb5, jb6;
	JTextArea jta;
	
	public Ex06_homework() {
		super("DB 연동 정보");
		
		jp1 = new JPanel();
		jl1 = new JLabel("CUSTID : ");
		jl2 = new JLabel("NAME : ");
		jl3 = new JLabel("ADDRESS : ");
		jl4 = new JLabel("PHONE : ");
		jtf1 = new JTextField(20);
		jtf2 = new JTextField(20);
		jtf3 = new JTextField(20);
		jtf4 = new JTextField(20);
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
public static void main(String[] args) {
	new Ex06_homework();
}
}
