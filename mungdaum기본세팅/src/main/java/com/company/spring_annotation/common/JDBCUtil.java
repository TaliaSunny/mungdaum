package com.company.spring_annotation.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class JDBCUtil {
	static final String driver = "org.h2.Driver";
	static final String url = "jdbc:h2:tcp://localhost/~/test";
	
	public static Connection getConnection() throws Exception {	// ���⼭ ���ܰ� �߻��ϸ� �̰� ����� BoardDAO, UserDAO������ �����ڴ�
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, "sa", "");
			return con;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return null;
	}
	
	public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		if(rs != null) {
			try {
				if (!rs.isClosed())	rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				rs = null;
			}
		}
		
		if(pstmt != null) {
			try {
				if (!pstmt.isClosed()) pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				pstmt = null;				
			}
		}
		
		if(conn != null) {
			try {
				if (!conn.isClosed()) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				conn = null;
			}
		}
	}
	
	public static void close(PreparedStatement pstmt, Connection conn) {
				
		if(pstmt != null) {
			try {
				if (!pstmt.isClosed()) pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				pstmt = null;				
			}
		}
		
		if(conn != null) {
			try {
				if (!conn.isClosed()) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				conn = null;
			}
		}
	}
}
