package com.deu.Amall.service;

import com.deu.Amall.domain.LoginVO;
import com.deu.Amall.util.PubMap;

public interface LoginService {
	
	//로그인
	public PubMap login(LoginVO loginvo) throws Exception;

}
