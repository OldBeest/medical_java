<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main page</title>
</head>
<body>
	<%-- <h2>Session : <%=session.getAttribute("sessionID") %></h2>--%>
	<h2>Session : ${sessionID}</h2>
	<h2>index.jsp</h2>
	<c:if test="${sessionID == null}">
	<ul>
		<li><a href="login.jsp">로그인</a></li>
	</ul>
	</c:if>
	<c:if test="${sessionID != null }">
		<ul>
			<li><a href="cp">게시판리스트</a></li>
			<li><a href="form.jsp">글쓰기</a></li>
			<li><a href="logout.jsp">로그아웃</a></li>
		</ul>
	</c:if>
</body>
</html>