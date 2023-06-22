package com.java.www.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.java.www.dto.Board;

public class BoardDao {
	
	private Context context = null;
    private DataSource dataSource = null;
    private Connection conn = null;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String query;
	
	private Board board = null;
	
	private int bno,bhit,bgroup,bstep,bindent;
	private String id ,btitle,bcontent,bfile;
	private Date bdate;
	private int result;
		
	
	// connection
	public Connection getConnection() {
		Connection connection = null;
		try {
			context = new InitialContext();
	    	dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
	    	connection = dataSource.getConnection();
		}catch(Exception e){e.printStackTrace();}
		return connection;
	}// connection
	
	
	
	// 게시글 저장
	public int insertOne(String userId, String userBtitle, String userBcontent, String userBfile) {
		
		
		try {
			
			conn = getConnection();
			query= " insert into board values ( board_seq.nextval, ? , ?, ? ,sysdate, 0,board_seq.currval,0,0,?)";
			pstmt = conn.prepareStatement(query);
						
			pstmt.setString(1, userId);
			pstmt.setString(2, userBtitle);
			pstmt.setString(3, userBcontent);
			pstmt.setString(4, userBfile);
			
			result = pstmt.executeUpdate();
		
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {e2.printStackTrace();}
		}

		
		return result;
	}
	
	// 한개 들고오기 
	public Board selectOne(int userBno){
		try {
			
			conn = getConnection();
			query="select * from board where bno=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, userBno);
			rs = pstmt.executeQuery();
		
			while(rs.next()) {
				
				bno = rs.getInt("bno");
				id = rs.getString("id");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				bfile = rs.getString("bfile");
				bhit = rs.getInt("bhit");
				bgroup = rs.getInt("bgroup");
				bstep = rs.getInt("bstep");
				bindent = rs.getInt("bindent");
				bdate = rs.getDate("bdate");
				board = new Board(bno, id,btitle, bcontent, bdate, bhit, bgroup, bstep, bindent, bfile);
			}
		
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {e2.printStackTrace();}
		}
	
		
		return board;
	}
	// 전체 들고오기 
	public ArrayList<Board> selectAll(){
		System.out.print("ddddddddddddd");
		ArrayList<Board> list = new ArrayList<>();
		
		try {
			
			conn = getConnection();
			query="select * from board";
			
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
		
			while(rs.next()) {
				
				bno = rs.getInt("bno");
				id = rs.getString("id");
				btitle = rs.getString("btitle");
				bcontent = rs.getString("bcontent");
				bfile = rs.getString("bfile");
				bhit = rs.getInt("bhit");
				bgroup = rs.getInt("bgroup");
				bstep = rs.getInt("bstep");
				bindent = rs.getInt("bindent");
				bdate = rs.getDate("bdate");
				list.add(new Board(bno, id,btitle, bcontent, bdate, bhit, bgroup, bstep, bindent, bfile));
				
				
			}
		
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {e2.printStackTrace();}
		}
	
		
		return list;
	} // selectAll
	
	
	// 게시글 삭제 
	public int deleteOne(int bno) {
		
		try {
			
			conn = getConnection();
			query= "delete board where bno=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, bno);			
			result = pstmt.executeUpdate();
		
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e2) {e2.printStackTrace();}
		}

		
		return result;
		
	}

}
