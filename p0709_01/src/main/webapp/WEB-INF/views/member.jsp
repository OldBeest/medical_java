<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원 가입 페이지</title>
	</head>
	<body>
		<h2>회원 가입 정보</h2>
		<form action="domember" name="frm" method="post">
			<label>아이디</label>
			<input type="text" name="id">
			<label>비밀번호</label>
			<input type="password" name="pw">
			<label>이름</label>
			<input type="text" name="name">
			
		</form>
	</body>
</html>