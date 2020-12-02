package com.deu.Amall.sample;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.deu.Amall.dao.LoginMapper;
import com.deu.Amall.domain.LoginVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class LoginMapperTest {
	
	@Autowired
	private LoginMapper Loginmapper; //MemberMapper.java 인터페이스
	
	//로그인 테스트
	@Test
	public void login() throws Exception{
		
		LoginVO loginvo = new LoginVO();
		
	
		loginvo.setUserId("spring_test"); //회원id
		loginvo.setPassword("spring_test"); //회원이름
		
		Loginmapper.login(loginvo);
	}

}
