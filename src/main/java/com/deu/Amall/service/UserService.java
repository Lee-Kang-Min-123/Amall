package com.deu.Amall.service;

import java.util.List;

import com.deu.Amall.domain.UserVO;
import com.deu.Amall.util.PubMap;

public interface UserService {
	
	public void register(UserVO user);

	public PubMap getUser(String userId);
	
	}
