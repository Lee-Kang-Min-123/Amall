package com.deu.Amall.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.deu.Amall.domain.MemberDAO;
import com.deu.Amall.domain.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	
	 @Inject
	 private MemberDAO dao;
	
	//회원가입
	@Override
	public void insert(MemberVO member) throws Exception {
		
		dao.insert(member);
		
	}

}
