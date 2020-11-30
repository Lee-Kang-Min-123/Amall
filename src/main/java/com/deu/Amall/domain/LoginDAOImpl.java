package com.deu.Amall.domain;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDAOImpl implements LoginDAO {

	@Inject 
	private SqlSession sql;
	
	private static String namespace = "com.deu.Amall.memberMapper";;
	
	@Override
	public LoginVO login(LoginVO member) throws Exception {
		
		return sql.selectOne("memberMapper.login", member);
	}
}
