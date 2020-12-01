package com.deu.Amall.domain;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class ProductVO {
    
    private int productId; // 상품번호
    private String productType; // 상품종류
    private int productName; // 상품이름
    private String explanation; // 상품설명
    private String productPrice; //상품가격
    private int inventory;//상품재고
    
    private String insrtUserId; 
    private Date insrtDt;
    private String updtUserId;
    private Date updtDt;
   //INSERT INTO PRODUCT VALUES(3,'newbalance',80000,'420v2','adidas.jpg');
    
}