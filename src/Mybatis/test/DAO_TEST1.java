package Mybatis.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import Mybatis.com.ict.edu.DBService;

public class DAO_TEST1 {
	private static SqlSession ss;
	
	// 싱글턴 패턴(동기화 처리) :
		private synchronized static SqlSession getSession() {
			if (ss == null) {
				ss = DBService.getFactory().openSession();
			}
			return ss;
		}
		
		// 전체보기
		public static List<VO_TEST1> getList() {
			List<VO_TEST1> list = null;
			list = getSession().selectList("custList");
			return list;
		}
		
		// 삽입
		public static int getInsert(VO_TEST1 vo) {
			int result = getSession().insert("custIns", vo);
			ss.commit();
			return result;
		}
		
		// 삭제
		public static int getDelete(VO_TEST1 vo) {
			int result = getSession().delete("custDel", vo);
			ss.commit();
			return result;
		}
		
		// 검색
		public static VO_TEST1 getOne(String custid) {
			VO_TEST1 vo = getSession().selectOne("custOne", custid);
			return vo;
		}
		
		// 불러오기
		public static int getUpdate(VO_TEST1 vo) {
			int result = getSession().update("custUpdate", vo);
			ss.commit();
			return result;
		}
}
