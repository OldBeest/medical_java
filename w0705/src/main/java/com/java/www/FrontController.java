package com.java.www;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.service.BoardDeleteService;
import com.java.www.service.BoardDoModifyService;
import com.java.www.service.BoardListService;
import com.java.www.service.BoardModifyService;
import com.java.www.service.BoardReadService;
import com.java.www.service.BoardService;
import com.java.www.service.BoardWriteService;
import com.java.www.service.MemberLoginService;
import com.java.www.service.MemberService;


@WebServlet("*.do")
public class FrontController extends HttpServlet {

    public FrontController() {
    }
    
    protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	System.out.println("do Action");
    	
    	String url = null;
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String fileName = uri.substring(contextPath.length());
		System.out.println("클릭된 파일 이름 : " + fileName);
		BoardService boardService = null; 
		MemberService memberService = null; 
		
		if(fileName.equals("/index.do")) {
//			response.sendRedirect("index.jsp");
			url = "index.jsp";
		}else if(fileName.equals("/login.do")){
//			response.sendRedirect("login.jsp");
			url = "login.jsp";
		}else if(fileName.equals("/dologin.do")){
			memberService = new MemberLoginService();
			memberService.execute(request, response);
//			response.sendRedirect("login.jsp");
			url = "index.do";
		}else if(fileName.equals("/join01_terms.do")){
//			response.sendRedirect("join01_terms.jsp");
			url = "join01_terms.jsp";
		}else if(fileName.equals("/write.do")){
			url = "write.jsp";
		}else if(fileName.equals("/dowrite.do")){
			boardService = new BoardWriteService();
			boardService.execute(request, response);
			response.sendRedirect("list.do");
		}else if(fileName.equals("/read.do")){
			boardService = new BoardReadService();
			boardService.execute(request, response);
			url = "read.jsp";
		}else if(fileName.equals("/modify.do")){
			boardService = new BoardModifyService();
			boardService.execute(request, response);
			url = "modify.jsp";
		}else if(fileName.equals("/domodify.do")){
			boardService = new BoardDoModifyService();
			boardService.execute(request, response);
			url = "update.jsp";
		}else if(fileName.equals("/delete.do")){
			boardService = new BoardDeleteService();
			boardService.execute(request, response);
			url = "delete.jsp";
		}else if(fileName.equals("/list.do")){
			//response.sendRedirect("list.jsp");
			boardService = new BoardListService();
			boardService.execute(request, response);
			url = "list.jsp";	
		}
		if(url != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			dispatcher.forward(request, response);			
		}
		
    			
    	
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do Get");
		doAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do Post");
		doAction(request, response);
	}

}
