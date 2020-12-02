//mapper 인터페이스

package com.deu.Amall.dao;

import com.deu.Amall.domain.LoginVO;
import com.deu.Amall.util.PubMap;

public interface LoginMapper {
	
	//로그인
	public int login(LoginVO loginvo);
	

	
}
