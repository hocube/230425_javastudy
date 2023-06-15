package Mybatis.Test2;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBservice_TEST2 {
private static SqlSessionFactory factory;
static String resource = "mybatis/test2/config.xml";

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
