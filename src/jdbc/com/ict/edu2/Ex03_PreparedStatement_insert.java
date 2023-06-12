package jdbc.com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex03_PreparedStatement_insert {
	public static void main(String[] args) {
		// 오라클에 접속해서 처리하는 클래스 3개
		Scanner scan = new Scanner(System.in);
		
		System.out.print("custid : ");
		int custid = scan.nextInt();
		
		System.out.print("name : ");
		String name = scan.next();
		
		System.out.print("address :  ");
		String address = scan.next();
		
		System.out.print("phone :  ");
		String phone = scan.next();
		
		Connection conn = null; 
		PreparedStatement pstm = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 오라클에 접속할 정보 저장
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##pjh";
			String password = "1111";
			// 오라클에 접속
			conn = DriverManager.getConnection(url, user, password);

			// 쿼리
			String sql = "insert into CUSTOMER(custid, name, address, phone) values(?,?,?,?)";
			// 바인딩변수(?)가 있으면 처리 하자
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, custid);
			pstm.setString(2, name);
			pstm.setString(3, address);
			pstm.setString(4, phone);

			result = pstm.executeUpdate();
			if (result > 0) { // 삽입되면서 실행
				sql = "select * from customer";
				pstm = conn.prepareStatement(sql);
				rs = pstm.executeQuery();
				while (rs.next()) {
					System.out.print(rs.getString(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\n");

				}
			}

		} catch (Exception e) {
			System.out.println("삽입 실패");
		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
}