package com.company.mungdaum.comment;

import java.sql.Date;

public class CommentVO {
	private int CNo; //댓글번호
	private String CContent; //댓글내용
	private Date CRdate; //작성일

	//getter, setter
	
	public int getCNo() {
		return CNo;
	}
	public void setCNo(int cNo) {
		CNo = cNo;
	}
	public String getCContent() {
		return CContent;
	}
	public void setCContent(String cContent) {
		CContent = cContent;
	}
	public Date getCRdate() {
		return CRdate;
	}
	public void setCRdate(Date cRdate) {
		CRdate = cRdate;
	}

	@Override
	public String toString() {
		return "CommentVO [CNo=" + CNo + ", CContent=" + CContent + ", CRdate=" + CRdate + "]";
	}
}
