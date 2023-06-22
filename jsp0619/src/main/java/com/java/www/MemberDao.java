package com.java.www;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDao {
	
	Context context = null;
    DataSource dataSource = null;
    Connection conn = null;
	PreparedStatement pstmt;
	ResultSet rs;
	//컬럼타입
	Member member;
	String id,pw,name,phone;
	String query;
	int result;
	
	private Connection getConnection() {
		Connection connection = null;
		try {
			context = new InitialContext();
	    	dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
	    	connection = dataSource.getConnection();
		}catch(Exception e){e.printStackTrace();}
		return connection;
	}
	
	public Member selectLogin(String userId, String userPw) {
		System.out.println(userId);
		
		Member member = null; 
		try {
			conn = getConnection();
			query= "select * from member where id=? and pw=?";
			pstmt = conn.prepareStatement(query);
	    	
			pstmt.setString(1, userId);
			pstmt.setString(2, userPw);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				phone = rs.getString("phone");
				member = new Member(id,pw,name,phone);
			}
						
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
		
		return member;
	}
	
	
	public Member selectMemberOne(String sessionId) {
		Member member = null; 
		try {
			conn = getConnection();
			query= "select * from member where id=?";
			pstmt = conn.prepareStatement(query);
	    	
			pstmt.setString(1, sessionId);
			
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				id = rs.getString("id");
				pw = rs.getString("pw");
				name = rs.getString("name");
				phone = rs.getString("phone");
				member = new Member(id,pw,name,phone);
			}
						
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		return member;
	}
	
	
	
	//회원정보리스트 메소드
	public ArrayList<Member> selectMember() {
		ArrayList<Member> list = new ArrayList<>();
		try{
	    	 context = new InitialContext();
	    	 dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
	    	 conn = dataSource.getConnection();
	    	 query = "select * from member";
	    	 pstmt = conn.prepareStatement(query);
	    	 rs = pstmt.executeQuery();
	    	 while(rs.next()) {
	    		 id = rs.getString("id");
	    		 pw = rs.getString("pw");
	    		 name = rs.getString("name");
	    		 phone = rs.getString("phone");
	    		 list.add(new Member(id,pw,name,phone));
	    	 }
	    }catch(Exception e){
	    	e.printStackTrace();
	    }finally{
	    	try{
	    		if(rs!=null) rs.close();
	    		if(pstmt!=null) pstmt.close();
	    		if(conn!=null) conn.close();
	    	}catch(Exception e2){e2.printStackTrace();}
	    }
		return list;
	}//selectMember
	
	
	//회원정보입력 메소드
	public int insertMember(Member member) {
		try{
	    	 context = new InitialContext();
	    	 dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
	    	 conn = dataSource.getConnection();
	    	 query = "insert into member values(?,?,?,?)";
	    	 pstmt = conn.prepareStatement(query);
	    	 pstmt.setString(1, member.getId());
	    	 pstmt.setString(2, member.getPw());
	    	 pstmt.setString(3, member.getName());
	    	 pstmt.setString(4, member.getPhone());
	    	 
	    	 //성공-1, 실패-0
	    	 result = pstmt.executeUpdate(); //executeUpdate()-insert,update,delete   executeQuery()-select
	    	 
	    }catch(Exception e){
	    	e.printStackTrace();
	    }finally{
	    	try{
	    		if(pstmt!=null) pstmt.close();
	    		if(conn!=null) conn.close();
	    	}catch(Exception e2){e2.printStackTrace();}
	    }
		
		return result;
	}
	
	
	public int updateMember(Member member) {
		try{
			
			conn = getConnection();
			query = "update member set pw=?, name=?, phone=? where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, member.getPw());
			pstmt.setString(2, member.getName());
			pstmt.setString(3, member.getPhone());
			pstmt.setString(4, member.getId());
			
			System.out.println(member.getName());
			//성공-1, 실패-0
			result = pstmt.executeUpdate(); //executeUpdate()-insert,update,delete   executeQuery()-select
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			}catch(Exception e2){e2.printStackTrace();}
		}
		
		return result;
	}

}