package com.deu.Amall.sample;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.deu.Amall.dao.OrderMapper;
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
		order.setOrderAmt(100.00);
		order.setState("OPEN");
		order.setInsrtUserId("stableyoung");
		
		log.info("Hello");
		
		mapper.insertOrderMaster(order);
		
		log.info("Order Id => " + order.getOrderId());
	}

}