package com.bridgeit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bridgeit.model.Details;




public class Database {
	Connection con= null;
	
	// private constructor
	private Database(){}
	
	//inner class
	private static class BillPugh{
		private static final Database obj= new Database();
	}
	
	// method to create object
	public static Database getInstance(){
		return BillPugh.obj;
	}
	/**
	 * @return
	 * getting connection
	 */
	public boolean getConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/email","root","root");
			con.setAutoCommit(false);
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * @param detail
	 * @throws Exception
	 * inserting into database email table personDetails
	 */
	public void save(Details detail) throws Exception{
		try{
			PreparedStatement stmt= con.prepareStatement("insert into personDetails (fname,lname,username,password,mobile) values(?,?,?,?,?)");
			stmt.setString(1,detail.getFname());
			stmt.setString(2, detail.getLname());
			stmt.setString(3, detail.getEmail());
			stmt.setString(4, detail.getPassword());
			stmt.setLong(5, detail.getMobile());
			
			stmt.executeUpdate();
			con.commit();
		}catch(Exception e){
			con.rollback();
			e.printStackTrace();
		}finally {
			con.close();
		}
	}
	
	
	/**
	 * @param username
	 * @param password
	 * @return first name of that user if it exits else null
	 * @throws Exception 
	 */
	public String logInCheck(String username, String password){
		String name=null;
		try{
			PreparedStatement stmt= con.prepareStatement("select * from personDetails where username=? and password=?");
			stmt.setString(1, username);
			stmt.setString(2, password);
			ResultSet rs= stmt.executeQuery();
			while(rs.next()){
				if(rs.getString(4).equals(username) && rs.getString(5).equals(password)){
					name=rs.getString(2);
					System.out.println(name);
					break;
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return name;
	}
}

