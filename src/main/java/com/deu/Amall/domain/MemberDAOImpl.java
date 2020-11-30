package com.deu.Amall.domain;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject 
	private SqlSession sql;
	
	private static String namespace = "com.deu.Amall.memberMapper";;
	
	@Override
	public MemberVO login(MemberVO member) throws Exception {
		
		return sql.selectOne("memberMApper.login", member);
	}
}
