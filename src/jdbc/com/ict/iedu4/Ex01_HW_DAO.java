package jdbc.com.ict.iedu4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Ex01_HW_DAO {
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	int result = 0;

	private static Ex01_HW_DAO dao = new Ex01_HW_DAO();

	public static Ex01_HW_DAO getInstance() {
		return dao;
	}

	// DB에 접속하는 메서드
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

	// 전체보기
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
				vo.setPHONE(rs.getString(4));
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

	// 데이터 삽입
	public int getInsert(Ex01_Hw_VO vo) {
		try {
			conn = getConnection();
			String sql = "insert into CUSTOMER (CUSTID, NAME, ADDRESS, PHONE)" + "values (?,?,?,?)";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, vo.getCUSTID());
			pstm.setString(2, vo.getNAME());
			pstm.setString(3, vo.getADDRESS());
			pstm.setString(4, vo.getPHONE());

			result = pstm.executeUpdate();
			return result;
		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return 0;
	}

	// 데이터 삭제
	public int getDelete(Ex01_Hw_VO vo) {
		try {
			conn = getConnection();
			String sql = "delete from CUSTOMER where CUSTID = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, vo.getCUSTID());
			result = pstm.executeUpdate();
			return result;
		} catch (Exception e) {
		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return 0;
	}

	// 검색
	public Ex01_Hw_VO getSelectOne(String CUSTID) {
		try {
			conn = getConnection();
			String sql = "select * from CUSTOMER where CUSTID = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, CUSTID);
			rs = pstm.executeQuery();
			Ex01_Hw_VO vo = new Ex01_Hw_VO();
			while (rs.next()) {
				vo.setCUSTID(rs.getString(1));
				vo.setNAME(rs.getString(2));
				vo.setADDRESS(rs.getString(3));
				vo.setPHONE(rs.getString(4));
			}
			return vo;
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

	// 불러오기
	public void getCall(String CUSTID, String NAME, String ADDRESS, String PHONE) {
		try {
			conn = getConnection();
			String sql = "update CUSTMER set NAME = ?, ADDRESS = ?, PHONE = ? where CUSTID = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, NAME);
			pstm.setString(2, ADDRESS);
			pstm.setString(3, PHONE);
			pstm.setString(4, CUSTID);
			result = pstm.executeUpdate();
			if (result > 0) {
				getSelectAll();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}

	public void getUpdate(String CUSTID, String NAME, String ADDRESS, String PHONE) {
		try {
			conn = getConnection();
			String sql = "update CUSTOMER set NAME = ?, ADDRESS = ?, PHONE = ? where CUSTID = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, NAME);
			pstm.setString(2, ADDRESS);
			pstm.setString(3, PHONE);
			pstm.setString(4, CUSTID);
			result = pstm.executeUpdate();
		} catch (Exception e) {
		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e) {
			}
		}
	}

}
