package network.com.ict.edu9db;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import network.com.ict.edu9db.DBservice;
import network.com.ict.edu9db.VO;

public class DAO {
	private static SqlSession ss;

	private synchronized static SqlSession getSession() {
		if (ss == null) {
			ss = DBservice.getFactory().openSession();
		}
		return ss;
	}

	// DB처리하는 메서드들
	public static List<VO> getList() {
		List<VO> list = null;
		list = getSession().selectList("custList");
		return list;
	}

  // custid로 검색
	// select문, 결과는 하나, 파라미터 있음(String)
	public static VO getOne(String custid) {
		VO vo = getSession().selectOne("custOne", custid);
		return vo;
	}
	
//	// 이름으로 검색
//	public static VO getOne(String Name) {
//		VO vo = getSession().selectOne("custOne", Name);
//		return vo;
//	}
	
	// insert, delete, update 결과가 int, 파라미터 있음.
	// 위에 3개는 꼭! 반드시! commit을 해야 된다. 안 하면 안 바뀜
	public static int getInsert(VO vo) {
		int result = getSession().insert("custIns", vo);
		ss.commit();
		return result;
	}

	public static int getDelete(VO vo) {
		int result = getSession().delete("custDel", vo);
		ss.commit();
		return result;
	}

	public static int getUpdate(VO vo) {
		int result = getSession().update("custUpdate", vo);
		ss.commit();
		return result;
	}

	public static boolean getIdChk(String custid) {
		boolean result = false;
		VO vo = getSession().selectOne("idChk", custid);
		if (vo == null) {
			result = true;
		}
		return result;
	}
}