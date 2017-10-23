package com.bridgeit.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgeit.dao.Database;
import com.bridgeit.model.Details;


@WebServlet("/Register")
public class Register extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("register servlet");
		PrintWriter out= response.getWriter();
		
		String fname= request.getParameter("fname");
		String lname= request.getParameter("lname");
		String pass= request.getParameter("password");
		String username= request.getParameter("username");
		long moblie= Long.parseLong(request.getParameter("mobile"));
		String mob=request.getParameter("mobile");
		long mobile= Long.parseLong(mob);
		
		Details detail= new Details();
		
		detail.setFname(fname);
		detail.setLname(lname);
		detail.setPassword(pass);
		detail.setMobile(moblie);
		detail.setEmail(username);
		
		//server side validation
		if(!Pattern.matches("[a-zA-Z0-9]+@[a-zA-Z]+\\.[A-Za-z]{2,3}$", username)){
			out.println("<b>Wrong email pattern</b>");
			request.getRequestDispatcher("Register.jsp").include(request, response);
			
		}else{
			Database data= Database.getInstance();
			
			boolean status= data.getConnection();
			if(status){
				try {
					data.save(detail);
					out.println("<b>Account created</b>");
					request.getRequestDispatcher("Home.jsp").include(request, response);
				} catch (Exception e) {
					out.println("<b>Account Not created</b>");
					request.getRequestDispatcher("Home.jsp").include(request, response);
					e.printStackTrace();
				}
			}else{
				out.println("<b>Something went wrong!! try later</b>");
				request.getRequestDispatcher("Home.jsp").include(request, response);
			}
		}
		
	}

}
