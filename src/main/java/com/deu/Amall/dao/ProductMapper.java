package com.deu.Amall.dao;

import java.util.List;

import com.deu.Amall.util.PubMap;

public interface ProductMapper {
	
	public List<PubMap> getAllProducts();
	public void insert(com.deu.Amall.domain.ProductVO productVO);
	public PubMap getProduct(int productId);
	
	/*
	@Select("SELECT COUNT(*) totalCnt FROM product")
	public int getTotalCnt();
	*/

}
