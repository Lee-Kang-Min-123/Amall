package com.deu.Amall.service;

import java.util.List;

import com.deu.Amall.domain.ProductVO;
import com.deu.Amall.util.PubMap;
 
public interface ProductService {
 
    
	public List<PubMap> getAllProducts();
    void insertProduct(ProductVO vo);
	
}