//mapper 인터페이스

package com.deu.Amall.dao;

import com.deu.Amall.domain.MemberVO;

public interface MemberMapper {
	
	
	//로그인
	public void login(MemberVO member);

	
}
