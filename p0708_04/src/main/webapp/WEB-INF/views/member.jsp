<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member Page</title>
</head>
<body>
	<h2>회원가입 페이지</h2>
	<form action="domember" name="frm" method="post"> 
		<label>아이디</label>
		<input type="text" name="id"><br>
		<label>비밀번호</label>
		<input type="password" name="pw"><br>
		<label>이름</label>
		<input type="text" name="name"><br>
		<label>전화번호</label>
		<input type="text" name="phone"><br>
		<label>성별</label><br>
		<label for="gender">남성</label>
		<input type="radio" name="gender" value="male">
		<label for="gender">여성</label>
		<input type="radio" name="gender" value="female"><br>
		<label>취미</label><br>
		<input type="checkbox" name="hobby" id="game" value="game">
		<label for="game">게임</label>
		<input type="checkbox" name="hobby" id="golf" value="golf">
		<label for="golf">골프</label>
		<input type="checkbox" name="hobby" id="run" value="run">
		<label for="run">조깅</label>
		<input type="checkbox" name="hobby" id="swim" value="swim">
		<label for="swim">수영</label>
		<input type="checkbox" name="hobby" id="soccer" value="soccer">
		<label for="soccer">축구</label>
		<br>
		<input type="submit" value="전송">
	</form>
</body>
</html>