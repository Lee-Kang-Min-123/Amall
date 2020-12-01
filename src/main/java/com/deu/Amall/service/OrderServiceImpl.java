package com.deu.Amall.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.deu.Amall.dao.OrderMapper;
import com.deu.Amall.domain.OrderListVO;
import com.deu.Amall.domain.OrderMasterVO;
import com.deu.Amall.util.PubMap;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
@Primary
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderMapper mapper;
	
	@Override
	public PubMap getMaster(int orderId) {
		return mapper.getMaster(orderId);
	}

	@Override
	public List<PubMap> getList(int orderId) {
		return mapper.getList(orderId);
	}

	@Override
	@Transactional(isolation = Isolation.READ_COMMITTED)
	public int generateOrder(String userId) throws Exception {

		// todo -- check basket is empty
		
		int orderId;
		Date now = new Date();
		
		OrderMasterVO master = new OrderMasterVO();

		master.setOrderDate(now);
		master.setState("OPEN");
		master.setInsrtUserId(userId);

		mapper.insertOrderMaster(master);
		orderId = master.getOrderId();
		
		List<PubMap> basketList = mapper.getBasketList(userId);
		
		for(PubMap m : basketList)
		{
			OrderListVO list = new OrderListVO();
			list.setOrderId(orderId);
			list.setProductId(m.getInt("productId"));
			list.setQty(m.getInt("qty"));
			list.setProductPrice(m.getDouble("productPrice"));
			list.setInsrtUserId(userId);
			
			mapper.insertOrderList(list);
		}
		mapper.updateTotalAmount(orderId);
		
		return orderId;
	}

}
