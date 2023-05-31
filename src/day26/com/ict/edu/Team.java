package day26.com.ict.edu;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Team extends JFrame{
	JPanel jp1, jp2, jp3, jp4, jp5, pg1, jp6, jp7, jp8;
	JTextField jtf1, jtf2, jtf3, jtf4, jtf5, jtf6;
	JLabel jl1, jl2, jl3, jl4, jl5, jl6;
	JButton jb1, jb2, jb3, jb4, jb5, jb6;
	JComboBox jcom;
	
	public Team() {
		super("");
		
		jp1 = new JPanel();
		jl1 = new JLabel("Address Book");
		jp1.add(jl1);
		
		jp2 = new JPanel();
		jl2 = new JLabel("ID: ");
		jtf1 = new JTextField(10);
		jp2.add(jl2);
		jp2.add(jtf1);
		
		jp3 = new JPanel();
		jl3 = new JLabel("이름: ");
		jtf2 = new JTextField(10);
		jp3.add(jl3);
		jp3.add(jtf2);
		
		jp4 = new JPanel();
		jl4 = new JLabel("전화: ");
		jtf3 = new JTextField(10);
		jp4.add(jl4);
		jp4.add(jtf3);
		
		jp5 = new JPanel();
		jl5 = new JLabel("주소: ");
		jtf4 = new JTextField(10);
		jp5.add(jl5);
		jp5.add(jtf4);
		
		jp6 = new JPanel();
		jl6 = new JLabel("회사: ");
		jtf5 = new JTextField(10);
		jp6.add(jl6);
		jp6.add(jtf5);
		
		pg1.add(jp2);
		pg1.add(jp3);
		pg1.add(jp4);
		pg1.add(jp5);
		pg1.add(jp6);
		
	}
public static void main(String[] args) {
	new Team();
}
}
