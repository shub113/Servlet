package com.bridgeit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgeit.dao.Database;



/**
 * Servlet implementation class Signin
 * 
 */
@WebServlet("/Signin")
public class Signin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Signin servlet");
		PrintWriter out= response.getWriter();
		
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		
		Database data= Database.getInstance();
		boolean status= data.getConnection();
		if(status){
			// checking username and password
			String name= data.logInCheck(username, password);
			if(name!=null){
				HttpSession session= request.getSession();
				session.setAttribute("name", name);
				response.sendRedirect("Profile.jsp");
				
			}else{
				out.println("<b>wrong usrename or password</b>");
				request.getRequestDispatcher("Home.jsp").include(request, response);
			}
		}else{
			out.println("<b>Something went wrong, try later</b>");
			request.getRequestDispatcher("Home.jsp").include(request, response);
		}
	}

}
