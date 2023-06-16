package network.com.ict.edu6;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Card2 extends JPanel {
	ChatClient_ALL client;
	JTextArea jta;
	JTextField input_tf;
	JButton send_bt;
	

	public Card2(ChatClient_ALL client) {
		this.client = client;
		setLayout(new BorderLayout());

		// card2에 들어갈 애들
		jta = new JTextArea();
		jta.setLineWrap(true);
		jta.setEditable(false);
		jta.setBackground(Color.LIGHT_GRAY);
		jta.setForeground(Color.WHITE);
		jta.setFont(new Font("굴림", Font.PLAIN, 15));
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		add(jsp, BorderLayout.CENTER);

		JPanel jp4 = new JPanel(new BorderLayout());
		input_tf = new JTextField();
		jp4.add(input_tf, BorderLayout.CENTER);
		send_bt = new JButton("보내기");
		jp4.add(send_bt, BorderLayout.EAST);

		add(jsp, BorderLayout.CENTER);
		add(jp4, BorderLayout.SOUTH);
		
		
		
		input_tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMessage();
			}
		});
		send_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sendMessage();
			}
		});
	}
	
	
	private void sendMessage() {
		String msg = input_tf.getText().trim();
		if(msg.length()>0) {
			try {
				// 메세지 보내기 
				Protocol p = new Protocol();
				p.setCmd(2);
				p.setMsg(msg);
				client.out.writeObject(p);
				client.out.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		input_tf.setText("");
		input_tf.requestFocus();
	}
}