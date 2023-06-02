package jdbc.com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex05_PreparedStatement_update {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("수정할 custid : ");
		int custid = scan.nextInt();
		System.out.println("수정할 name : ");
		String name = scan.next();
		System.out.println("수정할 address : ");
		String address = scan.next();
		System.out.println("수정할 phone : ");
		String phone = scan.next();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##pjh";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);

			String sql = "update customer set name = ?, address=?,phone=? where custid =?";
			// ? => 바인딩변수 (=동적바인딩)
			pstm = conn.prepareStatement(sql);
			// ?가 채워지지않은 상태에서 집어넣어지고
			pstm.setString(1, name); //
			pstm.setString(2, address);
			pstm.setString(3, phone);
			pstm.setInt(4, custid);
			// ?에 1:1 대칭하는 것이다.

			// rs = pstm.executeQuery();
			// select 만 xecuteQuery 이다.
			result = pstm.executeUpdate();
			if (result > 0) {
				sql = "select * from customer";
				pstm = conn.prepareStatement(sql);
				rs = pstm.executeQuery();
				// 이건 두번이상은 안된다 .무결성의 위배
				// 으로 써야한다.
				while (rs.next()) {
					System.out.print(rs.getString(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\n");
				}
			} else {
				System.out.println("수정 실패");
			}

		} catch (Exception e) {
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