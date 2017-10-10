package com.bridgeit.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			response.setContentType("text/html");
			PrintWriter writer= response.getWriter();
			
			
			
			HttpSession session=request.getSession(false);
			if(session!=null){
				session.invalidate();
				request.getRequestDispatcher("link.html").include(request, response);
				writer.println("<b>Session logout<b>");
				//response.sendRedirect("login.html");
				
			}else{
				response.sendRedirect("ProfileServlet");
			}
			
			
			
			
			writer.flush();
			writer.close();
			
		}catch(Exception e){e.printStackTrace();}
	}

}
