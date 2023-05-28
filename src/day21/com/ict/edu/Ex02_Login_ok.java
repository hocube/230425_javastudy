package day21.com.ict.edu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex02_Login_ok extends JPanel{
	Ex02_Main main;
	JButton jb;
	
public Ex02_Login_ok(Ex02_Main main) {
this.main = main;  //main에 찾아가서 받음.
	
	jb = new JButton("뒤로가기");
	
	add(new JLabel("로그인 성공 창 입니다."));
	add(jb);
	
	
	jb.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			main.cardLayout.show(main.pg1, "login");
		}
	});
}
}
