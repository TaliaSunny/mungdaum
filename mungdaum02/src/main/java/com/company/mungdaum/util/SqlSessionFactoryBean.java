package com.company.mungdaum.util;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryBean {
private static SqlSessionFactory sessionFactory = null;
	
	static { //Class static ë¸”ë¡ (= ? •?  ë¸”ë¡) ?–´?–¤ ?´?˜?Š¤?˜ ê°’ì„ ?”± ?•œë²? ì´ˆê¸°?™” ?‹œ?‚¬ ?•Œ ?‚¬?š©?•œ?‹¤.
		try {
			if(sessionFactory == null) {
				/*
				 * MyBatis ?„¤? •?ŒŒ?¼?¸ sql-map-config.xmlë¡œë??„° ?„¤? •?ŒŒ?¼?„ ?½?–´?“¤?´ê¸? ?œ„?•œ
				 *  ?…? ¥?Š¤?Š¸ë¦?(reader)?„ ?ƒ?„±?•´?•¼ ?•œ?‹¤.
				 */
				Reader reader = Resources.getResourceAsReader("sql-map-config.xml");
			
				/*
				 * ê·¸ë¦¬ê³? ?‚˜?„œ ?…? ¥ ?Š¤?Š¸ë¦¼ì„ ?†µ?•´  sql-map-config.xml?ŒŒ?¼?„ ?½?–´
				 * SqlSessionFactory ê°ì²´ë¥? ?ƒ?„±?•œ?‹¤.
				 */
				sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	public static SqlSession getSqlSessionInstance() {
		return sessionFactory.openSession();
		//sessionFactoryë¥? ?˜¤?”ˆ?„¸?…˜?œ¼ë¡? ?•´?„œ ?´ ê°ì²´ë¥? ?š”êµ¬í•˜?Š” ê³³ì— ?Œ? ¤ì¤??‹¤. 
	}
}
