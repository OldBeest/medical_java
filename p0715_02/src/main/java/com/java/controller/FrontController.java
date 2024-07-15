package com.java.controller;

import java.sql.Timestamp;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.dto.BoardDto;
import com.java.service.BoardService;

@Controller
public class FrontController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/json_data")
	public String json_data() {
		return "json_data";
	}
	
	@RequestMapping("/ajaxsend")
	@ResponseBody
	public ArrayList<BoardDto> ajaxsend(String category, String searchWord) {
		System.out.println("controller category : " + category);
		System.out.println("controller searchWord : " + searchWord);
		System.out.println("ajaxsend 페이지가 호출되었습니다.");
		
		ArrayList<BoardDto> list = boardService.selectSearch(category, searchWord);
		
		//service의 selectSearch
		return list;
	}
}
