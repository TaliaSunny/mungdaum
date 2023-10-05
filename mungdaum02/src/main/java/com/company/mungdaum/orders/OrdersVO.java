package com.company.mungdaum.orders;

import java.sql.Date;

public class OrdersVO {

	private int ONo; //주문번호
	private Date ORdate; //주문일
	private String OName; //수령자
	private String OPhone; //수령자연락처
	private String OAddress; //수령지주소
	private String OPost; //수령자우편번호
	private int OAmount; //주문총금액
	private int ORpm; //정기결제
	private int OPayment; //결제수단
	
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
