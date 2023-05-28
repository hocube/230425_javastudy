package day16.com.ict.edu2;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex10_Cyan extends JPanel {
	public Ex10_Cyan() {
		setBackground(Color.CYAN);
		

		JRadioButton jr1 = new JRadioButton(" + ");
		JRadioButton jr2 = new JRadioButton(" - ");
		JRadioButton jr3 = new JRadioButton(" * ");
		JRadioButton jr4 = new JRadioButton(" / ");
		
		//버튼 중복 체크 x
		ButtonGroup bg = new ButtonGroup();
		bg.add(jr1);
		bg.add(jr2);
		bg.add(jr3);
		bg.add(jr4);
		
		//버튼 배경색
		jr1.setBackground(Color.CYAN);
		jr2.setBackground(Color.CYAN);
		jr3.setBackground(Color.CYAN);
		jr4.setBackground(Color.CYAN);

		add(jr1);
		add(jr2);
		add(jr3);
		add(jr4);
	}
}
