package jdbc.com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex04_PreparedStatement_delete {
	public static void main(String[] args) {
		// 오라클에 접속해서 처리하는 클래스 3개
		Scanner scan = new Scanner(System.in);

		System.out.print("삭제할 custid : ");
		int custid = scan.nextInt();

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

			// 보통은 primary key를 이용해서 삭제한다.
			String sql = "delete from CUSTOMER where custid = ?";
			// 바인딩변수(?)가 있으면 처리 하자
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, custid);

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
			} else {
				System.out.println("수정 실패");
			}

		} catch (Exception e) {
			System.out.println("수정 실패");
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
