package com.java.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.java.dto.BoardDto;
import com.java.service.BoardService;

@RequestMapping("/board")
@Controller
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping("/list")
	public ModelAndView list() {
		//controller -> service
		ArrayList<BoardDto> list = boardService.selectList();
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("/board/list");
		
		return mv;
		
	}
	@RequestMapping("/view") //view 페이지
	public ModelAndView view(BoardDto bdto) {
		
		//1개
		BoardDto boardDto = boardService.selectOne(bdto);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("boardDto", boardDto);
		mv.setViewName("/board/view");
		
		return mv;
	}
	
	@GetMapping("/write") //글쓰기 화면
	public String write() {
		return "board/write";
	}
	
	@PostMapping("/write") //글쓰기 저장, 파일첨부
	public String write(BoardDto bdto, @RequestPart MultipartFile files) {
		//id, btitle, bcontent, files
		System.out.println("controller id : " + bdto.getId());
		System.out.println("controller btitle : " + bdto.getBtitle());
		System.out.println("controller bcontent : " + bdto.getBcontent());
		System.out.println("controller bfiles : " + files.getOriginalFilename());
		
		String uFile="";
		//파일이 존재할 시
		if(!files.isEmpty()) {
			//현재시간 초단위로 받아오기(파일 중복방지 이름 부여)
			long time = System.currentTimeMillis();
			System.out.println("time : " + time);
			
	//		//랜덤으로 코드값 생성(파일 중복방지 이름 부여)
	//		UUID uuid = UUID.randomUUID();
	//		System.out.println("uuid : " + uuid);
				
			//파일명 정하기
			uFile = String.format("%d_%s", time, files.getOriginalFilename());
			String saveUrl = "c:/upload/";
			
			//파일 저장하기
			File f = new File(saveUrl + uFile);
			try {
				files.transferTo(f);			
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		//변경된 파일 이름 저장
		bdto.setBfile(uFile);
		
		boardService.insertBoard(bdto);
		return "redirect:/board/list";
	}
	
	@RequestMapping("/delete")
	public String delete(BoardDto bdto) {
//		System.out.println("controller bno : " + bdto.getBno());
		boardService.deleteBoard(bdto);
		return "redirect:/board/list";	
	}
	
	@RequestMapping("/update")
	public ModelAndView update(BoardDto bdto) { //게시글 수정
		
		BoardDto boardDto = boardService.updateBoard(bdto);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("boardDto", boardDto);
		mv.setViewName("board/modify");
		
		return mv;
	}
	
	@RequestMapping("doUpdate") 
	public String doUpdate(BoardDto bdto, @RequestPart MultipartFile files) { // 게시글 수정 저장
//		System.out.println(bdto.getBtitle());
//		System.out.println(bdto.getBcontent());
		
		String uFile="";
		//파일이 존재할 시
		if(!files.isEmpty()) {
			//현재시간 초단위로 받아오기(파일 중복방지 이름 부여)
			long time = System.currentTimeMillis();
			System.out.println("time : " + time);
			
	//		//랜덤으로 코드값 생성(파일 중복방지 이름 부여)
	//		UUID uuid = UUID.randomUUID();
	//		System.out.println("uuid : " + uuid);
				
			//파일명 정하기
			uFile = String.format("%d_%s", time, files.getOriginalFilename());
			String saveUrl = "c:/upload/";
			
			//파일 저장하기
			File f = new File(saveUrl + uFile);
			try {
				files.transferTo(f);			
			}catch(Exception e){
				e.printStackTrace();
			}
			//변경된 파일 이름 저장(if문안에 넣어서 파일이 있는경우에만 덮어쓰기)
			bdto.setBfile(uFile);
		}
		
		//수정 저장
		boardService.doUpdateBoard(bdto);
		return "redirect:/board/list";
	}
	
	@RequestMapping("/reply") // 답글 페이지
	public ModelAndView reply(BoardDto bdto) {
		
		BoardDto boardDto = boardService.selectOne(bdto);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("boardDto", boardDto);
		mv.setViewName("/board/reply");
		
		return mv;
	}
	
	@RequestMapping("/doReply")
	public String doReply(BoardDto bdto, @RequestPart MultipartFile files) { // 답글 저장
		
		String uFile="";
		//파일이 존재할 시
		if(!files.isEmpty()) {
			//현재시간 초단위로 받아오기(파일 중복방지 이름 부여)
			long time = System.currentTimeMillis();
			System.out.println("time : " + time);
			
	//		//랜덤으로 코드값 생성(파일 중복방지 이름 부여)
	//		UUID uuid = UUID.randomUUID();
	//		System.out.println("uuid : " + uuid);
				
			//파일명 정하기
			uFile = String.format("%d_%s", time, files.getOriginalFilename());
			String saveUrl = "c:/upload/";
			
			//파일 저장하기
			File f = new File(saveUrl + uFile);
			try {
				files.transferTo(f);			
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		//변경된 파일 이름 저장
		bdto.setBfile(uFile);
		
		boardService.insertReply(bdto);
		
		return "redirect:/board/list";
	}
}
