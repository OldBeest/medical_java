<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>doLogin</title>
</head>
<body>
	<script>
		if(${login_status} == 1){
			alert("로그인이 되었습니다.");
			location.href = "/index";
		}else if(${login_status} == 0){
			alert("아이디 또는 패스워드가 일치하지 않습니다.");
			location.href = "/login";
		}else {
			alert("로그아웃되었습니다.");
			location.href = "/index";			
		}
	</script>
</body>
</html>