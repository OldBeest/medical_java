package com.java.www;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet(description = "FrontController", urlPatterns = { "*.do" })
public class FrontController extends HttpServlet {
    public FrontController() {
    }

    protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("do Action");
    	String url = null;
    	String uri = request.getRequestURI();
    	String contextPath = request.getContextPath();
    	String fileName = uri.substring(contextPath.length() + 1);
    	MemberDAO memberDAO = new MemberDAO();
    	
    	System.out.println(fileName);
    	 
    	if(fileName.equals("login.do")) {
    		response.sendRedirect("login.jsp");
    	}
    	else if(fileName.equals("member.do")) {
    		ArrayList<MemberDTO> list = memberDAO.doMember();
    		request.setAttribute("list", list);

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
