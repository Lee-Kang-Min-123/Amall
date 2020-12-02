package com.deu.Amall.domain;

import java.util.Date;

import lombok.Data;

@Data
public class PayVO {
	
	private int payId;
	private String userId;
	private int orderId;
	private double amount;
	private String address;
	private String contact;
	private String creditNum;
	private String creditPass;
	
	private String insrtUserId;
	private Date insrtDt;
	private String updtUserId;
	private Date updtDt;
	


}
