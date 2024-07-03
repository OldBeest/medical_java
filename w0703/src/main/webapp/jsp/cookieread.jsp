<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>cookie read</title>
</head>
<body>
	<%
		Cookie[] cookies = request.getCookies();
		if(cookies != null){
			for(Cookie c : cookies){
				out.println("검색된 아이디 : " + c.getValue() + "<br>");
				if(c.getName().equals("c_id")){
					String id = c.getValue();
					out.println("찾는 아이디 : " + id + "<br>");
					 // 쿠키 삭제
					c.setMaxAge(0);
					response.addCookie(c);
				}
			}
		}
	%>
	<a href="cookiedel.jsp">쿠키삭제 확인</a>
</body>
</html>