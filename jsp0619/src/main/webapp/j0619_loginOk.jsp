<%@page import="com.java.www.Member"%>
<%@page import="com.java.www.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Employ List</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
			String id = request.getParameter("login_id"); // "aaa";
			String pw = request.getParameter("login_pw"); // "1111";//
			
			MemberDao mdao = new MemberDao();
			Member member = mdao.selectLogin(id, pw);
			
			out.print(id);
			
			if(member != null){
				session.setAttribute("sessionId",	id);
				session.setAttribute("sessionName",	member.getName());
		
		%>
		<script type="text/javascript">
			alert("로그인 되었습니다.");
			location.href = "j0619_main.jsp";
		</script>
		
			
		<%	}else{  %>
				
		
		
		<script type="text/javascript">
			alert("아이디 또는 패스워드가 일치하지 않습니다. 다시 로그인하세요.");
			history.back();
		</script>		
				
				
		<% } %>	
		
		
		
	</body>
</html>