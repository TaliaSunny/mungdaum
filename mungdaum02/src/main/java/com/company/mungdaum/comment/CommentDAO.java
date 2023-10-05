package com.company.mungdaum.comment;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.company.mungdaum.comment.CommentVO;
import com.company.mungdaum.util.SqlSessionFactoryBean;

public class CommentDAO {
private SqlSession mybatis;
	
	public CommentDAO() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}

	public void insertComment(CommentVO vo) {
		mybatis.insert("CommentDAO.insertComment", vo);
		mybatis.commit();	
	}

	public List<CommentVO> getQnAList(CommentVO vo) {
		return mybatis.selectList("CommentDAO.getCommentList", vo);
	}

	public List<CommentVO> getComment(CommentVO vo) {
		return mybatis.selectOne("CommentDAO.getComment", vo);
	}

	public void deleteComment(CommentVO vo) {
		mybatis.delete("CommentDAO.deleteComment", vo);
		mybatis.commit();
	}
}
