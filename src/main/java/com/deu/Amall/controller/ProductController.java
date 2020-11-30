package com.deu.Amall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.deu.Amall.service.ProductService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class ProductController{
	
	@Autowired
	ProductService productService;
	
	//1. 상품 전체 목록
	@RequestMapping("/productlist")
	public ModelAndView list(ModelAndView mav) {
		log.info("1234");
		mav.setViewName("Productlist");
		mav.addObject("list", productService.getAllProducts());
		return mav;
	}
	
}
