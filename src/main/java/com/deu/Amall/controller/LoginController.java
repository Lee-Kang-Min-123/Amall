// 회원과 관련된 요청 controller

package com.deu.Amall.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.deu.Amall.domain.LoginVO;
import com.deu.Amall.service.LoginService;
import com.deu.Amall.util.PubMap;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class LoginController {
	
	@Autowired
	LoginService service;
	
	//로그인 화면 get
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLogin( ) throws Exception
	{
		log.info("get login");
		//model.addAttribute("msg", msg);   @RequestParam("msg") String msg, Model model
		
		return "login";
	}
	
	//로그인 post
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String postLogin(LoginVO loginvo, HttpSession session,
			RedirectAttributes rttr) throws Exception
	{
		
		log.info("post login");
		
		PubMap signin = service.login(loginvo);
		
		log.info("signin" + signin);
		
		if(signin == null) { // 로그인에 실패하면 signin에 null이라고 저장
			
			session.setAttribute("signin", null);
			rttr.addFlashAttribute("msg", false); //메시지
			
			return "redirect:login"; //로그인 페이지로 되돌리기
		}
		
		else { // 로그인 성공
			
			if(signin.getString("userType") == "A") {
				session.setAttribute("signin", signin); //signin에 로그인 정보 저장
				return "Productlist"; // welcome 페이지로 이동
			}
		}
		
	}
	
	//로그아웃
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String getLogout(HttpSession session) throws Exception
	{
		log.info("get logout");
		
		session.invalidate();
		
		return "redirect:login";
	}
	
	/*
	if(signin.getString("userId") == null || signin.getString("password")== null) { 
		//로그인 실패
		
		return "fail";
	}
	else {
		//로그인 성공
		return "welcome";
	}
	 */
}