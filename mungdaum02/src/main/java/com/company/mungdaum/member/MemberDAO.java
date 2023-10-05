package com.company.mungdaum.member;

//해당 아래 두줄은 어느 테이블이든 공통되게 들어갑니다.
import org.apache.ibatis.session.SqlSession;
import com.company.mungdaum.util.SqlSessionFactoryBean;

public class MemberDAO {
	private SqlSession mybatis; //어떤 table이든 관계없이 공통되게 들어가는 부분 

	//생성자 (이부분은 어떤 table이든 공통 작업 부분 )!
	public MemberDAO() {
		//mybatis 인스턴스 객체 만들기 :CRUD 작업을 Mybatis를 통해서 하겠다.
		/*
		 * SqlSessionFactoryBean클래스의 SqlSessionInstance를 호출해서 리턴하겠다. 
		 */
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}

	//business component logic 
	//UserDO do로 작성하려고 했으나 do로 작성시 for과 같이 특정 기능을 하는 단어라서

    public void insertMember(MemberVO vo) {
        mybatis.insert("MemberDAO.insertUser", vo);
        mybatis.commit();
    }

    public MemberVO login(MemberVO vo) {
        return mybatis.selectOne("MemberDAO.login", vo);
    }

    public void deleteMember(String MId) {
        mybatis.delete("MemberDAO.deleteUser", MId);
        mybatis.commit();
    }

    public void updateMember(MemberVO vo) {
        mybatis.update("MemberDAO.updateUser", vo);
        mybatis.commit();
    }
    public void saveLoggedInUser(MemberVO vo) {
        mybatis.insert("MemberDAO.saveLoggedInUser",vo );
        mybatis.commit();
    }
}