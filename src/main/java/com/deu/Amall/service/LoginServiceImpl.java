package com.deu.Amall.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.deu.Amall.dao.LoginMapper;
import com.deu.Amall.domain.LoginVO;
import com.deu.Amall.util.PubMap;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
@Primary
public class LoginServiceImpl implements LoginService{
	
	 @Autowired
	 LoginMapper mapper;
	
	 //로그인
	 @Override
	 public PubMap login(LoginVO loginvo) throws Exception{
		return mapper.login(loginvo);
	 }
	 
	 //로그아웃
	 @Override
	 public void logout(HttpSession session) throws Exception{
		 session.invalidate();
	 }
	 

}
