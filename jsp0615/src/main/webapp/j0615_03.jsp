<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
			*{padding: 0; margin: 0;}
			form,h2,table{width: 800px; margin: 30px auto;text-align: center;}
			table,th,td{border: 1px solid black; border-collapse: collapse;}
			th{height: 40px; background: #efefef;}	
			td{width: 150px; height: 35px;}
		
		</style>
	</head>
	
	<body>
		<h2>학생성적 관리 시스템</h2>
		<table>
			<thead>
				<tr>
					<th>번호</th>
					<th>이름</th>
					<th>국어</th>
					<th>영어</th>
					<th>수학</th>
					<th>합계</th>
					<th>평균</th>
				</tr>
			</thead>	
			<tbody id="tbody">
			<%
				for(int i = 0; i <10 ;i++){
			
			%>
				<tr>
					<td>1</td>
					<td>홍길동</td>
					<td>100</td>
					<td>100</td>
					<td>100</td>
					<td>300</td>
					<td>100.00</td>
				</tr>
			<%
				}
			
			%>
			</tbody>
		</table>
		
	</body>
</html>