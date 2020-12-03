package com.deu.Amall.dao;

import com.deu.Amall.domain.OrderListVO;
import com.deu.Amall.domain.PayVO;

public interface PayMapper {
	

	public double getamount(String userid);
	
	public void insertP(PayVO pay);
	
	public void insertSelectKey(PayVO pay);
	
	public int deleteB(String userid);
	
	public int deleteP(int paymentId);
	
	public void insertO(OrderListVO order);
	
	public double readOrder(int orderId);
	
	public PayVO read(int payId);
	
	public int deleteOM(int orderId);
	
	public int deleteO(int orderId);
	
	

}
