package com.company.mungdaum.wishlist;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.company.mungdaum.wishlist.WishlistVO;
import com.company.mungdaum.util.SqlSessionFactoryBean;

public class WishlistDAO {
private SqlSession mybatis;
	
	public WishlistDAO() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}

	public void insertWishlist(WishlistVO vo) {
		mybatis.insert("WishlistDAO.insertWishlist", vo);
		mybatis.commit();	
	}

	public void deleteWishlist(WishlistVO vo) {
		mybatis.delete("WishlistDAO.deleteWishlist", vo);
		mybatis.commit();
	}
}
