// 회원과 관련된 요청 controller

package com.deu.Amall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.deu.Amall.domain.MemberVO;
import com.deu.Amall.service.MemberService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class MemberController {
	
	//회원가입
	@Autowired //MemberService.java가 MemberController.java에 자동 주입
	private MemberService memberservice;
	
	//회원가입 페이지 이동
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public void getJoin() {
		
		log.info("회원가입 페이지 진입");
				
	}
	
	//회원가입
		@RequestMapping(value="/join" ,method = RequestMethod.POST)
		public String postJoin(MemberVO member) throws Exception{
			log.info("회원가입 진입");
			
			//회원가입 service 실행
			memberservice.insert(member);
			
			log.info("회원가입 service 성공");
			
			return "redirect:/";
			
		}
	
	
	//로그인 페이지 이동
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public void loginGET() {
		
		log.info("로그인 페이지 진입");
		
	}
	
	
	
}