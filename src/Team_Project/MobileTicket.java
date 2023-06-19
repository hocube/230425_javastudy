package Team_Project;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MobileTicket extends JFrame{
	JPanel jp1;
	JTextField mobileticket, number, name, date, starttime, theatername, persons, seatnumber;
	JButton cancel;
	
	public MobileTicket() {
		super("모바일 티켓");
		
		jp1 = new JPanel();
		jp1.setLayout(getLayout());
		
		setSize(350, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false); // 크기 조절 비활성화
	}

	public static void main(String[] args) {
		new MobileTicket();
	}
}
