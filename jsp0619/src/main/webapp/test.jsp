<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
   Connection conn;
   PreparedStatement pstmt;
   ResultSet rs;
   //컬럼타입
   int empno;
   String ename;
   String job;
   int mgr;
   String hiredate;
   double sal;
   double comm;
   int deptno;
   
   String query;
%>     
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>employee List</title>
		<style>
		  table,th,td{border:1px solid black; border-collapse: collapse;}
		</style>
	</head>
	<body>
	   <h2>직원 리스트</h2>

	   <%
	     try{
	    	 Class.forName("oracle.jdbc.driver.OracleDriver");
	    	 conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##ora_user", "1111");
	    	 query = "select * from employees"; 
	    	 pstmt = conn.prepareStatement(query);
	    	 
	    	 rs = pstmt.executeQuery();
	    	 
	    	 while(rs.next()){ //5명
	    		 int empno;
	    		 String ename;
	    		 String job;
	    		 int mgr;
	    		 String hiredate;
	    		 double sal;
	    		 double comm;
	    		 int deptno;
	    		 
	    		 empno = rs.getInt("EMPLOYEE_ID");
	    		 ename = rs.getString("EMP_NAME");
	    		 hiredate = rs.getString("HIRE_DATE");
	    		 sal = rs.getDouble("SALARY");
	    		 
	    		 out.println("empno : "+empno+","+ename+hiredate+sal+"<br>");
	    	 
	    	 }//while
	     }catch(Exception e){
	    	 e.printStackTrace();
	     }finally{
	    	 try{
	    		 if(rs!=null) rs.close();
	    		 if(pstmt!=null) pstmt.close();
	    		 if(conn!=null) conn.close();
	    	 }catch(Exception e2){e2.printStackTrace();}
	     }
	  %>
	  
	</body>
</html>