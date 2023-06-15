package Mybatis.Test2;

import org.apache.ibatis.session.SqlSession;

import Mybatis.test.DBservice_TEST1;

public class DAO_TEST2 {
	private static SqlSession ss;
	
	// 싱글턴 패턴(동기화 처리) :
			private synchronized static SqlSession getSession() {
				if (ss == null) {
					ss = DBservice_TEST1.getFactory().openSession();
				}
				return ss;
			}
}
