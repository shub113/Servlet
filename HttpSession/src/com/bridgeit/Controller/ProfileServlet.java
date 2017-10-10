package com.bridgeit.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter writer= response.getWriter();
		
		String username=null;
		
		request.getRequestDispatcher("link.html").include(request, response);
		
		HttpSession session= request.getSession(false);
		if(session!=null){
			 username= (String) session.getAttribute("username");
			writer.print("Hello "+username+"\nThis is your profile");
		}else{
			writer.println("<b>First login</b>");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		
		writer.close();
		
	}

}
