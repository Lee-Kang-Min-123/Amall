// 회원테이블 VO

package com.deu.Amall.domain;

import java.util.Date;

import lombok.Data;

@Data
public class MemberVO{
	
	private int userNo;
	private String userType; //시용지 종류
	private String userName; //닉네임
	private String userId;	//아이디
	private String password;	//비번
	private Date birthday;	//생일
	private String gender;	//성별
	private String email;	//이메일
	private String contact;	//연락처
	private String address;	//주소
	
	private String insrtUserId;
	private Date insrtDt;
	private String updtUserId;
	private Date updtDt;

}

