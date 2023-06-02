package jdbc.com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex02_PreparedStatement_select {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		int result = 0;

		// 스캐너로 받아보자.
		Scanner scan = new Scanner(System.in);
		System.out.println("custid : ");
		int custid = scan.nextInt(); // 스캐너로 받은 값을 custid에 넣은 후 찾자.

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##pjh";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);

			String sql = "select * from customer where custid = ?";
			// custid는 계속 바뀔 수 있으니깐 여기서 동적 바인딩.
			// ? => 바인딩변수
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, custid); // (?의 갯수 (1부터 시작), 3번)
			rs = pstm.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.println(rs.getString(4) + "\n");
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
