package com.deu.Amall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.deu.Amall.service.OrderService;
import com.deu.Amall.util.PubMap;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class OrderController{
	
	@Autowired
	OrderService service;
	
	//1. 주문 목록
	@GetMapping("/order")
	public void order(@RequestParam("orderId") int orderId, Model model) {
		log.info("/order");
		
		PubMap order = service.getMaster(orderId);
		List<PubMap> list = service.getList(orderId);
		
		model.addAttribute("order", order );
		model.addAttribute("list", list );
	}
	
}
