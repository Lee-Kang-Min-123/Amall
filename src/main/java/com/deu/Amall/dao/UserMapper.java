package com.deu.Amall.dao;

import com.deu.Amall.domain.UserVO;
import com.deu.Amall.util.PubMap;

public interface UserMapper {

	public PubMap getUser(String userId);

	public void insert(UserVO user);

	
}
