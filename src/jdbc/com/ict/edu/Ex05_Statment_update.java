package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//박세리의 주소를 대한민국 제주도, 전화번호를 000-90000-0001로 변경하자
public class Ex05_Statment_update {
	public static void main(String[] args) {
		// 접속하고 처리하기 위해서 3개의 클래스
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

			String sql = "update customer set address = '대한민국 제주도', phone = '000-90000-0001' where name = '박세리'";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);

			if (result > 0) {
				sql = "select * from customer order by custid asc";
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					System.out.print(rs.getString(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\n");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}