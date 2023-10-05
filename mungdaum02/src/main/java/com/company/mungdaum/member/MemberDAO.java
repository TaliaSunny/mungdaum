package com.company.mungdaum.member;

//�ش� �Ʒ� ������ ��� ���̺��̵� ����ǰ� ���ϴ�.
import org.apache.ibatis.session.SqlSession;
import com.company.mungdaum.util.SqlSessionFactoryBean;

public class MemberDAO {
	private SqlSession mybatis; //� table�̵� ������� ����ǰ� ���� �κ� 

	//������ (�̺κ��� � table�̵� ���� �۾� �κ� )!
	public MemberDAO() {
		//mybatis �ν��Ͻ� ��ü ����� :CRUD �۾��� Mybatis�� ���ؼ� �ϰڴ�.
		/*
		 * SqlSessionFactoryBeanŬ������ SqlSessionInstance�� ȣ���ؼ� �����ϰڴ�. 
		 */
		mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
	}

	//business component logic 
	//UserDO do�� �ۼ��Ϸ��� ������ do�� �ۼ��� for�� ���� Ư�� ����� �ϴ� �ܾ��

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