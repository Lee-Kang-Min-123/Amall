package com.deu.Amall.sample;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.deu.Amall.dao.MemberMapper;
import com.deu.Amall.domain.MemberVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemberMapperTest {
	
	@Autowired
	private MemberMapper membermapper; //MemberMapper.java 인터페이스
	
	//로그인 테스트
	@Test
	public void login() throws Exception{
		
		MemberVO member = new MemberVO();
		
	
		member.setUserId("spring_test"); //회원id
		member.setPassword("spring_test"); //회원이름
		
		membermapper.login(member);
	}

}
