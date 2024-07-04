<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>EL tag</title>
		<style>
		table, th, td{
			border : 1px solid black;
			border-collapse: collapse;
		}
		th{
			width : 120px;
		}
		</style>
	</head>
	<body>
		<table>
			<tr>
				<th>변수</th>
				<th>총합</th>
			</tr>
		<%
			int sum = 0;
			for(int i=0; i<11; i++){
				sum += i;
				
		%>
			<tr>
				<td><%= i %></td>
				<td>$`{sum}`</td>
			</tr>
		<%			}
		%>
		
		
		</table>
	</body>
</html>