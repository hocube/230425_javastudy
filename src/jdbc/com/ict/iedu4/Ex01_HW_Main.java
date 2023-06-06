package jdbc.com.ict.iedu4;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;

public class Ex01_HW_Main extends JFrame {
	JPanel pg1, jp1, jp2, jp3, jp4, jp5, lbpanel, tfpanel;
	JLabel jl1, jl2, jl3, jl4;
	JTextField jtf1, jtf2, jtf3, jtf4;
	JButton jb1, jb2, jb3, jb4, jb5, jb6;
	JTextArea jta;

	public Ex01_HW_Main() {
		super("DB 연동 정보");
		// 위에 4줄
		pg1 = new JPanel();
		pg1.setLayout(new BoxLayout(pg1, BoxLayout.Y_AXIS));

		jp1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jl1 = new JLabel("CUSTID :                            ");
		jtf1 = new JTextField(20);
		jp1.add(jl1);
		jp1.add(jtf1);

		jp2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jl2 = new JLabel("NAME :                              ");
		jtf2 = new JTextField(20);
		jp2.add(jl2);
		jp2.add(jtf2);

		jp3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jl3 = new JLabel("ADDRESS :                           ");
		jtf3 = new JTextField(20);
		jp3.add(jl3);
		jp3.add(jtf3);

		jp4 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jl4 = new JLabel("PHONE :                             ");
		jtf4 = new JTextField(20);
		jp4.add(jl4);
		jp4.add(jtf4);

		pg1.add(jp1);
		pg1.add(jp2);
		pg1.add(jp3);
		pg1.add(jp4);

		// 텍스트창
		jta = new JTextArea();
		jta.setEditable(true);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		// 버튼 6개
		jp5 = new JPanel();

		jb1 = new JButton("전체보기");
		jb2 = new JButton("삽입");
		jb3 = new JButton("삭제");
		jb4 = new JButton("검색");
		jb5 = new JButton("불러오기");
		jb6 = new JButton("고치기");

		jp5.add(jb1);
		jp5.add(jb2);
		jp5.add(jb3);
		jp5.add(jb4);
		jp5.add(jb5);
		jp5.add(jb6);

		add(pg1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp5, BorderLayout.SOUTH);

		// pack();
		setSize(600, 500);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 전체보기
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<Ex01_Hw_VO> list = Ex01_HW_DAO.getInstance().getSelectAll();
				for (Ex01_Hw_VO k : list) {
					jta.append(k.getCUSTID() + "\t");
					jta.append(k.getNAME() + "\t");
					jta.append(k.getADDRESS() + "\t");
					jta.append(k.getPHONE() + "\n");
				}
			}
		});

		// 삽입
		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Ex01_Hw_VO vo = new Ex01_Hw_VO();
				vo.setCUSTID(jtf1.getText());
				vo.setNAME(jtf2.getText());
				vo.setADDRESS(jtf3.getText());
				vo.setPHONE(jtf4.getText());

				int result = Ex01_HW_DAO.getInstance().getInsert(vo);
				if (result > 0) {
					jta.append(vo.getCUSTID() + "\t" + vo.getNAME() + "\t" + vo.getADDRESS() + "\t" + vo.getPHONE()
							+ "\n");
					jtf1.setText("");
					jtf2.setText("");
					jtf3.setText("");
					jtf4.setText("");
				}
			}
		});

		// 삭제
		jb3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Ex01_Hw_VO vo = new Ex01_Hw_VO();
				vo.setCUSTID(jtf1.getText());
				int result = Ex01_HW_DAO.getInstance().getDelete(vo);
				if (result > 0) {
					jtf1.setText("");
					jtf2.setText("");
					jtf3.setText("");
					jtf4.setText("");

					jta.setText(""); // JTextArea 클리어
					ArrayList<Ex01_Hw_VO> list = Ex01_HW_DAO.getInstance().getSelectAll();
					for (Ex01_Hw_VO k : list) {
						jta.append(k.getCUSTID() + "\t");
						jta.append(k.getNAME() + "\t");
						jta.append(k.getADDRESS() + "\t");
						jta.append(k.getPHONE() + "\n");
					}
				}
			}
		});

		// 검색
		jb4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Ex01_Hw_VO vo = new Ex01_Hw_VO();
				vo.setCUSTID(jtf1.getText());
				Ex01_Hw_VO vo2 = Ex01_HW_DAO.getInstance().getSelectOne(vo.getCUSTID());
				if (vo.getCUSTID() != null) {
					jta.setText("");
					jta.append(vo2.getCUSTID() + "\t");
					jta.append(vo2.getNAME() + "\t");
					jta.append(vo2.getADDRESS() + "\t");
					jta.append(vo2.getPHONE() + "\n");
				}
			}
		});

		// 불러오기
		jb5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Ex01_Hw_VO vo = new Ex01_Hw_VO();
				vo.setCUSTID(jtf1.getText());
				Ex01_Hw_VO vo2 = Ex01_HW_DAO.getInstance().getSelectOne(vo.getCUSTID());
				jtf1.setText(vo2.getCUSTID());
				jtf2.setText(vo2.getNAME());
				jtf3.setText(vo2.getADDRESS());
				jtf4.setText(vo2.getPHONE());

			}
		});

		// 고치기(수정)
		jb6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String CUSTID = jtf1.getText();
				String NAME = jtf2.getText();
				String ADDRESS = jtf3.getText();
				String PHONE = jtf4.getText();

				Ex01_HW_DAO.getInstance().getUpdate(CUSTID, NAME, ADDRESS, PHONE);
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
				jtf4.setText("");
				jta.setText("");
				ArrayList<Ex01_Hw_VO> list = Ex01_HW_DAO.getInstance().getSelectAll();
		        for (Ex01_Hw_VO k : list) {
		            jta.append(k.getCUSTID() + "\t");
		            jta.append(k.getNAME() + "\t");
		            jta.append(k.getADDRESS() + "\t");
		            jta.append(k.getPHONE() + "\n");
		        }
		    }
		});

	}

	public static void main(String[] args) {
		new Ex01_HW_Main();
	}
}
