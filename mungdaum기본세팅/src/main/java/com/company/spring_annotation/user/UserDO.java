package com.company.spring_annotation.user;


// 테이블에는 변환된패스워드 컬럼까지 6개 컬럼이 있지만 멤버 변수는 5개만 설정해줘도 된다. 평문을 변환해서 3번째 컬럼(암호화된패스워드컬럼)으로 넣어 주는 형식으로 처리하면 된다
public class UserDO {
	// 멤버
	private String id;
	private String password;
	private String name;
	private String role;
	
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public String getRole() {return role;}
	public void setRole(String role) {this.role = role;}
	
}
