// 회원테이블 VO

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
	
	private String insrtUserId;
	private Date insrtDt;
	private String updtUserId;
	private Date updtDt;

}

