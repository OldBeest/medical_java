package com.java.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.dto.DepartDto;
import com.java.dto.EDDto;
import com.java.dto.EmpDepDto;
import com.java.dto.EmpDto;
import com.java.service.DepartService;
import com.java.service.EDService;
import com.java.service.EmpDepService;
import com.java.service.EmpService;

@Controller
public class FrontController {
	
	@Autowired
	EmpService empService;
	@Autowired
	DepartService departService;
	@Autowired
	EmpDepService empdepService; // 컬럼 변수 사용
	@Autowired
	EDService edService; //컬럼 전체 객체 사용
	
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/emp_list") // 사원테이블 모두 가져오기
	public ModelAndView emp_list() {
		
		ArrayList<EmpDto> list = empService.selectAll();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("emp_list");
		return mv;
	}
	
	@RequestMapping("/depart_list") // 부서테이블 모두 가져오기
	public ModelAndView depart_list() {
		
		ArrayList<DepartDto> list = departService.selectAll();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("depart_list");
		return mv;
	}
	
	@RequestMapping("/empdep_list") // 사원+부서 테이블 조인
	public ModelAndView empdep_list() {
		
		ArrayList<EmpDepDto> list = empdepService.selectAll();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("empdep_list");
		return mv;
	}
	
	@RequestMapping("/ed_list") // 사원+부서 테이블 조인 2번쨰
	public ModelAndView ed_list() {
		
		ArrayList<EDDto> list = edService.selectAll();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("ed_list");
		return mv;
	}
	
	
}
