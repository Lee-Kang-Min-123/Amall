// 회원테이블 VO

package com.deu.Amall.domain;

import java.util.Date;

import lombok.Data;

@Data
public class OrderListVO{
	private int orderId;
	private int orderSeq;
	private int productId;
	private int qty;
	private double productPrice;

	private String insrtUserId;
	private Date insrtDt;
	private String updtUserId;
	private Date updtDt;
}

