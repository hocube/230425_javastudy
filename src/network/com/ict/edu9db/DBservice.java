package network.com.ict.edu9db;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBservice {
	private static SqlSessionFactory factory;
	static String resource = "network/com/ict/edu9db/config.xml";

	static {
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
		}
	}

	public static SqlSessionFactory getFactory() {
		return factory;
	}
}
