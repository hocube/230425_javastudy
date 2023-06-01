package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

//D:/PJH/test02.txt
//jta에 불러오기.
public class Ex05_File_Open extends JFrame {
	JPanel jp1;
	JTextField jtf;
	JLabel jl;
	JButton jb;
	JTextArea jta;

	public Ex05_File_Open() {
		super("불러오기");

		jp1 = new JPanel();
		jl = new JLabel("파일 경로");
		jtf = new JTextField(20);
		jb = new JButton("읽기");

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
				FileInputStream fis = null;
				File file = new File(pathname);
				BufferedInputStream bis = null;

				try {
					fis = new FileInputStream(file);
					bis = new BufferedInputStream(fis);

					byte[] b = new byte[(int) file.length()];
					bis.read(b);

					String msg = new String(b);
					jta.setText(msg);

				} catch (Exception e1) {
				} finally {
					try {
						bis.close();
						fis.close();
					} catch (Exception e2) {
					}
				}
			}
		});

	}

	public static void main(String[] args) {
		new Ex05_File_Open();

	}
}