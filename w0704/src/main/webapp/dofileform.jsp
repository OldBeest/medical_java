<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>file upload</title>
	</head>
	<body>
		<%
			//String uploadPath = request.getRealPath("upload");
			String uploadPath = "c:/upload";
			
			final int SIZE = 10 * 1024 * 1024; // 10Mb
			
			MultipartRequest multi = new MultipartRequest(request, uploadPath, SIZE, "utf-8", new DefaultFileRenamePolicy());
			String id = multi.getParameter("id");
			//String filename = multi.getParameter("profile");
			
			Enumeration files = multi.getFileNames();
			String file = (String) files.nextElement();
			String filename = multi.getFilesystemName(file);
			
			
			out.println("id : " + id + "<br>");
			out.println("filename : " + filename + "<br>");
		%>
	</body>
</html>