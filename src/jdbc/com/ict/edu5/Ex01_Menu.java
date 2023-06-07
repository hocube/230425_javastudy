package jdbc.com.ict.edu5;

import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

//메뉴 : 메뉴바, 메뉴, 메뉴 아이템
//메뉴바에 메뉴를 붙인다. 메뉴에 메뉴 아이템을 붙인다.
//메뉴아이템 > 메뉴 > 메뉴바 > 프레임 붙는다. 
//메뉴바는 프레임에 붙인다. (setJMenuBar) 
public class Ex01_Menu extends JFrame {
	JTextArea jta;
	JScrollPane jsp;
	JMenuBar jmb;
	JMenu m_file, m_form, m_help;
	JMenu font_form;
	JMenuItem i_newfile, i_openfile, i_savefile, i_exitfile, i_Item1, i_Item2, i_Item3, i_help, i_info;
	String deff;
	String openpath;

	public Ex01_Menu() {
		super("간단메모장");
		jta = new JTextArea();
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);

		// 메뉴바, 메뉴, 메뉴아이템 순서로 생성
		jmb = new JMenuBar();
		m_file = new JMenu(" 파 일 ");
		m_form = new JMenu(" 서 식 ");
		font_form = new JMenu("글자서식");
		m_help = new JMenu(" 도 움 말 ");

		i_newfile = new JMenuItem(" 새 파일 ");
		i_openfile = new JMenuItem(" 열 기 ..");
		i_savefile = new JMenuItem(" 저 장 ..");
		i_exitfile = new JMenuItem(" 종 료 ");
		i_Item1 = new JMenuItem(" 돋움 / 기울기 / 30");
		i_Item2 = new JMenuItem(" 궁서 / 굵게 / 40");
		i_Item3 = new JMenuItem(" 굴림 / 기본 / 20");
		i_help = new JMenuItem(" 도 움 말 ");
		i_info = new JMenuItem(" 메모장 정보 ");

		// 아이템을 메뉴에 붙이자
		m_file.add(i_newfile);
		m_file.add(i_openfile);
		m_file.addSeparator();
		m_file.add(i_savefile);
		m_file.addSeparator();
		m_file.add(i_exitfile);

		m_form.add(font_form);
		font_form.add(i_Item1);
		font_form.add(i_Item2);
		font_form.add(i_Item3);

		m_help.add(i_help);
		m_help.add(i_info);

		// 메뉴를 메뉴바에 붙이자
		jmb.add(m_file);
		jmb.add(m_form);
		jmb.add(m_help);

		// 메뉴바를 메뉴 프렝미에 붙인다.
		setJMenuBar(jmb);
		add(jsp);

		setSize(600, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		// 새파일먼저 액션리스너 이벤트 만들기

		i_newfile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 메모장안에 글자 존재여부
				int size = jta.getText().length();
				if (size == 0) {
					jta.setText("");
				} else {
					int res = JOptionPane.showOptionDialog(getParent(), "변경 내용을 제목 없음으로 저장하시겠습니까?", "간단 메모장",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
					if (res == 0) {
						// 실제저장하는 코드

					} else if (res == 1) {
						// 아니요 하는 코드
						jta.setText("");

					} else if (res == 2) {
						return;
						// 취소를 눌렸을경우는 되돌아가기
					}
				}
			}
		});

		// 열기
		i_openfile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 파일열기 다이얼로그
				FileDialog fd = new FileDialog((JFrame) getParent(), "파일열기^^", FileDialog.LOAD);
				fd.setVisible(true);
				// 실제불러오는 코딩 (I/O)
				openpath = fd.getDirectory() + fd.getFile();
				if (!openpath.equals("nullnull")) {

					File file = new File(openpath);
					FileReader fr = null;
					BufferedReader br = null;

					try {
						jta.setText("");
						fr = new FileReader(file);
						br = new BufferedReader(fr);

						String str = null;

						while ((str = br.readLine()) != null) {
							// not null 일때까지 읽어라
							jta.append(str + "\n");
							// readline 이므로 한 줄 읽고 줄바꾸고
							// 한줄 읽고 줄바꾸고 이다.
						}
						deff = jta.getText();

					} catch (Exception e2) {

					} finally {
						try {
							br.close();
							fr.close();
						} catch (Exception e3) {
							// TODO: handle exception
						}
					}
				}

			}
		});

		i_savefile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 파일 저장 다이얼로그
				FileDialog fd = new FileDialog((JFrame) getParent(), "파일저장^^", FileDialog.SAVE);
				fd.setVisible(true);
				// 실제불러오는 코딩 (I/O)
				String msg = fd.getDirectory() + fd.getFile();
				if (!msg.equals("nullnull"))
					;
				{
					File file = new File(msg);
					FileWriter fr = null;
					BufferedWriter br = null;
					try {
						fr = new FileWriter(file);
						br = new BufferedWriter(fr);
						String str = jta.getText();
						br.write(str);
						br.flush();

					} catch (Exception e2) {
						// TODO: handle exception
					} finally {
						try {
							br.close();
							fr.close();
						} catch (Exception e3) {
							// TODO: handle exception
						}
					}
				}

			}
		});

		i_exitfile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 원래는 내용이 변경되면 저장할지를 물어보고
				// 내용이 변경되지 않으면 그냥 종료
				if (deff.equals(jta.getText())) {
					System.exit(0);
				} else {
					// 파일 다시 저장하기 다이얼로그
					// 저장 , 저장안함, 취소 나옴
					int res = JOptionPane.showOptionDialog(getParent(), "변경 내용을 저장할까요?", "간단메모장",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);

					if (res == 0) {

						File file = new File(openpath);
						FileWriter fr = null;
						BufferedWriter br = null;
						try {
							fr = new FileWriter(file);
							br = new BufferedWriter(fr);
							String str = jta.getText();
							br.write(str);
							br.flush();
							System.exit(0);
						} catch (Exception e2) {
							// TODO: handle exception
						} finally {
							try {
								br.close();
								fr.close();
							} catch (Exception e3) {
								// TODO: handle exception
							}
						}

					} else if (res == 1) {
						System.exit(0);
					} else {
						return;
					}
				}
			}
		});

		i_Item1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 돋음 기울기 30
				// Font font = new Font(글꼴, 스타일, 사이즈);
				Font font = new Font("돋움", Font.ITALIC, 30);
				jta.setFont(font);
			}
		});

		i_Item2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 궁서 굵게 40
				Font font = new Font("궁서", Font.BOLD, 40);
				jta.setFont(font);

			}
		});

		i_Item3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 굴림 기본 20
				Font font = new Font("굴림", Font.PLAIN, 20);
				jta.setFont(font);

			}
		});

		i_help.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 메세지창 호출
				JOptionPane.showMessageDialog(getParent(), " 도 움 말 ");

			}
		});

		i_info.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 메세지창 호출
				JOptionPane.showMessageDialog(getParent(), " 간단 메모장 정보 ");

			}
		});

	}

	public static void main(String[] args) {
		new Ex01_Menu();
	}
}
