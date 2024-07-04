<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인체크</title>
<script>
if(("<%=id%>" == "aaa") && ("<%=pw%>" == "1111")){
	alert("로그인이 되었습니다.");
	location.href = "index.jsp";
	<%
		session.setAttribute("sessionID", id);
	%>
}else{
	alert("아이디 또는 패스워드가 일치하지 않습니다. 다시 로그인하세요.");
	location.href = "login.jsp";				
}
</script>
<style>
	table, th, td{
		border: 1px solid black;
		border-collapse: collapse;
	}
	th{
		width : 120px;
	}
</style>
</head>
<body>
	<%--
		if(id.equals("aaa") || pw.equals("1111")){
			response.sendRedirect("index.jsp");
		}else{
			response.sendRedirect("login.jsp");
		}
	--%>
	<h2>로그인정보</h2>
	<table>
		<tr>
			<th>제목</th>
			<th>내용</th>
		</tr>
		<tr>
			<td>아이디</td>
			<td><%= request.getParameter("id") %></td>
		</tr>
		<tr>
			<td>패스워드</td>
			<td><%= request.getParameter("pw") %></td>
		</tr>
	</table>
	<%
		String remember = request.getParameter("remember");
		//String[] remember = request.getParameterValues("remember");
		if(remember != null){
			Cookie rcookie = new Cookie("remember", request.getParameter("id"));
			rcookie.setMaxAge(60 * 60 * 24 * 30); //60초 * 60분 * 24시간 * 30일 -> 1달 저장
			response.addCookie(rcookie);
		}
	%>
	<a href="cform.jsp">로그인 페이지 이동</a>
</body>
</html>