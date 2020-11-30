// 회원과 관련된 요청 controller

package com.deu.Amall.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.deu.Amall.domain.MemberVO;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class MemberController {
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(MemberVO member, HttpServletRequest req, RedirectAttributes rttr) throws Exception{
		log.info("post login");
		
		HttpSession session = req.getSession();
		MemberVO login = service.login(member);
		
		if(login == null) {
			session.setAttribute("member", null);
			rttr.addFlashAttribute("msg", false);
		}else {
			session.setAttribute("member", login);
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception{
		
		session.invalidate();
		
		return "redirect:/";
	}
	
	
}