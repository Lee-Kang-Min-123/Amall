package com.deu.Amall.service;

import javax.inject.Inject;

import com.deu.Amall.domain.MemberDAO;
import com.deu.Amall.domain.MemberVO;

public class MemberServiceImpl implements MemberService{
	
	@Inject MemberDAO dao;
	
	@Override
	public void register(MemberVO vo) throws Exception {
		
		dao.register(vo);
		
	}

}
