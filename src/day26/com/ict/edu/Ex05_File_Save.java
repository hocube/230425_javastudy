package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

//D:/PJH/exam01.txt
//jta에 불러오기.
public class Ex05_File_Save extends JFrame {
	JPanel jp1;
	JTextField jtf;
	JLabel jl;
	JButton jb;
	JTextArea jta;

	public Ex05_File_Save() {
		super("저장하기");

		jp1 = new JPanel();
		jl = new JLabel("파일 경로");
		jtf = new JTextField(20);
		jb = new JButton("SAVE");

		jp1.add(jl);
		jp1.add(jtf);
		jp1.add(jb);

		jta = new JTextArea();
		jta.setEditable(true);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		add(jp1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);

		setSize(500, 500);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String pathname = jtf.getText();
				FileOutputStream fos = null;
				File file = new File(pathname);
				BufferedOutputStream bos = null;

				try {
					fos = new FileOutputStream(file, true);
					bos = new BufferedOutputStream(fos);
					String msg = jta.getText();

					byte[] b = msg.getBytes();
					bos.write(b);
					bos.flush();

				} catch (Exception e1) {
				} finally {
					try {
						bos.close();
						fos.close();
					} catch (Exception e2) {
					}
				}
			}
		});

	}

	public static void main(String[] args) {
		new Ex05_File_Save();

	}
}
