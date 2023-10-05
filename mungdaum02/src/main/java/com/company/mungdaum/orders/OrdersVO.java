package com.company.mungdaum.orders;

import java.sql.Date;

public class OrdersVO {

	private int ONo; //�ֹ���ȣ
	private Date ORdate; //�ֹ���
	private String OName; //������
	private String OPhone; //�����ڿ���ó
	private String OAddress; //�������ּ�
	private String OPost; //�����ڿ����ȣ
	private int OAmount; //�ֹ��ѱݾ�
	private int ORpm; //�������
	private int OPayment; //��������
	
	//getter, setter
	
	public int getONo() {
		return ONo;
	}
	public void setONo(int oNo) {
		ONo = oNo;
	}
	public Date getORdate() {
		return ORdate;
	}
	public void setORdate(Date oRdate) {
		ORdate = oRdate;
	}
	public String getOName() {
		return OName;
	}
	public void setOName(String oName) {
		OName = oName;
	}
	public String getOPhone() {
		return OPhone;
	}
	public void setOPhone(String oPhone) {
		OPhone = oPhone;
	}
	public String getOAddress() {
		return OAddress;
	}
	public void setOAddress(String oAddress) {
		OAddress = oAddress;
	}
	public String getOPost() {
		return OPost;
	}
	public void setOPost(String oPost) {
		OPost = oPost;
	}
	public int getOAmount() {
		return OAmount;
	}
	public void setOAmount(int oAmount) {
		OAmount = oAmount;
	}
	public int getORpm() {
		return ORpm;
	}
	public void setORpm(int oRpm) {
		ORpm = oRpm;
	}
	public int getOPayment() {
		return OPayment;
	}
	public void setOPayment(int oPayment) {
		OPayment = oPayment;
	}
	
	@Override
	public String toString() {
		return "OrdersVO [ONo=" + ONo + ", ORdate=" + ORdate + ", OName=" + OName + ", ONo=" + ONo + ", OPhone=" 
	+ OPhone + ", OAddress=" + OAddress + ", OPost=" + OPost + ", OAmount=" + OAmount + ", ORpm=" + ORpm + ", OPayment=" + OPayment + "]";
	}
	
}
