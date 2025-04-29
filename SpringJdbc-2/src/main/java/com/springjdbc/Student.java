package com.springjdbc;

public class Student {
	private int sid;
	private String SName;
	private String SEmail;
	private String SPass;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	public String getSEmail() {
		return SEmail;
	}
	public void setSEmail(String sEmail) {
		SEmail = sEmail;
	}
	public String getSPass() {
		return SPass;
	}
	public void setSPass(String sPass) {
		SPass = sPass;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", SName=" + SName + ", SEmail=" + SEmail + ", SPass=" + SPass + "]";
	}
	public Student(int sid, String sName, String sEmail, String sPass) {
		super();
		this.sid = sid;
		SName = sName;
		SEmail = sEmail;
		SPass = sPass;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
