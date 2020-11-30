package com.deu.Amall.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.deu.Amall.domain.LoginDAO;
import com.deu.Amall.domain.LoginVO;

@Service
public class LoginServiceImpl implements LoginService{
	
	 @Inject
	 private LoginDAO dao;
	
	 //로그인
	 @Override
	public LoginVO login(LoginVO loginvo) throws Exception{
		return dao.login(loginvo);
	}

}
