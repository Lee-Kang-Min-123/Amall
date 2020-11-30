// 회원테이블 VO

package com.deu.Amall.domain;

import lombok.Data;

@Data
public class LoginVO{
	
	private String userType;
	private String userId;	//아이디
	private String password;	//비번
	
	

}

