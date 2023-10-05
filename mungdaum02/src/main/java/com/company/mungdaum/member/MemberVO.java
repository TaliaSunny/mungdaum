package com.company.mungdaum.member;

import java.util.Date;

public class MemberVO {
	private String MId;			//회원아이디
	private String MPw;			//비밀번호 : 영어,숫자,특수문자 포함 20자리
	private String MName;		//이름
	private String MAddress;	//주소
	private int MPost;			//우편번호 5자리 , 구 우편번호 6자리
	private String MPhone;		//핸드폰 번호 13자리
	private Date MRdate;		//가입일-시스템 날짜 regdate
	private String MJumin;		//주민번호 (-)포함 14자리
	private int MAgree;			//약관동의여부 0-default(true) 1-false
	private int MLevel;			//고객등급 1:nomal 2:vip 3: vvip
	private int MBuy; 			//누적구매수 
	private int MDrop;			//탈퇴여부 0: 존재 1: 탈퇴
	private String Company; 	//기업명
	private String KoreanEID;	//사업자 번호 (-) 포함 12 자리 000-00-00000 형식임
	private String Sector;		//업종

	public String getMId() {return MId;}
	public void setMId(String mId) {MId = mId;}

	public String getMPw() {return MPw;}
	public void setMPw(String mPw) {MPw = mPw;}

	public String getMName() {return MName;}
	public void setMName(String mName) {MName = mName;}

	public String getMAddress() {return MAddress;}
	public void setMAddress(String mAddress) {MAddress = mAddress;}

	public int getMPost() {return MPost;}
	public void setMPost(int mPost) {MPost = mPost;}

	public String getMPhone() {return MPhone;}
	public void setMPhone(String mPhone) {MPhone = mPhone;}

	public Date getMRdate() {return MRdate;}
	public void setMRdate(Date mRdate) {MRdate = mRdate;}

	public String getMJumin() {return MJumin;}
	public void setMJumin(String mJumin) {MJumin = mJumin;}

	public int getMAgree() {return MAgree;}
	public void setMAgree(int mAgree) {MAgree = mAgree;}

	public int getMLevel() {return MLevel;}
	public void setMLevel(int mLevel) {MLevel = mLevel;}

	public int getMBuy() {return MBuy;}
	public void setMBuy(int mBuy) {MBuy = mBuy;}

	public int getMDrop() {return MDrop;}
	public void setMDrop(int mDrop) {MDrop = mDrop;}

	public String getCompany() {return Company;}
	public void setCompany(String company) {Company = company;}

	public String getKoreanEID() {return KoreanEID;}
	public void setKoreanEID(String koreanEID) {KoreanEID = koreanEID;}

	public String getSector() {return Sector;}
	public void setSector(String sector) {Sector = sector;}

	@Override
	public String toString() {
		return "UserDO [MId=" + MId + ", MPw=" + MPw + ", MName=" + MName + ", MAddress=" + MAddress + ", MPost="
				+ MPost + ", MPhone=" + MPhone + ", MRdate=" + MRdate + ", MJumin=" + MJumin + ", MAgree=" + MAgree
				+ ", MLevel=" + MLevel + ", MBuy=" + MBuy + ", MDrop=" + MDrop + ", Company=" + Company + ", KoreanEID="
				+ KoreanEID + ", Sector=" + Sector + "]";
	}



}