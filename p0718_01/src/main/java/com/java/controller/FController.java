package com.java.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.java.dto.BoardDto;
import com.java.dto.ChartDto;
import com.java.service.BoardService;
import com.java.service.ChartService;
import com.java.service.EmailService;

@Controller
public class FController {
	
	@Autowired
	BoardService boardService;
	@Autowired
	ChartService chartService;
	@Autowired
	EmailService emailService;
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	@GetMapping("/email")
	public String email() {
		return "email";
	}
	
	@PostMapping("/email_send")
	@ResponseBody
	public String email_send(String name, String email) {
		
		//이메일 전송
		
		//text 이메일
		//emailService.email_send(name, email);

		//html 이메일
		emailService.email_send2(name, email);
		
		return "1";
	}
	
	@GetMapping("/notice_list")
	public ModelAndView notice_list() {
			
		ArrayList<BoardDto> list = boardService.selectAll();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("notice_list");
		
		return mv;
	}
	
	@GetMapping("/chart")
	public String chart() {
		return "chart";
	}
	
	@PostMapping("/chart_data") //ajax chart데이터 전송
	@ResponseBody
	public ArrayList<ChartDto> chart_data(String data) {
		
		System.out.println("data : " + data);
		ArrayList<ChartDto> list = chartService.selectAll(data);
		
		return list;
	}
}
