package com.deu.Amall.domain;
import java.util.Date;

import lombok.Data;

@Data
public class UserVO {

	private String userId;
	private String userType;
	private String userName;
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
