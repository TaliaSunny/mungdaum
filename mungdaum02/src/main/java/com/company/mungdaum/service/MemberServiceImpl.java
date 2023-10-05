package com.company.mungdaum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.mungdaum.member.*;
import com.company.mungdaum.service.*;

@Service
public class MemberServiceImpl implements MemberService{

    @Autowired
    private MemberDao memberDao;

    public int Login(MemberVO vo) throws Exception {
    
        return memberDao.Login(vo);

    }
}