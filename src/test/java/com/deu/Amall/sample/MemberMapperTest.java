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
	
	//회원가입 테스트
	@Test
	public void insert() throws Exception{
		
		MemberVO member = new MemberVO();
		
		Date Now = new Date();
		
		member.setUserType("spring_test");
		member.setUserName("spring_test"); //회원이름
		member.setUserId("spring_test"); //회원id
		member.setPassword("spring_test"); //회원이름
		member.setBirthday(Now); //회원생일
		member.setGender("spring_test"); //회원성별
		member.setEmail("spring_test");
		member.setContact("spring_test");
		member.setAddress("spring_test");
		
		member.setInsrtUserId("test");
		member.setInsrtDt(Now);
		member.setUpdtUserId("test");
		member.setUpdtDt(Now);
		
		membermapper.insert(member);
	}

}
