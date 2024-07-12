package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.dto.MemberDto;
import com.java.service.MemberService;

@RequestMapping("/member")
@Controller
public class MemberController {
	
	@Autowired //객체선언 - IOC 컨테이너에 있는 객체 주입
	MemberService memberService; 
	
	@RequestMapping("/login")
	public String login() {
		return "/member/login";
	}

	@RequestMapping("/dologin")
	public ModelAndView dologin(MemberDto mdto) {
		
		MemberDto memberDto = memberService.selectLogin(mdto);
		
		ModelAndView mv = new ModelAndView();
		System.out.println(memberDto);
		mv.addObject("memberDto", memberDto);
		mv.setViewName("/member/dologin");
		
		return mv;
	}
}
