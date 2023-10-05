package com.company.mungdaum.qna;

import java.sql.Date;

public class QnAVO {
	private int QId; //QnA��ȣ
	private int QCategory; //ī�װ�
	private String QWriter; //�ۼ���
	private String QPw; //��й�ȣ
	private String QTitle; //����
	private String QContent; //����
	private String QFile; //÷������
	private Date QRdate; //�ۼ���
	private int QSecret; //��п���
	private int QHit; //��ȸ��
	
	//getter, setter
	
	public int getQId() {
		return QId;
	}
	public void setQId(int qId) {
		QId = qId;
	}
	public int getQCategory() {
		return QCategory;
	}
	public void setQCategory(int qCategory) {
		QCategory = qCategory;
	}
	public String getQWriter() {
		return QWriter;
	}
	public void setQWriter(String qWriter) {
		QWriter = qWriter;
	}
	public String getQPw() {
		return QPw;
	}
	public void setQPw(String qPw) {
		QPw = qPw;
	}
	public String getQTitle() {
		return QTitle;
	}
	public void setQTitle(String qTitle) {
		QTitle = qTitle;
	}
	public String getQContent() {
		return QContent;
	}
	public void setQContent(String qContent) {
		QContent = qContent;
	}
	public String getQFile() {
		return QFile;
	}
	public void setQFile(String qFile) {
		QFile = qFile;
	}
	public Date getQRdate() {
		return QRdate;
	}
	public void setQRdate(Date qRdate) {
		QRdate = qRdate;
	}
	public int getQSecret() {
		return QSecret;
	}
	public void setQSecret(int qSecret) {
		QSecret = qSecret;
	}
	public int getQHit() {
		return QHit;
	}
	public void setQHit(int qHit) {
		QHit = qHit;
	}
	
	@Override
	public String toString() {
		return "QnAVO [QId=" + QId + ", QCategory=" + QCategory + ", QWriter=" + QWriter + ", QPw=" + QPw + ", QTitle=" 
	+ QTitle + ", QContent=" + QContent + ", QFile=" + QFile + ", QRdate=" + QRdate + ", QSecret=" + QSecret + ", QHit=" + QHit + "]";
	}
	
}
