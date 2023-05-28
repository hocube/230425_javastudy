package day21.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//카드 레이아웃 : 카드가 뒤집혀 진 상태에서 이벤트가 발생하면 하나씩 보여주는 형태
//			  (여기서 카드란? JPanel이다.)
public class Ex01_CardLayout extends JFrame{
	JPanel card1, card2, card3, card4, card5, pg1, pg2;
	JButton jb1, jb2, jb3, jb4;
	CardLayout cardLayout;

	public Ex01_CardLayout() {
		super("카드 레이아웃");

		// 각각의 카드패널을 만들자(5개)
		card1 = new JPanel();
		card1.setLayout(new BorderLayout()); // 글자가 가운데 나오도록
		card1.setBackground(Color.pink);
		card1.add(new JLabel("첫번째 카드", JLabel.CENTER));

		card2 = new JPanel();
		card2.setLayout(new BorderLayout());
		card2.setBackground(Color.BLUE);
		card2.add(new JLabel("두번째 카드", JLabel.CENTER));

		card3 = new JPanel();
		card3.setLayout(new BorderLayout());
		card3.setBackground(Color.CYAN);
		card3.add(new JLabel("세번째 카드", JLabel.CENTER));

		card4 = new JPanel();
		card4.setLayout(new BorderLayout());
		card4.setBackground(Color.ORANGE);
		card4.add(new JLabel("네번째 카드", JLabel.CENTER));

		card5 = new JPanel();
		card5.setLayout(new BorderLayout());
		card5.setBackground(Color.GREEN);
		card5.add(new JLabel("다섯번째 카드", JLabel.CENTER));

		// 카드들이 들어감
		// pg1을 카드레아웃으로 변경하자
		// jpanel이 원래는 카드 레이아웃이 아닌데 카드 레이아웃으로 변경됨.
		pg1 = new JPanel();
		cardLayout = new CardLayout();
		pg1.setLayout(cardLayout);
		// -> 이제 pg1이 카드 레이아웃으로 변경 되었으므로 카드(패널)를 추가하자
		// pg1.add("호출 이름", 해당 컨테이너(여기에서는 카드Jpanel));
		// 해당 카드를 호출할 때는 show(cardLayout,"호출이름");
		// 이름을 호출하면 해당 컨데이너가 온다. key value와 비슷
		pg1.add("1", card1);
		pg1.add("2", card2);
		pg1.add("3", card3);
		pg1.add("4", card4);
		pg1.add("5", card5);

		// 마지막 패널에는 버튼들이 들어감
		// 첫 카드를 지정하지 않으면 맨 처음 카드가 나온다.
		// 첫 카드를 지정하자
		cardLayout.show(pg1, "3");
		
		pg2 = new JPanel();
		jb1 = new JButton("<<");
		jb2 = new JButton("<");
		jb3 = new JButton(">");
		jb4 = new JButton(">>");
		pg2.add(jb1);
		pg2.add(jb2);
		pg2.add(jb3);
		pg2.add(jb4);

		add(pg1, BorderLayout.CENTER);
		add(pg2, BorderLayout.SOUTH);
		

		// pack();
		setLocationRelativeTo(null);
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		//이벤트 처리
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(pg1, "1");  
				cardLayout.first(pg1);     //위에꺼랑 같다. 첫번째꺼 부르는거.
			}
		});
		
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.previous(pg1); 
						   //내 기준에서 앞으로 가는거
			}
		});
		
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(pg1);  
						   //내 기준에서 다음껄로 가는거
			} 
		});
		
		jb4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(pg1, "5");
				cardLayout.last(pg1);   //위에꺼랑 같다. 마지막꺼 부르는거.
			}
		});
		
		
		

	}

	public static void main(String[] args) {
		new Ex01_CardLayout();
	}
}
