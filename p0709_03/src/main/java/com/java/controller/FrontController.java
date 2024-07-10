package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.dto.Member;

@Controller
public class FrontController {
	
	@RequestMapping("/index")
	public String index() {
		
		Member m1 = new Member();
		Member m2 = new Member("aaa", "1111", "홍길동", "010-1111-1111");
		Member m3 = Member.builder().id("aaa").build();
		Member m4 = Member.builder().id("bbb").pw("1111").name("유관순").build();
		
		return "index";
	}
}
