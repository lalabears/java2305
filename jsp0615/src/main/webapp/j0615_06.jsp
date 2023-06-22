<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>request</title>
		<style type="text/css">
			*{padding: 0; margin: 0;}
						
		</style>
	</head>
	
	<body> 
	<h1>한글</h1>
		<%
			out.println(request.getServerName());
			out.println("<br>");
			out.println(request.getServerPort());
			out.println("<br>");
			out.println(request.getMethod());
			out.println("<br>");
			out.println(request.getProtocol());
			out.println("<br>");
			out.println(request.getRequestURL());
			out.println("<br>");
			out.println(request.getRemoteAddr());
			out.println("<br>");
			
			
		
			out.println("contextPath: "+request.getRequestURL()+"<br>");
		
			
		
		%>
		
	</body>
</html>