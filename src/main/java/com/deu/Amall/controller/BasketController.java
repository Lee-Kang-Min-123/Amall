package com.deu.Amall.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.deu.Amall.domain.BasketVO;
import com.deu.Amall.service.BasketService;
import com.deu.Amall.util.PubMap;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class BasketController {
	
@Autowired
BasketService service;

@RequestMapping("insertbasket")
public String insert(@ModelAttribute BasketVO dto, HttpSession session) {
	
	String userid=(String)session.getAttribute("userId");
	dto.setUserId(userid);
	service.insert(dto);
	return "Basketlist";
	
}

//basket_list페이지와 맵핑되는 메소드
@RequestMapping("Basketlist")
public ModelAndView list(HttpSession session, ModelAndView mav) {
    Map<String, Object> map=new HashMap<>();

    // String userid=(String)session.getAttribute("userid");
    	String userid = "stableyoung";
    	
        List<PubMap> list=service.listBasket(userid);

        int sumMoney=service.sumMoney(userid);//금액 합계    	
       //hasp map에 장바구니에 넣을 각종 값들을 저장함
        map.put("sumMoney", sumMoney);  // ${sumMoney}
        map.put("list", list); //장바구니 목록  // ${list}
        map.put("count", list.size()); //레코드 갯수

       //ModelAndView mav에 이동할 페이지의 이름과 데이터를 저장한다.

        mav.setViewName("Basketlist"); //이동할 페이지의 이름
        mav.addObject("map", map); //데이터 저장

        return mav; //화면 이동

    
}
@GetMapping("/deleteproduct")
public String dtelee(@RequestParam("product_id") int productId) {
    service.delete(productId);
    return "Basketlist";
}

@RequestMapping("deleteAll")
public String deleteAll(HttpSession session) {
    String userid=(String)session.getAttribute("userId");
    service.deleteAll(userid);
    return "Basketlist";
}
@GetMapping("/Productlist2")
void productlist2() {
}
@GetMapping("/pay?userId=stableyoung")
void pay() {
}
}

