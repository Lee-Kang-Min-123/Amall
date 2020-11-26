package com.deu.Amall.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class MemberVO{
	
	private int userNo;
	private String userType;
	private String userName;
	private String userId;
	private String password;
	private Date birthday;
	private String gender;
	private String email;
	private String contact;
	private String address;

}

