package day26.com.ict.edu;

//D:/PJH/exam01.txt
//jta에 불러오기.

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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

public class Ex05_File_Save extends JFrame {
	JPanel jp1;
	JTextField jtf;
	JLabel jl;
	JButton jb;
	JTextArea jta;
	JScrollPane jsp;

	public Ex05_File_Save() {
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
				f_save();

			}
		});

		jtf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		// 마우스 클릭
		jtf.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "저장하기", FileDialog.SAVE);
				fd.setVisible(true);
				String msg = fd.getDirectory() + fd.getFile();
				System.out.println(msg);
				if (!msg.equals("nullnull")) { // nullnull이 아닐 때만
					jtf.setText(msg); // 이렇게 해야지만 취소를 눌렀을 때와 이름 없이 저장 눌렀을 때
										// 콘솔창에 아무 반응 안한다.
				}
			}
		});

	}

	private void f_save() {
		String pathname = jtf.getText().trim();
		if (pathname.length() > 0) {
			File file = new File(pathname);
			FileOutputStream fos = null;
			BufferedOutputStream bos = null;
			try {
				fos = new FileOutputStream(file);
				bos = new BufferedOutputStream(fos);

				String msg = jta.getText().trim();
				bos.write(msg.getBytes());
				bos.flush();

			} catch (Exception e) {
			} finally {
				try {
					bos.close();
					fos.close();
				} catch (Exception e2) {
				}
			}
		}
	}

	public static void main(String[] args) {
		new Ex05_File_Save();
	}
}