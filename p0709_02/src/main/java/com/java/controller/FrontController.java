package com.java.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class FrontController {
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/form")
	public String form() {
		return "form";
	}
	
	@RequestMapping("/boardlist")
	public String boardlist(@RequestParam(defaultValue = "1") int bno, Model model) {
		System.out.println("bno : " + bno);
		model.addAttribute("bno", bno);
		return "boardlist";
	}
	
	@RequestMapping("/boardlist2/{bno}")
	public String boardlist2(@PathVariable int bno, Model model) {
		System.out.println("bno : " + bno);
		model.addAttribute("bno", bno);
		return "boardlist2";
	}
	
	@RequestMapping("/doform")
	public ModelAndView doform(HttpServletRequest request) {
		
//		System.out.println("id : " + request.getParameter("id"));
//		System.out.println("pw : " + request.getParameter("pw"));
//		System.out.println("name : " + request.getParameter("name"));
//		System.out.println("phone : " + request.getParameter("phone"));
//		System.out.println("gender : " + request.getParameter("gender"));
//		System.out.println("hobby : " + Arrays.toString(hobbys));
		String[] hobbys = request.getParameterValues("hobby");
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("id", request.getParameter("id"));
		mv.addObject("pw", request.getParameter("pw"));
		mv.addObject("name", request.getParameter("name"));
		mv.addObject("phone", request.getParameter("phone"));
		mv.addObject("gender", request.getParameter("gender"));
		mv.addObject("hobby", Arrays.toString(hobbys));

		mv.setViewName("doform");
		
		return mv;
	}
}
