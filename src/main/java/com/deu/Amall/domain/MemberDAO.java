package com.deu.Amall.domain;

public interface MemberDAO {
	
	//회원가입
	public void insert(MemberVO member) throws Exception;
	
	//로그인
	public MemberVO login(MemberVO member) throws Exception;
}
