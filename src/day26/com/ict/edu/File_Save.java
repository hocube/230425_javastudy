package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class File_Save extends JFrame {
	JPanel jp1;
	JTextField jtf;
	JLabel jl;
	JButton jb;
	JTextArea jta;
	JScrollPane jsp;

	public File_Save() {
		super("저장하기");

		jp1 = new JPanel();
		jtf = new JTextField(20);
		jb = new JButton("SAVE");
		jta = new JTextArea();
		jta.setEditable(true);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);

		jp1.add(new JLabel("파일경로 : "));
		jp1.add(jtf);
		jp1.add(jb);

		add(jp1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);

		setSize(500, 500);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		jtf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		jtf.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			FileDialog fd = new FileDialog((Frame)getParent(), "저장하기", FileDialog.SAVE);
			fd.setVisible(true);
			
		}
		});
		
	}

	public static void main(String[] args) {
		new Ex05_File_Save();
	}
}