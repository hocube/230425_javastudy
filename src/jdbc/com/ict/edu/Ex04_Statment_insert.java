package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04_Statment_insert {
	public static void main(String[] args) {
		// 접속과 처리를 위한 클래스 3개
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##pjh";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);

			// insert (6번, 이강인, 대한민국 서울, 000-9000-0001) 추가

			String sql = "INSERT INTO CUSTOMER(custid,name,address,phone)"
					+ " VALUES(7, '이강인', '대한민국 서울', '000-9000-0001')";

			stmt = conn.createStatement();

			result = stmt.executeUpdate(sql);

			if (result > 0) {
				// 성공하면 select문을 이용해서 보자
				// insert, update, delete는 결과를 안보여주니깐 select문으로 봐야함
				sql = "select * from CUSTOMER order by custid asc";
				// stmt = conn.createStatement(); 안만들어도 상관 없음
				rs = stmt.executeQuery(sql); // rs 나오면 while문 써야 함.
				while (rs.next()) {
					System.out.print(rs.getString("CUSTID") + "\t");
					System.out.print(rs.getString("NAME") + "\t");
					System.out.print(rs.getString("ADDRESS") + "\t");
					System.out.print(rs.getString("PHONE") + "\n");
				}
			}

		} catch (Exception e) {
			System.out.println("제대로된 데이터를 넣어주세요" + e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {

			}
		}
	}
}
