package com.bridgeit.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Details {	
	private String fname,lname,password,username;
	private long mobile;
	@Id
	int id;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return fname;
	}
	public void setName(String fname) {
		this.fname = fname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return username;
	}
	public void setEmail(String email) {
		this.username = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Details [fname=" + fname + ", lname=" + lname + ", password=" + password + ", username=" + username
				+ ", mobile=" + mobile + ", id=" + id + "]";
	}
	
}

