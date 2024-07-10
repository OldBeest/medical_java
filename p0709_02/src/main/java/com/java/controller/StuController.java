package com.java.controller;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.dto.Students;

@Controller
@RequestMapping("/students")
public class StuController {
	
	@RequestMapping("/students")
	public String students() {
		
		return "students/students";
	}
	
	@RequestMapping("/dostudents")
	public ModelAndView dostudents(Students students) {
		
		students.setTotal(students.getKor() + students.getEng() + students.getMath());
		students.setAvg(students.getTotal() / 3.0);
		students.setHobby(Arrays.toString(students.getHobbys()));
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("stu", students);
		mv.setViewName("students/dostudents");
		return mv;
	}
	@RequestMapping("/stuupdate")
	public ModelAndView stuupdate(Students students) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("stu", students);
		mv.setViewName("students/stuupdate");
		return mv;
	}

}
