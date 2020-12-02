package com.deu.Amall.dao;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.deu.Amall.domain.UserVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class UserMapperTests {

	@Autowired
	private UserMapper mapper;
	
	/*	
	@Test
	public void testGetList()
{
		mapper.getList().forEach(user->Log.info(user));
}
*/
	
	@Test
	public void testInsert() {
		UserVO user = new UserVO();
		
		Date Now = new Date();
		
		user.setUserId("ID");
		user.setPassword("password");
		user.setBirthday(Now);
		user.setGender("gender");
		user.setEmail("email");
		user.setContact("contact");
		user.setAddress("address");
		user.setInsrtUserId("stableyoung");
		
		mapper.insert(user);
		
		log.info(user);
	}
}
