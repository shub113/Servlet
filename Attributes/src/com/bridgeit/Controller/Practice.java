package com.bridgeit.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/servlet1")
public class Practice extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public Practice() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In servlet 1");
		try{
			response.setContentType("text/html");
			
			PrintWriter writer= response.getWriter();
			ServletContext context= getServletContext();
			context.setAttribute("Company", "IBM");
			
			writer.println("Welcome to 1st servlet");
			writer.print("<a href='servlet2'>visit</a>");
			writer.close();
			
		}catch(Exception e){e.printStackTrace();}
		
		
	}

}
