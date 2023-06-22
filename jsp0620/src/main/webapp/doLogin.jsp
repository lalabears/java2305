<%@page import="com.java.www.MemberDao"%>
<%@page import="com.java.www.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
			String userId = request.getParameter("id");
			String userPw = request.getParameter("pw");
			
			MemberDao mdao = new MemberDao();
			Member member = mdao.selectLogin(userId, userPw);
		
			if (member!=null){
				//response.sendRedirect("main.jsp?loginCheck=1");
				session.setAttribute("sessionId", member.getId());
				session.setAttribute("sessionName", member.getName());
				
		%>
		<script type="text/javascript">
		
			alert("로그인 되었습니다.");
			location.href = "main.jsp";
		</script>
		
		
		<%}else{%>
		<script type="text/javascript">
			alert("잘못입력하셨습니다");
			location.href = "login.jsp";
		
		</script>
		
		<%
				//response.sendRedirect("login.jsp?loginCheck=0");
			}
		
		
		
		%>
	</body>
</html>