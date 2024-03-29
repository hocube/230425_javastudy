package network.com.ict.edu9;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import network.com.ict.edu9db.VO;

public class DB_Client extends JFrame implements Runnable {
	JPanel jp1, jp2, jp3, jp4, jp5, jp6;
	JTextField jtf1, jtf2, jtf3, jtf4;
	JButton jb1, jb2, jb3, jb4;
	JTextArea jta;
	JScrollPane jsp;

	Socket s;
	ObjectOutputStream out;
	ObjectInputStream in;

	public DB_Client() {
		super("DB 연동 정보");
		jp1 = new JPanel(new GridLayout(0, 2));
		jp2 = new JPanel(new GridLayout(0, 2));
		jp3 = new JPanel(new GridLayout(0, 2));
		jp4 = new JPanel(new GridLayout(0, 2));
		jp5 = new JPanel(new GridLayout(4, 0));
		jp6 = new JPanel();

		jtf1 = new JTextField();
		jtf2 = new JTextField();
		jtf3 = new JTextField();
		jtf4 = new JTextField();

		jb1 = new JButton("전체보기");
		jb2 = new JButton("삽입");
		jb3 = new JButton("삭제");
		jb4 = new JButton("검색");

		jp1.add(new JLabel("CUSTID  :  ", JLabel.CENTER));
		jp1.add(jtf1);

		jp2.add(new JLabel("NAME  :  ", JLabel.CENTER));
		jp2.add(jtf2);

		jp3.add(new JLabel("ADDRESS  :  ", JLabel.CENTER));
		jp3.add(jtf3);

		jp4.add(new JLabel("PHONE  :  ", JLabel.CENTER));
		jp4.add(jtf4);

		jp5.add(jp1);
		jp5.add(jp2);
		jp5.add(jp3);
		jp5.add(jp4);

		jta = new JTextArea();
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);

		jp6.add(jb1);
		jp6.add(jb2);
		jp6.add(jb3);
		jp6.add(jb4);

		add(jp5, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp6, BorderLayout.SOUTH);

		setSize(600, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 접속
		connected();

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if (s != null) {
					try {
						Protocol p = new Protocol();
						p.setCmd(0);
						out.writeObject(p);
						out.flush();
					} catch (Exception e2) {
					}
				} else {
					closed();
				}
			}
		});

		// 전체보기
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					System.out.println("DB_Client jb1버튼의 프로토콜 실행");
					Protocol p = new Protocol();
					System.out.println("DB_Client jb1버튼의 프로토콜 실행 완료");
					p.setCmd(1);// 야 나 프로토콜 실행했다~
					System.out.println("DB_Client jb1버튼의 setCmd(1)");
					out.writeObject(p);// 프로토콜 내용 전달
					out.flush(); // 닫음
				} catch (Exception e2) {
				}
			}
		});

		// 삽입
		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					VO vo = new VO();
					vo.setCustid(jtf1.getText());
					vo.setName(jtf2.getText());
					vo.setAddress(jtf3.getText());
					vo.setPhone(jtf4.getText());

					Protocol p = new Protocol();
					p.setCmd(2); // cmd에 2를 담는다.
					p.setVo(vo); // VO에 위에서 설정한 vo(jtf1234를 텍스트로 가져오는)를 담는다.

					out.writeObject(p); // bjectOutputStream을 통해 Protocol 객체를 서버로 전송
					out.flush(); // 출력 스트림을 비우는 역할

				} catch (Exception e2) {
				}
			}
		});

		// 삭제
		jb3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					VO vo = new VO();
					vo.setCustid(jtf1.getText());

					Protocol p = new Protocol();
					p.setCmd(3);
					p.setVo(vo);

					out.writeObject(p);
					out.flush();

				} catch (Exception e2) {
				}
			}
		});

		// 검색
		jb4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					VO vo = new VO();
					vo.setCustid(jtf1.getText()); // custid로 검색
					//vo.setName(jtf2.getText()); // 이름으로 검색

					Protocol p = new Protocol();
					p.setCmd(4);
					p.setVo(vo);

					out.writeObject(p);
					out.flush();
				} catch (Exception e2) {
				}

			}

		});
	}

	// 접속 메서드
	public void connected() {
		try {
			// 192.168.0.11 (puppy)
			// 192.168.31.128 (rabbit)
			s = new Socket("192.168.0.78", 7780);
			out = new ObjectOutputStream(s.getOutputStream());
			in = new ObjectInputStream(s.getInputStream());
			new Thread(this).start();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// 끝내기 메서드
	public void closed() {
		try {
			out.close();
			in.close();
			System.exit(0);
		} catch (Exception e) {
		}
	}

	@Override
	public void run() {
		esc: while (true) {
			try {
				Object obj = in.readObject();
				if (obj != null) {
					Protocol p = (Protocol) obj;
					switch (p.getCmd()) {
					case 0:
						break esc;
					case 1:
						List<VO> list = p.getList();
						prn(list);
						break;
					case 2:
						// 성공하면 회원 정보를 가져와 화면에 출력
						if (p.getList() != null) {
							prn(p.getList());
						}
						break;
					case 3:
						// 성공하면 회원 정보를 가져와 화면에 출력
						if (p.getList() != null) {
							jta.setText("");
							prn(p.getList());
						}
						break;
					case 4:
						List<VO> resultList = p.getList();
						// p.getList()를 사용하여 Protocol 객체에서 검색 결과를 가져옴.
						// p.getList()가 null이 아니고, 결과 리스트의 크기가 0보다 큰 경우, 즉 검색 결과가 존재하는 경우 실행.
						if (resultList != null && resultList.size() > 0) {
							prn(resultList); // 결과 리스트를 전체 출력
						} else {
							jta.setText(""); // 결과가 없을 경우 텍스트 영역을 초기화
						}
						break;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		closed();
	}

	// 전체 리스트
	public void prn(List<VO> list) {
		jta.setText("");
		jta.append("\n\t\t\t 회원 전체 정보 \n\n");
		jta.append("\t번호\t이름\t주소\t\t전화번호\n");
		for (VO k : list) {
			jta.append("\t" + k.getCustid() + "\t");
			jta.append(k.getName() + "\t");
			jta.append(k.getAddress() + "\t\t");
			jta.append(k.getPhone() + "\n");
		}
	}

	// 한개만 볼 때
	public void prn2(VO vo) {
		jta.setText("");
		jta.append("\n\t\t\t 회원 전체 정보 \n\n");
		jta.append("번호\t이름\t주소\t\t전화번호\n");
		jta.append(vo.getCustid() + "\t");
		jta.append(vo.getName() + "\t");
		jta.append(vo.getAddress() + "\t\t");
		jta.append(vo.getPhone() + "\n");
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				new DB_Client();
			}
		});
	}
}