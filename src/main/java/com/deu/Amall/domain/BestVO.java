package com.deu.Amall.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class BestVO {
	
	private int productId;
	private String productType;
	private String productName;
	private String explanation;
	private String productPrice;
	private int inventory;
	
	private String insrtUserId; 
    private Date insrtDt;
    private String updtUserId;
    private Date updtDt;

}
