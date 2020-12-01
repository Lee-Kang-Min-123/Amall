package com.deu.Amall.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BasketVO {
	private String userId;
	private int productId;
	private int productPrice;
	private int qty;
	private String insrtUserId;
	private Date insrtDt;
	private String updtUserId;
	private Date updtDt;
}
