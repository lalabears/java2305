<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="com.java.www.Board"%>
<%@page import="com.java.www.BoardDao"%>
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
			String uploadPath = "c:/upload";
			int size = 10*1024*1024;
			MultipartRequest multi = new MultipartRequest( 
					request, uploadPath , size, "utf-8", new DefaultFileRenamePolicy() );

			String userBfile = multi.getFilesystemName("bfile");
			String userBtitle = multi.getParameter("btitle");
			String userBcontent = multi.getParameter("bcontent");
			String userId = (String)session.getAttribute("sessionId");
			
			BoardDao bdao = new BoardDao();
			
			int result = bdao.insertOne(userId, userBtitle, userBcontent, userBfile);
		
			
				
				
		%>
		<script type="text/javascript">
		
			alert("게시글이 등록되었습니다.");
			location.href = "notice_list.jsp";
		</script>
		
		
	</body>
</html>