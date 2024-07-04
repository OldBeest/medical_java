<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>connection pool</title>
	</head>
	<style>
		table, th, td{
			border: 1px solid black;
			border-collapse: collapse;
			text-align: center;
		}
	</style>
	<body>
		<%!
			Connection conn;
			PreparedStatement pstmt;
			ResultSet rs;
		%>
				<table>
					<tr>
						<th>아이디</th>
						<th>비밀번호</th>
						<th>이름</th>
						<th>번호</th>
					</tr>
		<%
			try{
				Context context = new InitialContext();
				DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle");
				conn = ds.getConnection();
				
				String query = "SELECT * FROM MEMBER";
				pstmt = conn.prepareStatement(query);
				rs = pstmt.executeQuery(query);
				
				
				while(rs.next()){
					String id = rs.getString("ID");
					String pw = rs.getString("PW");
					String name = rs.getString("NAME");
					int no = rs.getInt("NO");
				%>

					<tr>
						<td><%= id %></td>
						<td><%= pw %></td>
						<td><%= name %></td>
						<td><%= no %></td>
					</tr>
				<%
				
				
					//out.println("id : " + id + " pw : " + pw + " name : " + name + " no : " + no + "<br>");					
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
		</table>
	</body>
</html>