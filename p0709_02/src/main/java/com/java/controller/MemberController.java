package com.java.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java.dto.Member;


@Controller
@RequestMapping("/member")
public class MemberController {
	
	@RequestMapping("/member")
	public String member() {
		return "member/member";
	}
	
	@RequestMapping("/domember")
	public ModelAndView domember(Member member) {
		
		System.out.println("id : " + member.getId());
		System.out.println("name : " + member.getName());
		System.out.println("gender : " + member.getGender());
		
		System.out.println("hobby : " + member.getHobby());
		
		member.setHobby(member.getHobby());

		ModelAndView mv = new ModelAndView();
		mv.addObject("member", member);
		
		
		mv.setViewName("member/domember");
		
		return mv;
	}
	
	@RequestMapping("/member/login")
	public String login() {
		return "member/login";
	}
	@RequestMapping("/member/dologin")
	public ModelAndView dologin(@RequestParam("id") String id, 
			@RequestParam("pw") String pw, 
			@RequestParam(defaultValue = "1") int pno) {
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("id", id);
		mv.addObject("pw", pw);
		mv.addObject("pno", pno);
		mv.setViewName("member/dologin");
		
		return mv;
	}
	
	@RequestMapping("/member/data")
	public String data() {
		return "member/data";
	}
	
	@RequestMapping("/member/dodata")
	public ModelAndView dodata(@RequestParam(defaultValue = "1") int stuNo, 
			@RequestParam("name") String name,
			@RequestParam(defaultValue = "0") int kor,
			@RequestParam("hobby") String[] hobby) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("stuNo", stuNo);
		mv.addObject("name", name);
		mv.addObject("kor", kor);
		mv.addObject("hobby", hobby);
//		mv.addObject("hobby", Arrays.toString(hobby));
		
		return mv;
	}
}
