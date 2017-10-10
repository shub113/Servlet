package com.bridgeit.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			response.setContentType("text/html");
			PrintWriter writer= response.getWriter();
			
			String username= request.getParameter("t1");
			String password= request.getParameter("t2");
			
			request.getRequestDispatcher("link.html").include(request, response);
			
			if(password.equals("asd")){
				writer.println("Welcome<b> "+username+"</b>");
				HttpSession session= request.getSession();
				session.setAttribute("username", username);
			}else{
				writer.println("<b>Sorry wrong username or password</b>");
				request.getRequestDispatcher("login.html").include(request, response);
			}
			writer.flush();
			writer.close();
			
		}catch(Exception e){e.printStackTrace();}
	}

}
