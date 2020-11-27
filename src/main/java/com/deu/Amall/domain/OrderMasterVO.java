// 회원테이블 VO

package com.deu.Amall.domain;

import java.util.Date;

import lombok.Data;

@Data
public class OrderMasterVO{
	private int orderId;
	private Date orderDate;
	private double orderAmt;
	private String state;

	private String insrtUserId;
	private Date insrtDt;
	private String updtUserId;
	private Date updtDt;
}

