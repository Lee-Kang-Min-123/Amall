package com.deu.Amall.sample;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.deu.Amall.dao.OrderMapper;
import com.deu.Amall.domain.OrderListVO;
import com.deu.Amall.domain.OrderMasterVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class OrderMapperTests {
	
	@Autowired
	private OrderMapper mapper; 
	
	@Test
	public void insert() throws Exception{
		OrderMasterVO order = new OrderMasterVO();
		
		Date Now = new Date();
		
		order.setOrderDate(Now);
		order.setState("OPEN");
		order.setInsrtUserId("stableyoung");

		mapper.insertOrderMaster(order);
		
		int orderId = order.getOrderId();
		
		log.info("Order Id => " + orderId );
		
		OrderListVO orderlist = new OrderListVO();
		
		orderlist.setOrderId(orderId);
		orderlist.setProductId(1);
		orderlist.setQty(1000);
		orderlist.setProductPrice(1000);
		orderlist.setInsrtUserId("stableyoung");
		
		mapper.insertOrderList(orderlist);

		orderlist.setOrderId(orderId);
		orderlist.setProductId(2);
		orderlist.setQty(100);
		orderlist.setProductPrice(500);
		orderlist.setInsrtUserId("stableyoung");
		
		mapper.insertOrderList(orderlist);
		
		mapper.updateTotalAmount(orderId);
	}

}
