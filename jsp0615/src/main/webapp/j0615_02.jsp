<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
			*{padding: 0; margin: 0;}
			table, td {width: 550px; border: 1px solid black; border-collapse: collapse;
				text-align: center; margin: 30px auto;
			}
			td{height: 30px; width: 100px;}
		
		</style>
	</head>
	<body>
		<%--
			out.println("<table>");
			for(int i = 2; i <=9 ;i++){
				out.println("<tr>");
				out.println("<td colspan='5'>"+ i +" 단 </td>");
				out.println("</tr>");
				// out.println(i+"단 <br>");
				for(int j = 1; j <=9 ;j++){
					out.println("<tr>");
					out.println("<td>"+i+"</td>");
					out.println("<td>"+"*"+"</td>");
					out.println("<td>"+j+"</td>");
					out.println("<td>"+"="+"</td>");
					out.println("<td>"+(i*j)+"</td>");
					out.println("</tr>");
					//out.println(i + " * " + j +" = " +(i*j)+"&nbsp;&nbsp;");
				}
				//out.println("<br>");
			}
			out.println("</table>");
			 
		--%>
		
				
		<table>
		<%
			for(int i = 2; i <=9 ;i++){
		%>
			<tr>
				<td colspan="5"> <%= i %> 단 </td>
			</tr>
		<%
				
				for(int j = 1; j <=9 ;j++){
					
		
		
		%>
			<tr>
				<td> <%= i %> </td>
				<td>*</td>
				<td> <%= j %> </td>
				<td>=</td>
				<td> <%= (i*j) %></td>
			</tr>
		<%
				}
			}
		%>	
		
		</table>
		
	</body>
</html>