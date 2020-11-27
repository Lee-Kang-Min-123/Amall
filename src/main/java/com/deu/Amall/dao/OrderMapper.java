//mapper 인터페이스

package com.deu.Amall.dao;

import java.util.List;

import com.deu.Amall.domain.OrderListVO;
import com.deu.Amall.domain.OrderMasterVO;
import com.deu.Amall.util.PubMap;

public interface OrderMapper {
	
	public OrderMasterVO getMaster(int orderId);
	
	public List<PubMap> getList(int orderId);
	
	public int insertOrderMaster(OrderMasterVO master);
	
	public int insertOrderList(OrderListVO detail);
	
}
