package com.bridgeit.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		String word= request.getParameter("t1");
		
		response.sendRedirect("https://www.google.co.in/#q="+word);
	}
}
