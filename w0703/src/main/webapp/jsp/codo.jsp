<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	
	String name = request.getParameter("name");
	int kor = Integer.parseInt(request.getParameter("kor"));
	int eng = Integer.parseInt(request.getParameter("kor"));
	int math = Integer.parseInt(request.getParameter("kor"));
	int total = kor + eng + math;
	double avg = total / 3.0;

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table, th, td{
		border: 1px solid black;
		border-collapse: collapse;
	}
</style>
</head>
<body>
	<h2>성적정보</h2>
	<table>
		<tr>
			<th>항목</th>
			<th>내용</th>
		</tr>
		<tr>
			<td>이름</td>
			<td><%=name %></td>
		</tr>
		<tr>
			<td>국어</td>
			<td><%=kor %></td>
		</tr>
		<tr>
			<td>영어</td>
			<td><%=eng %></td>
		</tr>
		<tr>
			<td>수학</td>
			<td><%=math %></td>
		</tr>
		<tr>
			<td>합계</td>
			<td><%=total %></td>
		</tr>
		<tr>
			<td>평균</td>
			<td><%=avg %></td>
		</tr>
	</table>
	<%
		String remember = request.getParameter("remember");
		//String[] remember = request.getParameterValues("remember");
		if(remember != null){
			Cookie rcookie = new Cookie("remember", request.getParameter("name"));
			rcookie.setMaxAge(60 * 60 * 24 * 30); //60초 * 60분 * 24시간 * 30일 -> 1달 저장
			response.addCookie(rcookie);
		}
	%>
	<a href="co.jsp">입력페이지로 돌아가기</a>
</body>
</html>