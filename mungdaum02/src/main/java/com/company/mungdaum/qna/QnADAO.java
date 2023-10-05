package com.company.mungdaum.qna;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.company.mungdaum.qna.QnAVO;
import com.company.mungdaum.util.SqlSessionFactoryBean;

public class QnADAO {
private SqlSession mybatis;
	
	public QnADAO() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}

	public void insertQnA(QnAVO vo) {
		mybatis.insert("QnADAO.insertQnA", vo);
		mybatis.commit();	
	}

	public List<QnAVO> getQnAList(QnAVO vo) {
		return mybatis.selectList("QnADAO.getQnAList", vo);
	}

	public List<QnAVO> getQnA(QnAVO vo) {
		return mybatis.selectOne("QnADAO.getQnA", vo);
	}

	public void updateQnA(QnAVO vo) {
		mybatis.update("QnADAO.updateQnA", vo);
		mybatis.commit();
	}

	public void deleteQnA(QnAVO vo) {
		mybatis.delete("QnADAO.deleteQnA", vo);
		mybatis.commit();
	}
}
