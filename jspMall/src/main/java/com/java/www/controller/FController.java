package com.java.www.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.www.service.BDeleteService;
import com.java.www.service.BEditService;
import com.java.www.service.BListService;
import com.java.www.service.BService;
import com.java.www.service.BViewService;
import com.java.www.service.BWriteService;




@WebServlet("*.do")
public class FController extends HttpServlet {
	
	protected void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doAction");
		request.setCharacterEncoding("utf-8");
		
		BService bservice =null;
		String url = request.getRequestURI(); // jspMall/login.do
		String contextPath = request.getContextPath(); // jspMall
		String fileName = url.substring(contextPath.length()); // login.do
		String page="";
		
		System.out.println("호출 파일 : "+ fileName);
	
		
		if(fileName.equals("/list.do")) {
			
			bservice = new BListService();
			bservice.execute(request, response);
			page = "list.jsp";
			
		}else if(fileName.equals("/view.do")) {
			
			bservice = new BViewService(); // board 1개 가져옴
			bservice.execute(request, response);
			page = "view.jsp";
		}else if(fileName.equals("/main.do")) {
			page = "main.jsp";
		}else if(fileName.equals("/write.do")) {
			page = "write.jsp";
		}else if(fileName.equals("/dowrite.do")) {
			
				
			bservice = new BWriteService(); //
			bservice.execute(request, response);
			page = "dowrite.jsp";
			
			
		}else if(fileName.equals("/delete.do")) {
			
				
			bservice = new BDeleteService(); //
			bservice.execute(request, response);
			page = "dodelete.jsp";
			//response.sendRedirect("list.do");
			
			
		}else if(fileName.equals("/edit.do")) {
		
		
			bservice = new BEditService(); //
			bservice.execute(request, response);
			page = "edit.jsp";
		
		}
		
		
		
		
		
		
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
	
	
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doAction(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		doAction(request, response);
	}

}
