package com.deu.Amall.domain;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject SqlSession sql;
	
	// 회원가입

	@Override
	public void insert(MemberVO member) throws Exception {
		sql.insert("memberMapper.register", member);
	}
	
	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
