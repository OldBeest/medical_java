<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Data base</title>
	</head>
	<body>
	<%
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ORA_USER", "1111");
		String query = "SELECT * FROM BOARD";
		pstmt = conn.prepareStatement(query);
		rs = pstmt.executeQuery(query);
		
		while(rs.next()){
			int bno = rs.getInt("BNO");
			String id = rs.getString("ID");
			String btitle = rs.getString("BTITLE");
			String bcontent = rs.getString("BCONTENT");
			
			out.println(bno + ", " + id + ", " + btitle + ", " + bcontent + "<br>");
		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(rs != null){
			rs.close();
		}
		if(pstmt != null){
			pstmt.close();
		}
		if(conn != null){
			conn.close();
		}
	}
	%>
	</body>
</html>