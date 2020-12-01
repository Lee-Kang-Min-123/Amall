// 회원과 관련된 요청 controller

package com.deu.Amall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	@RequestMapping(value = "/loginpage", method = RequestMethod.GET)
	public String getLoginpage() throws Exception
	{
		log.info("get login");
		return "loginpage";
	}
	
	//로그인 post
	@RequestMapping(value = "/loginpage", method = RequestMethod.POST)
	public String postLoginpage(LoginVO loginvo) throws Exception
	{
		
		log.info("post login");
		
		PubMap signin = service.login(loginvo);
		
		if(signin.getString("userId") == null || signin.getString("password")== null) { 
			//로그인 실패
			
			return "fail";
		}
		else {
			//로그인 성공
			return "welcome";
		}

	}
}