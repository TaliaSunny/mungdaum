package com.company.mungdaum.util;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryBean {
	private static SqlSessionFactory sessionFactory = null;
	
	static { //Class static 블록 (= 정적 블록) 어떤 클래스의 값을 딱 한번 초기화 시킬 때 사용한다.
		try {
			if(sessionFactory == null) {
				/*
				 * MyBatis 설정파일인 sql-map-config.xml로부터 설정파일을 읽어들이기 위한
				 *  입력스트림(reader)을 생성해야 한다.
				 */
				Reader reader = Resources.getResourceAsReader("sql-map-config.xml");
			
				/*
				 * 그리고 나서 입력 스트림을 통해  sql-map-config.xml파일을 읽어
				 * SqlSessionFactory 객체를 생성한다.
				 */
				sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	public static SqlSession getSqlSessionInstance() {
		return sessionFactory.openSession();
		//sessionFactory를 오픈세션으로 해서 이 객체를 요구하는 곳에 돌려준다. 
	}
}

