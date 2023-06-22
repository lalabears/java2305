<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h2>회원가입</h2>
		<form action="TestServlet" name="frm" method="post">
			<label>이름</label>
			<input type="text" name="name" > <br>
			<label>성별</label><br>
			<input type="radio" name="gender" id="male" value="male" >
			<label for="male">남성</label> 
			<input type="radio" name="gender" id="female" value="female" > 
			<label for="female">여성</label> 
			<br>
			<label>취미</label>	<br>	
			<input type="checkbox" name="hobbys" id="game" value="game">
			<label for="game">game</label>
			<input type="checkbox" name="hobbys" id="golf" value="golf">
			<label for="golf">golf</label>
			<input type="checkbox" name="hobbys" id="swim" value="swim">
			<label for="swim">swim</label>
			<input type="checkbox" name="hobbys" id="run" value="run">
			<label for="run">run</label>
			<input type="checkbox" name="hobbys" id="book" value="book">
			<label for="book">book</label>
			<br>
			
			<input type="submit" value="전송"><br>

		</form>
	</body>
</html>