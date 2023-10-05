package com.company.mungdaum.util;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryBean {
private static SqlSessionFactory sessionFactory = null;
	
	static { //Class static 블록 (= ?��?�� 블록) ?��?�� ?��?��?��?�� 값을 ?�� ?���? 초기?�� ?��?�� ?�� ?��?��?��?��.
		try {
			if(sessionFactory == null) {
				/*
				 * MyBatis ?��?��?��?��?�� sql-map-config.xml로�??�� ?��?��?��?��?�� ?��?��?��?���? ?��?��
				 *  ?��?��?��?���?(reader)?�� ?��?��?��?�� ?��?��.
				 */
				Reader reader = Resources.getResourceAsReader("sql-map-config.xml");
			
				/*
				 * 그리�? ?��?�� ?��?�� ?��?��림을 ?��?��  sql-map-config.xml?��?��?�� ?��?��
				 * SqlSessionFactory 객체�? ?��?��?��?��.
				 */
				sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	public static SqlSession getSqlSessionInstance() {
		return sessionFactory.openSession();
		//sessionFactory�? ?��?��?��?��?���? ?��?�� ?�� 객체�? ?��구하?�� 곳에 ?��?���??��. 
	}
}
