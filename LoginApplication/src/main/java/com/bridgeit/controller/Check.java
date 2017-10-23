package com.bridgeit.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Check")
public class Check extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("check servlet");
		PrintWriter out= response.getWriter();
		int flag=0;
		
		String username= request.getParameter("username");
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","root");
			Statement stmt=con.createStatement();
			ResultSet rs= stmt.executeQuery("select username from personDetails");
			while(rs.next()){
				if(rs.getString(1).equals(username)){
					flag=1;
					break;
				}
			}
			if(flag==1){
				out.println("Username Taken");
				//request.getRequestDispatcher("Register.jsp").include(request, response);
			}else{
				out.print("username available");
			}
			con.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

