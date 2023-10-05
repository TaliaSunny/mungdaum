package com.company.mungdaum.member;

 
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.company.mungdaum.member.MemberVO;

@Repository
public class MemberDao {

    @Autowired
    private SqlSessionTemplate mybatis;

    public int Login(MemberVO vo) throws Exception {
        return mybatis.selectOne("Member.Login", vo);
    }

}