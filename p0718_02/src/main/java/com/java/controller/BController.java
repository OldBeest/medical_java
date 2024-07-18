package com.java.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.dto.BoardDto;
import com.java.service.BoardService;

@RequestMapping("/notice")
@Controller
public class BController {
	
	@Autowired
	BoardService boardService;
	
	ArrayList<BoardDto> list = boardService.selectList();
}
