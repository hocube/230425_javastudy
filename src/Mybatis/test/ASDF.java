package Mybatis.test;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import Mybatis.com.ict.edu.DAO;
import Mybatis.com.ict.edu.VO;

public class ASDF extends JFrame implements ActionListener {
	// 컴포넌트 선언부
	JPanel jp, jp2, jp3, jp4, jp5, jp6, pg1, pg2;
	JLabel jl1, jl2, jl3, jl4;
	JTextField jtf1, jtf2, jtf3, jtf4;
	JButton jb1, jb2, jb3, jb4, jb5, jb6;
	JTextArea jta;
	JScrollPane jsp;
	String select = "select * from customer order by custid asc"; // 조회
	String sql = ""; // 나머지

	public ASDF() {
		super("DB 연동 정보");

		pg1 = new JPanel();
		pg1.setLayout(new GridLayout(4, 2, 0, 0));
		jp3 = new JPanel();
		jl1 = new JLabel("CUSTID : ");
		jl1.setHorizontalAlignment(JLabel.CENTER); // JLabel 가운데 정렬
		jtf1 = new JTextField(20);
		pg1.add(jl1);
		pg1.add(jtf1);
		jp4 = new JPanel();
		jl2 = new JLabel("NAME : ");
		jl2.setHorizontalAlignment(JLabel.CENTER);

		jtf2 = new JTextField(20);
		pg1.add(jl2);
		pg1.add(jtf2);
		jp5 = new JPanel();
		jl3 = new JLabel("ADDRESS : ");
		jl3.setHorizontalAlignment(JLabel.CENTER);
		jtf3 = new JTextField(20);
		pg1.add(jl3);
		pg1.add(jtf3);
		jp6 = new JPanel();
		jl4 = new JLabel("PHONE : ");
		jl4.setHorizontalAlignment(JLabel.CENTER);
		jtf4 = new JTextField(20);
		pg1.add(jl4);
		pg1.add(jtf4);

		jp2 = new JPanel();
		jta = new JTextArea();
		jb1 = new JButton("전체보기");
		jb2 = new JButton("삽입");
		jb3 = new JButton("삭제");
		jb4 = new JButton("검색");
		jb5 = new JButton("불러오기");
		jb6 = new JButton("고치기");
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		jp2.add(jb6);

		jta = new JTextArea(15, 60);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);

		add(pg1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp2, BorderLayout.SOUTH);

		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jb6.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton) e.getSource();
		List<VO> list = null;
		VO vo = new VO();
		int result = 0;
		jta.setText("");
		if(obj == jb1) {
			list = DAO.getList();
			prn(list);
		} else if(obj == jb2) {
			vo.setCustid(jtf1.getText());
			vo.setName(jtf2.getText());
			vo.setAddress(jtf3.getText());
			vo.setPhone(jtf4.getText());
			result = DAO.getInsert(vo);
			if (result > 0) {
				list = DAO.getList();
				prn(list);
			}
		} else if(obj == jb3) {
			vo.setCustid(jtf1.getText());
			result = DAO.getDelete(vo);
			if (result > 0) {
				list = DAO.getList();
				prn(list);
			}
		} else if(obj == jb4) {
			vo = DAO.getOne(jtf1.getText());
			prn2(vo);
		} else if(obj == jb5) {
			vo = DAO.getOne(jtf1.getText());
			jtf2.setText(vo.getName());
			jtf3.setText(vo.getAddress());
			jtf4.setText(vo.getPhone());
		} else if(obj == jb6) {
			vo = DAO.getOne(jtf1.getText());
			vo.setName(jtf2.getText());
			vo.setAddress(jtf3.getText());
			vo.setPhone(jtf4.getText());
			result = DAO.getUpdate(vo);
			if (result > 0) {
				list = DAO.getList();
				prn(list);
			}
		}
	}

	// 테이블 전체보기 메서드
	public void prn(List<VO> list) {
		jta.append("번호\t이름\t주소\t전화번호 \n");
		for (VO k : list) {
			jta.append(k.getCustid() + "\t");
			jta.append(k.getName() + "\t");
			jta.append(k.getAddress() + "\t");
			jta.append(k.getPhone() + "\n");
		}
	}

	public void prn2(VO vo) {
		jta.append("번호\t이름\t주소\t전화번호 \n");
		jta.append(vo.getCustid() + "\t");
		jta.append(vo.getName() + "\t");
		jta.append(vo.getAddress() + "\t");
		jta.append(vo.getPhone() + "\n");
	}

	public static void main(String[] args) {
		new ASDF();
	}

}
