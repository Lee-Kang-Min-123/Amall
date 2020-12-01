package com.deu.Amall.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.deu.Amall.domain.BasketVO;
import com.deu.Amall.service.BasketService;
import com.deu.Amall.util.PubMap;

public class BasketController {
	
	@Autowired
	BasketService service;

@RequestMapping("insertbasket")
public String insert(@ModelAttribute BasketVO dto, HttpSession session) {
	
	String userid=(String)session.getAttribute("userId");
	if(userid==null) {
		return "redirect:/member/login";
	}
	dto.setUserId(userid);
	service.insert(dto);
	return "redirect:/shop/cart/list.do";
	
}
//cart_list페이지와 맵핑되는 메소드

@RequestMapping("list.do")
public ModelAndView list(HttpSession session, ModelAndView mav) {
    Map<String, Object> map=new HashMap<>();

    String userid=(String)session.getAttribute("userid");

    if(userid!=null) { 
        List<PubMap> list=service.listCart(userid);//장바구니 목록
        int sumMoney=service.sumMoney(userid);//금액 합계
      
       //hasp map에 장바구니에 넣을 각종 값들을 저장함
        map.put("sumMoney", sumMoney);  // ${sumMoney}
        map.put("sum", sumMoney); //전체 금액  // ${sum}
        map.put("list", list); //장바구니 목록  // ${list.
        map.put("count", list.size()); //레코드 갯수

       //ModelAndView mav에 이동할 페이지의 이름과 데이터를 저장한다.

        mav.setViewName("shop/Basket_list"); //이동할 페이지의 이름
        mav.addObject("map", map); //데이터 저장

        return mav; //화면 이동

    }else { //로그인하지 않은 상태

        return new ModelAndView("member/login", "", null);
        //로그인을 하지 않았으면 로그인 페이지로 이동시킨다.
    }
}
}