package com.deu.Amall.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.deu.Amall.dao.TestMapper;
import com.deu.Amall.service.ProductService;
import com.deu.Amall.util.PubMap;

@Controller
@RequestMapping("Amall/product/*")
public class ProductController{
	
	@Inject
	ProductService productService;
	
	//1. 상품 전체 목록
	@RequestMapping("/list.do")
	public ModelAndView list(ModelAndView mav) {
		mav.setViewName("/Amall/ProductList");
		mav.addObject("list", productService.listProduct());
		return mav;
	}
	
	//2. 상품 상세보기
	@RequestMapping("/detail/{productId}")
	public ModelAndView detail(@PathVariable("productId") int productId,
			ModelAndView mav) {
		mav.setViewName("/Amall/ProductDetail");
		mav.addObject("vo",productService.detailProduct(productId));
		return mav;
	}
}
