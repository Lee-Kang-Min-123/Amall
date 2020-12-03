package com.deu.Amall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.deu.Amall.domain.PayVO;
import com.deu.Amall.service.OrderService;
import com.deu.Amall.service.PayService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@AllArgsConstructor
public class PayController {
	
	@Autowired
	private PayService payservice;
	
	@Autowired
	private OrderService orderservice; 	
	
	@GetMapping("/pay")
	public void pay(@RequestParam("userId") String userId, Model model) throws Exception{
		
		log.info("pay pageing..............");
		
		int orderId = orderservice.generateOrder(userId);
		
		model.addAttribute("userId", userId);
		model.addAttribute("orderId", orderId);
		model.addAttribute("amount", payservice.getAmount(orderId));
		

	}
	
	@PostMapping("/pay")
	public String pay(PayVO pay, RedirectAttributes rttr ) {
		
		log.info("register: " + pay);

		payservice.register(pay);
		
		rttr.addFlashAttribute("result", pay.getPayId());
		
		
		
		return "redirect:/paylist?payId="+pay.getPayId();
		
	}
	
	@GetMapping("/paylist")
	public void paylist(@RequestParam("payId") int payId, Model model) {
		log.info("paylist pageing..............");
		
		model.addAttribute("board", payservice.get(payId));
			
		
	}
	
	
	
	
	
	@PostMapping("/payremove")
	public String remove(@RequestParam("orderId") int orderId) {
		
		payservice.removeO(orderId);
		payservice.removeOM(orderId);
		
		return "redirect:/productlist";
	}

	
	
}
