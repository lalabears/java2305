<%@page import="com.java.www.Member"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.java.www.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
		String sessionId = (String)session.getAttribute("sessionId");
	  	String id,pw,name,phone;
	    MemberDao mdao = new MemberDao();
	    Member m = mdao.selectMemberOne(sessionId);
	   
	    
    	id = m.getId();
    	pw = m.getPw();
    	name = m.getName();
    	phone = m.getPhone();
    	
    	//out.print(id+pw+name+phone);
%>
	    
   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Employ List</title>
	</head>
	<body>
		<h2>회원정보 수정</h2>
		<form action="j0619_modifyOk.jsp" method="get" name="memberFrm">
			<label>아이디</label>
			<input type="text" name="id" value=" <%= id %>" readonly="readonly"> <br> 
			<label>비밀번호</label>
			<input type="text" name="pw" value=" <%= pw %>"> <br> 
			<label>이름</label>
			<input type="text" name="name" value=" <%= name %>"> <br> 
			<label>전화번호</label>
			<input type="text" name="phone" value=" <%= phone %>"> <br> 
			<input type="submit" value="전송" > <br> 
			<button type="button"><a href="j0619_main.jsp">main</a></button>
		
		
		
		</form>
	</body>
</html>