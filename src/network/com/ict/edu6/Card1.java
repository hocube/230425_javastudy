package network.com.ict.edu6;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Card1 extends JPanel {
	// 생성자의 인자 부분은 전역변수로 꼭 선언하기
	ChatClient_ALL client;

	public Card1(ChatClient_ALL client) {
		this.client = client;
		setLayout(new BorderLayout());

		// 이미지 넣기
		// 아이콘으로 넣는 방법
		JLabel img = new JLabel("");
		img.setHorizontalAlignment(SwingConstants.CENTER);
		img.setIcon(new ImageIcon(ChatClient_ALL.class.getResource("/images/talk.png")));
		add(img, BorderLayout.CENTER);

		JPanel jp1 = new JPanel(new GridLayout(2, 1));
		JPanel jp2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jp2.add(new JLabel("닉네임 : "));
		JTextField nickname_tf = new JTextField(10);
		jp2.add(nickname_tf);

		JPanel jp3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JButton join_bt = new JButton(" 입장하기 ");
		jp3.add(join_bt);

		jp1.add(jp2);
		jp1.add(jp3);

		add(jp1, BorderLayout.SOUTH);

		join_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// cardLayout.show(contentPane, "chat");
				// 사용자 닉네임 받기
				String name = nickname_tf.getText().trim();
				if (name.length() > 0) {
					// 서버 접속
					if (client.connected()) {
						try {
							// 닉네임 보내기
							Protocol p = new Protocol();
							p.setCmd(1);
							p.setMsg(name);
							client.out.writeObject(p);
							client.cardLayout.show(client.contentPane, "card2");
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
				} else {
					JOptionPane.showMessageDialog(getParent(), "닉네임 입력하세요");
					nickname_tf.setText("");
					nickname_tf.requestFocus();
				}
			}
		});
	}
}