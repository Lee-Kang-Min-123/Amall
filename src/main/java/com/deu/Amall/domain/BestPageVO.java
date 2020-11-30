package com.deu.Amall.domain;

import lombok.Data;

@Data
public class BestPageVO {
	
	private int productId;
	private String productType;
	private String productName;
	private String explanation;
	private String productPrice;
	private int inventory;	

}
