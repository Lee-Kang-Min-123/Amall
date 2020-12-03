package com.deu.Amall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.deu.Amall.domain.UserVO;
import com.deu.Amall.service.UserService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class UserController {

	@Autowired
	private UserService service;
	
	String userId;
	
	@GetMapping("/join")
	public void getUser(Model model) {
		log.info("join");
		
	}
	
	@PostMapping("/join")
	public String register(UserVO user, RedirectAttributes rttr) {
		log.info("register:  "+user);
		service.register(user);
		userId = user.getUserId();
		
		return "redirect:/login";
	}
	
}
