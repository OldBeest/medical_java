package com.java.www.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.www.dao.MemberDao;
import com.java.www.dto.Member;

public class MemberLoginService implements MemberService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		System.out.println("id : " + id);
		System.out.println("pw : " + pw);
		
		MemberDao memberDao = new MemberDao();
		Member member = memberDao.selectLogin(id, pw);
		if(member != null) {
			//save session
			HttpSession session = request.getSession(); // session 객체 선언
//			session.setAttribute("sessionId", id);
			request.setAttribute("result", "1"); // 1 : success
			System.out.println("result : " + request.getAttribute("result"));
		}else {
			request.setAttribute("result", "-1"); // -1 : fail
		}

	}

}
