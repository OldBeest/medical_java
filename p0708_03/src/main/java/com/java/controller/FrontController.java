package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;


@Controller
public class FrontController {
	
	
	// get
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	// get, post
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	// get
	@GetMapping("/board/board") 
	public String board() {
		return "board/board";
	}
	
	// post
	@PostMapping("/doBoard")
	public String doBoard() {
		return "doBoard";
	}
	
	@RequestMapping("/board/form")
	public String form() {
		return "board/form";
	}
	
	@RequestMapping("/board/form2")
	public String form2() {
		return "board/form2";
	}
	
	@RequestMapping("/board/doform")
	public String doform(HttpServletRequest request, Model model) {
		System.out.println("bno : " + request.getParameter("bno"));
		System.out.println("btitle : " + request.getParameter("btitle"));
		model.addAttribute("bno", request.getParameter("bno"));
		model.addAttribute("btitle", request.getParameter("btitle"));
//		
		return "board/doform";
	}
	
	@RequestMapping("/board/doform2")
	public ModelAndView doform2(HttpServletRequest request) {
		System.out.println("bno : " + request.getParameter("bno"));
		System.out.println("btitle : " + request.getParameter("btitle"));
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("board/doform2");
		mv.addObject("bno", request.getParameter("bno"));
		mv.addObject("btitle", request.getParameter("btitle"));

		return mv;
	}
}
