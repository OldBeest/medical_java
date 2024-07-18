<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="/js/jquery.min.js"></script>
<title>로그인 페이지</title>
</head>
<body>
	<h2>로그인 페이지</h2>
	<form action="/login" name="loginfrm" method="post">
		<label>아이디</label>
		<input type="text" name="id" id="id"><br>
		<label>비밀번호</label>
		<input type="text" name="pw" id="pw"><br>
		<button type="submit">회원가입하기</button>
	</form>
</body>
</html>