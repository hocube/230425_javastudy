package network.com.ict.edu6;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ChatClient_ALL extends JFrame implements Runnable {
	JPanel contentPane;
	CardLayout cardLayout;
	Card1 card1;
	Card2 card2;

	// 접속하기 위해 필요한 것들
	Socket s = null;
	ObjectOutputStream out = null;
	ObjectInputStream in = null;

	public ChatClient_ALL() {
		super("멀티 채팅 ver 0.2");
		// 카드 레이아웃 생성
		cardLayout = new CardLayout();

		contentPane = new JPanel(); // 카드 레이아웃 담을 패널
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10)); // 테두리
		contentPane.setLayout(cardLayout);

		card1 = new Card1(this);
		card2 = new Card2(this);

		contentPane.add("card1", card1);
		contentPane.add("card2", card2);

		cardLayout.show(contentPane, "card1");

		add(contentPane);

		setSize(380, 550);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	// 연결
	boolean connected() {
		boolean value = true;
		try {
			s = new Socket("192.168.0.78", 7778);
			out = new ObjectOutputStream(s.getOutputStream());
			in = new ObjectInputStream(s.getInputStream());
			new Thread(this).start();
			return value;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	// 종료
	private void closed() {
		try {
			out.close();
			in.close();
			s.close();
			System.exit(0);
		} catch (Exception e) {
		}
	}

	@Override
	public void run() {
		esc:while(true) {
			try {
				Object obj = in.readObject();
				if(obj != null) {
					Protocol p = (Protocol)obj;
					switch (p.getCmd()) {
					case 0:  // 종료
						break esc;

					case 2 : // 메세지
						card2.jta.append(p.getMsg()+"\n");
						card2.jta.setCaretPosition(card2.jta.getText().length());
						break;
					}
					
				}
			} catch (Exception e) {
			}
		}
		closed();
		
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				new ChatClient_ALL();
			}
		});
	}
}