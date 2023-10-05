package com.company.spring_annotation.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.company.spring_annotation.common.JDBCUtil;
import com.company.spring_annotation.common.PasswordEncryptUtil;

public class UserDAO {
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	String pwEncrypt = null;	//전역 참조변수 
	
	private final String USER_GET 
		= "select * from users where id=? AND password=?";
	
	public UserDO getUser(UserDO userDO) {
		UserDO user = null;			
		
		try {
			System.out.println("===> getUser() 메소드 처리됨.");
			
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(USER_GET);
			pstmt.setString(1, userDO.getId());
			pstmt.setString(2, userDO.getPassword());
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				user = new UserDO();
				user.setId(rs.getString("ID"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setName(rs.getString("NAME"));
				user.setRole(rs.getString("Role"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return user;
	}//end getUser() ========================================================================
	
	//회원가입 데이터 등록 메소드 구현
	public void insertUser(UserDO userDO) {
		System.out.println("===> insertUser() 메소드 구현되었습니다.");
		
		String USER_INSERT = "insert into users values(?,?,?,?,?)";
		
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(USER_INSERT);
			pstmt.setString(1, userDO.getId());
			pstmt.setString(2, userDO.getPassword());
			//입력 받은 패스워드를 암호화 시켜 세 번째 물음표 값으로 지정한다.
			String plainText = userDO.getPassword();
			pwEncrypt = PasswordEncryptUtil.encryptSHA256(plainText);
			pstmt.setString(3, pwEncrypt);
			pstmt.setString(4, userDO.getName());
			pstmt.setString(5, userDO.getRole());
			pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("insertUser() " + e);
		}finally {
			JDBCUtil.close(pstmt, conn);
		}
	}
	
}
