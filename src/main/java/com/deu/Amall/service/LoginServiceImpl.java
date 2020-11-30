package com.deu.Amall.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.deu.Amall.dao.LoginMapper;
import com.deu.Amall.domain.LoginVO;
import com.deu.Amall.util.PubMap;

@Service
public class LoginServiceImpl implements LoginService{
	
	 @Inject
	 LoginMapper mapper;
	
	 //로그인
	 @Override
	 public PubMap login(LoginVO loginvo) throws Exception{
		return mapper.login(loginvo);
	 }
	 
	 //로그아웃
	 @Override
	 public void logout(HttpSession session) throws Exception{
		// session.invalidate();
	 }

}
