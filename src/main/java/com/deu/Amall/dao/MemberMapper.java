//mapper 인터페이스

package com.deu.Amall.dao;

import com.deu.Amall.domain.MemberVO;

public interface MemberMapper {
	
	//회원가입
	public void insert(MemberVO member);
	
	//로그인
	public void login(MemberVO member);

	
}
