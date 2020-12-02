package com.deu.Amall.service;

import javax.servlet.http.HttpSession;

import com.deu.Amall.domain.LoginVO;
import com.deu.Amall.util.PubMap;

public interface LoginService {
	
	//로그인
	public int login(LoginVO loginvo) throws Exception;

	//로그아웃
	public void logout(HttpSession session) throws Exception;
}
