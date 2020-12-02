package com.deu.Amall.service;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.deu.Amall.dao.UserMapper;
import com.deu.Amall.domain.UserVO;
import com.deu.Amall.util.PubMap;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
@Primary
public class UserServiceImpl implements UserService {

	private UserMapper mapper;
	
	@Override
	public void register(UserVO user) {
		
		user.setInsrtUserId(user.getUserId());
		mapper.insert(user);
	}

	@Override
	public PubMap getUser(String userId) {
		return mapper.getUser(userId);
	}
	
}
