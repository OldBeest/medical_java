<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>forwarding</title>
	</head>
	<body>
		<form action="doforward.jsp" method="post">
		<label>아이디</label>
		<input type="text" name="id"><br>
		<label>비밀번호</label>
		<input type="password" name="pw"><br>
		<input type="checkbox" name="remember" id="remember" value="remember">
		<label for="remember">아이디 저장</label>
		<br>
		<input type="submit" value="로그인">
	</form>
	</body>
</html>