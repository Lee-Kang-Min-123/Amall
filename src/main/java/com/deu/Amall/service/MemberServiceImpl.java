package com.deu.Amall.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.deu.Amall.domain.MemberDAO;
import com.deu.Amall.domain.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	
	 @Inject
	 private MemberDAO dao;
	
	 //로그인
	 @Override
		public MemberVO login(MemberVO member) throws Exception{
			return dao.login(member);
		}

}
