<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String chk = null;
	String cook_id = "";
	Cookie[] cookies = request.getCookies();
	if(cookies != null){
		for(Cookie c : cookies){
			if(c.getName().equals("remember")){
				chk = "checked";
				cook_id = c.getValue();
				System.out.println("cookie id : " + cook_id);
			}
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
	<form action="cdoform.jsp" method="post">
		<label>아이디</label>
		<input type="text" name="id" value=<%=cook_id %>><br>
		<label>비밀번호</label>
		<input type="password" name="pw"><br>
		<input type="checkbox" name="remember" id="remember" value="remember" <%=chk %>>
		<label for="remember">아이디 저장</label>
		<br>
		<input type="submit" value="로그인">
	</form>
</body>
</html>