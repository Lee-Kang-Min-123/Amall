package com.deu.Amall.dao;

import java.util.List;

import com.deu.Amall.util.PubMap;

public interface BestMapper {
	
	public List<PubMap> getAllProducts();
	public void insert(com.deu.Amall.domain.BestVO bestVO);
	public PubMap getBest(int productId);

}
