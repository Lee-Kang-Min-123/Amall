package com.deu.Amall.service;

import java.util.List;
import com.deu.Amall.util.PubMap;

public interface OrderService {
	
	public PubMap getMaster(int orderId);
	
	public List<PubMap> getList(int orderId);
	
	public int generateOrder(String userId) throws Exception;
}
