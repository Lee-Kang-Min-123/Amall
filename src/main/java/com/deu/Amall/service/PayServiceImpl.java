package com.deu.Amall.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.deu.Amall.dao.PayMapper;
import com.deu.Amall.domain.PayVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
@Primary
public class PayServiceImpl implements PayService {
	
	@Autowired
	private PayMapper mapper;
	
	
	
	
	
	@Override
	public boolean removeB(String userid) {
		
		return mapper.deleteB(userid) == 1;
	}
	
	@Override
	public boolean removeP(int paymentId) {
		
		return mapper.deleteP(paymentId) == 1;
	}
	
	@Override
	public void register(PayVO pay) {
		
		pay.setInsrtUserId(pay.getUserId());
		
		mapper.insertP(pay);
	}
	
	@Override
	public double getAmount(int orderId) {
		
		double amount;
		
		amount = mapper.readOrder(orderId);
		
		return amount;
	}
	
	@Override
	public void update(int orderId, String userId) {
		
		double amount;
		Date now = new Date();
		
		PayVO vo = new PayVO();
		
		vo.setInsrtDt(now);
		vo.setInsrtUserId(userId);
		vo.setUpdtDt(now);
		vo.setUpdtUserId(userId);
		vo.setUserId(userId);
		
		amount = mapper.readOrder(orderId);
		vo.setAmount(amount);
		
		mapper.insertP(vo);
		
		amount = mapper.readOrder(orderId);
		vo.setAmount(amount);
		
	
	}
	
	@Override
	public PayVO get(int paymentId) {

		log.info("get......" + paymentId);

		return mapper.read(paymentId);

	}
	@Override
	public boolean removeOM(int orderId) {
		
		return mapper.deleteOM(orderId) == 1;
	}
	
	@Override
	public boolean removeO(int orderId) {
		
		return mapper.deleteO(orderId) == 1;
	}

}
