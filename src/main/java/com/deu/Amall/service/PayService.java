package com.deu.Amall.service;

import com.deu.Amall.domain.PayVO;

public interface PayService {
	
	
	public boolean removeB(String userId);
	
	public boolean removeP(String userId);
	
	public void register(PayVO pay);
	
	public double getAmount(int orderId);
	
	public void update(int orderId, String userId);
	
	public PayVO get(int payId);
	
	
	
	
	

}
