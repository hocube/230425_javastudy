package jdbc.com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex01_PreparedStatement_select {
	public static void main(String[] args) {
		// 오라클에 접속해서 처리하는 클래스 3개
		Connection conn = null; // 1
		// Statement stmt = null; //2
		PreparedStatement pstm = null;
		ResultSet rs = null; // 3
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
			String sql = "select * from 고객테이블";
			pstm = conn.prepareStatement(sql); // prepareStatement에서는 쿼리(sql)를 먼저 보냄
			// 바인딩변수(?)가 있으면 처리 하자

			// 결과 받기
			rs = pstm.executeQuery();

			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				System.out.print(rs.getString(5) + "\t");
				System.out.print(rs.getString(6) + "\n");
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
