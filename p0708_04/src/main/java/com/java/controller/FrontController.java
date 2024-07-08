package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class FrontController {
	
	@RequestMapping("/index")
	public String index() {
		
		return "index";
	}
	@RequestMapping("/login")
	public String login() {
		
		return "login";
	}
	@RequestMapping("/member")
	public String member() {
		
		return "member";
	}
	
	@RequestMapping("/domember")
	public ModelAndView domemeber(HttpServletRequest request) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("domember");
		mv.addObject("id", request.getParameter("id"));
		mv.addObject("pw", request.getParameter("pw"));
		mv.addObject("name", request.getParameter("name"));
		mv.addObject("phone", request.getParameter("phone"));
		mv.addObject("gender", request.getParameter("gender"));
//		
//		String[] hobby = request.getParameterValues("hobby");
//		String hobbys = "";
//		for(int i=0; i<hobby.length; i++) {
//			if(i==0) {
//			 hobbys = "" + hobby[i];
//			}else {
//				hobbys += "," + hobby[i];				
//			}
////			
//		}
		//mv.addObject("hobbys", hobby);
		mv.addObject("hobbys", request.getParameterValues("hobby"));
		
		return mv;
	}
	
	@RequestMapping("/memberUpdate")
	public String memberUpdate(HttpServletRequest request) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("domember");
		mv.addObject("id", request.getParameter("id"));
		mv.addObject("pw", request.getParameter("pw"));
		mv.addObject("name", request.getParameter("name"));
		mv.addObject("phone", request.getParameter("phone"));
		mv.addObject("gender", request.getParameter("gender"));
		
		return "memUpdate";
	}
}
