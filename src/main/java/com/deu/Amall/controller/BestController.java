package com.deu.Amall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.deu.Amall.service.ProductService;
import com.deu.Amall.util.PubMap;
import com.sun.tools.javac.util.List;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class BestController {
	
	@Autowired
	ProductService productService;
	
	//가격높은순 post
	@RequestMapping(value = "/highprice" ,method =RequestMethod.GET)
	public String getproduct(Model model) throws Exception{
		
		log.info("get list");
		
		List<PubMap> list = productService.getAllProducts();
		
		log.info("list" +list);
		
		model.addAttribute("list",list);
	}

}
