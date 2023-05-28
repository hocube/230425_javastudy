package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.print.attribute.standard.JobMediaSheetsCompleted;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex08_JTextComponent extends JFrame {
	public Ex08_JTextComponent() {
		super("JTextComponent");
		
		JPanel jp = new JPanel();
		
		//JLabel : 글자를 표시한다. 수정 불가
		JLabel jLabel1 = new JLabel();
		jLabel1.setText("I D : ");
		
		JLabel jLabel2 = new JLabel("P W : ");
		JLabel jLabel3 = new JLabel("자기소개: ");

		//한 줄 글자 입력 : JTextFild
		JTextField jtf1 = new JTextField();
		jtf1.setText("아이디 입력");
		jtf1.setColumns(20);  //보이는 글자 길이
		
		//JTextField jtf2 = new JTextField("비번입력", 20);
		//입력 된 글자가 ***** 표시 되기 위해서
		JPasswordField jtf2 = new JPasswordField("비번입력", 10);

		//메모장과 같이 여러 줄 글자 입력 : JTextArea(행, 열)
		JTextArea jta = new JTextArea(5, 20);   //5행 20열
		
		//JTextArea는 두가지 옵션을 생각해야 된다.
		//자동 줄바꿈
		jta.setLineWrap(true);
		
		//스크롤 기능
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, //세로 - 스크롤바 필요
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER); //가로 - 필요없음 never
				
		
		jp.add(jLabel1);
		jp.add(jtf1);
		jp.add(jLabel2);
		jp.add(jtf2);
		jp.add(jLabel3);
		jp.add(jsp);  //jta아니고 jsp를 해야함
		
		add(jp);
	

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width /2-500, ds.height /2-200, 1000, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Ex08_JTextComponent();
	}
}
