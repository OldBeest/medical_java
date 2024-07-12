package com.java.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.dto.BoardDto;
import com.java.service.BoardService;

@RequestMapping("/board")
@Controller
public class BoardController {
	
	//	BoardServiceImpl boardServiceImpl = new BoardServiceImpl();
	//	BoardServiceImplVer2 boardServiceImplVer2 = new BoardServiceImplVer2();
	
	@Qualifier("ver1") // service가 2개 이상 등록되어 있으면 autowired에서도 qualifier를 이용해 해당 서비스를 일치시켜줘야함
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/list")
	public ModelAndView list() {
		
		//게시판 전체 가져오기
		ArrayList<BoardDto> list = boardService.selectList();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("/board/list");
		
		return mv;
	}
}
