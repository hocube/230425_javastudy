package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex07_File_Copy extends JFrame{
	JPanel jp1, jp2;
	JTextField jtf1, jtf2;
	JLabel jl1, jl2;
	JButton jb;
	
	public Ex07_File_Copy() {
		super("복사하기");
		
		jp1 = new JPanel();
		jp1.setLayout(new FlowLayout(FlowLayout.LEFT));
		jl1 = new JLabel("원본위치 : ");
		jtf1 = new JTextField(20);
		
		jp1.add(jl1);
		jp1.add(jtf1);
		
		
		jp2 = new JPanel();
		jp2.setLayout(new FlowLayout(FlowLayout.LEFT));
		jl2 = new JLabel("사본위치:");
		jtf2 = new JTextField(20);
		jb = new JButton("복사하기");
		
		jp2.add(jl2);
		jp2.add(jtf2);
		jp2.add(jb);
		
		add(jp1, BorderLayout.NORTH);
		add(jp2, BorderLayout.SOUTH);
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				f_copy();
			}
		});
	}
	private void f_open() {
		String pathname = jtf1.getText().trim();
		if(pathname.length() > 0) {
			File file = new File(pathname);
			FileInputStream fis = null;
			BufferedInputStream bis = null;
			try {
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				
				byte[] b = new byte[(int) file.length()];
				bis.read(b);
				String msg = new String(b).trim();
				jtf1.setText(msg);
			} catch (Exception e) {
			}finally {
				try {
					bis.close();
					fis.close();
				} catch (Exception e2) {
				}
			}
		}
	}
	
	private void f_copy() {
		String pathname = jtf2.getText().trim();
		if (pathname.length() > 0) {
			File file = new File(pathname);
			FileOutputStream fos = null;
			BufferedOutputStream bos = null;
			try {
				fos = new FileOutputStream(file);
				bos = new BufferedOutputStream(fos);

				String msg = jtf2.getText().trim();
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
	new Ex07_File_Copy();
}
}
