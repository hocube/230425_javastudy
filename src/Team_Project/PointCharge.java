package Team_Project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PointCharge extends JFrame{
	JPanel jp1, jp2, jp3, jp4, centerPanel;
	JRadioButton jrb1, jrb2, jrb3, jrb4, jrb5, jrb6;
	JButton pay, cancel;
	ButtonGroup ButtonGroup;
	public PointCharge() {
		super("포인트 충전");
		
		jp1 = new JPanel();
		jp1.add(new JLabel("포인트 충전"));
		
		// 5000원, 10000원, 15000원
		jp2 = new JPanel();
		jp2.setLayout(new BoxLayout(jp2, BoxLayout.Y_AXIS));
		jp2.setBorder(new EmptyBorder(20, 70, 20, 20));
		//jp2.setBorder(new EmptyBorder(0, 70, 0, 0));
		ButtonGroup = new ButtonGroup();
		jrb1 = new JRadioButton("5000원");
		jrb2 = new JRadioButton("10000원");
		jrb3 = new JRadioButton("15000원");
		ButtonGroup.add(jrb1);
		ButtonGroup.add(jrb2);
		ButtonGroup.add(jrb3);
		jp2.setLayout(new GridLayout(3,0));
		jp2.add(jrb1);
		jp2.add(jrb2);
		jp2.add(jrb3);
		
		// 20000원, 25000원, 30000원
		jp3 = new JPanel();
		jp3.setLayout(new BoxLayout(jp3, BoxLayout.Y_AXIS));
		jp3.setBorder(new EmptyBorder(20, 20, 20, 20));
		jrb4 = new JRadioButton("20000원");
		jrb5 = new JRadioButton("25000원");
		jrb6 = new JRadioButton("30000원");
		ButtonGroup.add(jrb4);
		ButtonGroup.add(jrb5);
		ButtonGroup.add(jrb6);
		jp3.setLayout(new GridLayout(3,0));
		jp3.add(jrb4);
		jp3.add(jrb5);
		jp3.add(jrb6);
		
		//결재, 취소
		jp4 = new JPanel();
		pay = new JButton("결제");
		cancel = new JButton("취소");
        jp4.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); 
        // FlowLayout으로 변경하고 간격 조정
		jp4.add(pay);
        jp4.add(Box.createHorizontalStrut(20)); 
        // 가로 간격을 추가하기 위해 Box.createHorizontalStrut 사용
		jp4.add(cancel);
		
		// 가운데 패널 생성 및 설정
		centerPanel = new JPanel(new GridLayout(1, 2));
		centerPanel.add(jp2, BorderLayout.CENTER);
        centerPanel.add(jp3, BorderLayout.EAST);
		
		add(jp1, BorderLayout.NORTH);
		add(centerPanel, BorderLayout.CENTER);
		add(jp4, BorderLayout.SOUTH);
			
		
		setSize(350, 250);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false); // 크기 조절 비활성화
	}

	public static void main(String[] args) {
		new PointCharge();
	}
}
