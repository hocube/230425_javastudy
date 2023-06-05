package jdbc.com.ict.iedu4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Ex01_HW_DAO {
 Connection conn = null;
 PreparedStatement pstm = null;
 ResultSet rs = null;
 int result = 0;
 
 private static DAO dao = new DAO();
 
 public static DAO getInstance() {
	 return dao;
 }
 
 //DB에 접속하는 메서드
 public Connection getConnection() {
	 try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##pjh";
		String password = "1111";
		conn = DriverManager.getConnection(url, user, password);
		return conn;
	} catch (Exception e) {
	}
	 return null;
 }
 
 public ArrayList<Ex01_Hw_VO> getSelectAll() {
	 try {
		 conn = getConnection();
		 String sql = "SELECT * FROM CUSTOMER";
		 pstm = conn.prepareStatement(sql);
		 rs = pstm.executeQuery();
		 ArrayList<Ex01_Hw_VO> list = new ArrayList<>();
		 while (rs.next()) {
			Ex01_Hw_VO vo = new Ex01_Hw_VO();
			vo.setCUSTID(rs.getString(1));
			vo.setNAME(rs.getString(2));
			vo.setADDRESS(rs.getString(3));
			vo.setPHONE(rs.getString(2));
			list.add(vo);
			
		}
		 return list;
		
	} catch (Exception e) {
	} finally {
		try {
			rs.close();
			pstm.close();
			conn.close();
		} catch (Exception e2) {
		}
	}
	 return null;
 }
 
}
