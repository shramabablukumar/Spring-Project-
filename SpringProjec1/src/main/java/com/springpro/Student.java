package com.springpro;

public class Student {
	
	private int stid;
	private String stName;
	private String userName;
	private String password;
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stid, String stName, String userName, String password) {
		super();
		this.stid = stid;
		this.stName = stName;
		this.userName = userName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [stid=" + stid + ", stName=" + stName + ", userName=" + userName + ", password=" + password
				+ "]";
	}
	

}
