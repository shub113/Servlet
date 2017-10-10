package com.bridgeit.Controler;

import java.io.*;

import javax.jws.WebService;
import javax.servlet.*;
import javax.servlet.http.*;


public class Helloo extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
		
		processRequest(response,request);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException{
		processRequest(response,request);
		
	}
	public void processRequest(HttpServletResponse response,HttpServletRequest request) throws IOException{
		PrintWriter p= response.getWriter();
		int first= Integer.parseInt(request.getParameter("t1"));
		int last= Integer.parseInt(request.getParameter("t2"));
		
		int sum= first+last;
		p.println(sum);
	}
}
