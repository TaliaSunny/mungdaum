package com.company.mungdaum.orders;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.company.mungdaum.orders.OrdersVO;
import com.company.mungdaum.util.SqlSessionFactoryBean;

public class OrdersDAO {
private SqlSession mybatis;
	
	public OrdersDAO() {
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}

	public void insertOrders(OrdersVO vo) {
		mybatis.insert("OrdersDAO.insertOrders", vo);
		mybatis.commit();	
	}

	public List<OrdersVO> getOrdersList(OrdersVO vo) {
		return mybatis.selectList("OrdersDAO.getOrdersList", vo);
	}

	public List<OrdersVO> getOrders(OrdersVO vo) {
		return mybatis.selectOne("OrdersDAO.getOrders", vo);
	}

	public void updateOrders(OrdersVO vo) {
		mybatis.update("OrdersDAO.updateOrders", vo);
		mybatis.commit();
	}

	public void deleteOrders(OrdersVO vo) {
		mybatis.delete("OrdersDAO.deleteOrders", vo);
		mybatis.commit();
	}
}
