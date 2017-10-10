package com.bridgeit.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/serv1")
public class Servlet1 extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{		
		PrintWriter writer= response.getWriter();
		
		String username= request.getParameter("t1");
		String password= request.getParameter("t2");
		
		if(password.equals("shubham")){
			RequestDispatcher dispatcher= request.getRequestDispatcher("serv2");
			dispatcher.forward(request, response);
		}else{
			writer.println("<b>Wrong username or password</b><hr>");
			RequestDispatcher dispatcher= request.getRequestDispatcher("login.html");
			dispatcher.include(request, response);
		}
	}
}
