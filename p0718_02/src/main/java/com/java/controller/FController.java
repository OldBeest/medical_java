package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.dto.MemberDto;
import com.java.service.MemberService;

import jakarta.servlet.http.HttpSession;

@Controller
public class FController {
	
	@Autowired
	MemberService memberService;
	@Autowired
	HttpSession session;
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@PostMapping("/login")
	public ModelAndView login(MemberDto memberDto) {
		
		MemberDto mDto = memberService.selectLogin(memberDto);
		
		int login_status = 0;
		if(mDto != null) {
			login_status = 1;
			session.setAttribute("session_id", mDto.getId());
			session.setAttribute("session_name", mDto.getName());
		}
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("login_status", login_status);
		mv.setViewName("/dologin");
		return mv;
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout() {
		
		session.invalidate(); //세션 종료
		ModelAndView mv = new ModelAndView();
		
		int login_status = 3;
		mv.addObject("login_status", login_status);
		mv.setViewName("/dologin");
		return mv;

	}
	@RequestMapping("/notice")
	public String notice() {
		return "notice";
	}
	
}
