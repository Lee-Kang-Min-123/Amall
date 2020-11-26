package com.deu.Amall.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.deu.Amall.dao.MemberMapper;
import com.deu.Amall.domain.MemberVO;

public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberMapper membermapper;
	
	@Override
	public void insert(MemberVO member) throws Exception {
		
		membermapper.insert(member);
		
	}

}
