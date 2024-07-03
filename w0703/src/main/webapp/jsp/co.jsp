<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = null;
	Cookie[] cookies = request.getCookies();
	if(cookies != null){
		for(Cookie c : cookies){
			if(c.getName().equals("remember")){
				name = c.getValue();
			}
		}
	}
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>쿠키</title>
	</head>
	<body>
		<h2>성적입력</h2>
		<form action="codo.jsp" method="post">
			<label>이름</label>
			<input type="text" name="name" placeholder="이름을 입력하세요" value=<%= name%>>
			<input type="checkbox" name="remember"><label for="remember">이름 저장</label><br>
			<label>국어</label>
			<input type="text" name="kor"><br>
			<label>영어</label>
			<input type="text" name="eng"><br>
			<label>수학</label>
			<input type="text" name="math"><br>
			<a href="codo.jsp"><input type="submit" value="입력"></a>
		</form>
	</body>
</html>