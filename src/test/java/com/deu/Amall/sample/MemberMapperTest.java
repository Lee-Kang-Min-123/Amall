package com.deu.Amall.sample;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.deu.Amall.dao.MemberMapper;
import com.deu.Amall.domain.MemberVO;

public class MemberMapperTest {
	
	@Autowired
	private MemberMapper membermapper; //MemberMapper.java 인터페이스
	
	//회원가입 테스트
	@Test
	public void insert() throws Exception{
		
		MemberVO member = new MemberVO();
		
		member.setUserName("spring_test"); //회원이름
		member.setUserId("spring_test"); //회원id
		member.setPassword("spring_test"); //회원이름
		member.setBirthday(birthday); //회원생일
		member.setGender("spring_test"); //회원성별
		member.setEmail("spring_test");
		member.setAddress("spring_test");
		
		membermapper.insert(member);
	}

}
