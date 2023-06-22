<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
			*{padding: 0; margin: 0;}
			table{width: 550px;margin: 30px auto;}
			table, td { border: 1px solid black; border-collapse: collapse;
				text-align: center; 
			}
			td{height: 35px; width: 100px;}
		
		</style>
	</head>
	
	<body> 
		<%! 
		// servlet, class 에 함수를 주로 쓴다. 만약에 쓸 경우 아래와 같이 ..
			int num = 1; 
			int num2 = 10; 
			
			private int sum(int a, int b) {
				int total=0;
				for(int i = a; i <=b ; i++){
					total += i;
				}
				return total;
			}
		%>
		
		
		
		<% 
			int[] arr = {10,20,30};
		%>
		
		<h1> <%= arr[0] %> </h1>
		<table>
			<tr>
				<td> <%= num %> </td>
				<td> <%= num2 %> </td>
				<td> <%= sum(num,num2) %> </td>
			</tr>
		
		</table>
		
		
	</body>
</html>