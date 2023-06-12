package Mybatis.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import Mybatis.com.ict.edu.DBService;
import Mybatis.com.ict.edu.VO;

// DB처리하는 메서드들을 가지고 있는 클래스
public class DAO {
	// 실제 사용하는 클래스 : SqlSession
	private static SqlSession ss;

	// 싱글턴 패턴(동기화 처리) :
	private synchronized static SqlSession getSession() {
		if (ss == null) {
			ss = DBService.getFactory().openSession();
		}
		return ss;
	}

	// DB처리하는 메서드들

	// 전체보기
	// select문이고, 결과는 여러개일 수도 있고, 파라미터가 없음
	public static List<VO> getList() {
		List<VO> list = null;
		list = getSession().selectList("custList");
		return list;
	}

	// 삽입
	public static int getInsert(VO vo) {
		int result = getSession().insert("custIns", vo);
		ss.commit();
		return result;
	}

	// 삭제
	public static int getDelete(VO vo) {
		int result = getSession().delete("custDel", vo);
		ss.commit();
		return result;
	}

	// 검색
	public static VO getOne(String custid) {
		VO vo = getSession().selectOne("custOne", custid);
		return vo;
	}

	// 불러오기
	public static int getUpdate(VO vo) {
		int result = getSession().update("custUpdate", vo);
		ss.commit();
		return result;
	}

}
