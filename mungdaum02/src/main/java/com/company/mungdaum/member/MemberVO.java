package com.company.mungdaum.member;

import java.util.Date;

public class MemberVO {
	private String MId;			//ȸ�����̵�
	private String MPw;			//��й�ȣ : ����,����,Ư������ ���� 20�ڸ�
	private String MName;		//�̸�
	private String MAddress;	//�ּ�
	private int MPost;			//�����ȣ 5�ڸ� , �� �����ȣ 6�ڸ�
	private String MPhone;		//�ڵ��� ��ȣ 13�ڸ�
	private Date MRdate;		//������-�ý��� ��¥ regdate
	private String MJumin;		//�ֹι�ȣ (-)���� 14�ڸ�
	private int MAgree;			//������ǿ��� 0-default(true) 1-false
	private int MLevel;			//����� 1:nomal 2:vip 3: vvip
	private int MBuy; 			//�������ż� 
	private int MDrop;			//Ż�𿩺� 0: ���� 1: Ż��
	private String Company; 	//�����
	private String KoreanEID;	//����� ��ȣ (-) ���� 12 �ڸ� 000-00-00000 ������
	private String Sector;		//����

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