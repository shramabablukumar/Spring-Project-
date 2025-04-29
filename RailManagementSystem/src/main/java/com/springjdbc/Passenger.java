package com.springjdbc;

public class Passenger {
	private int Pid;
	private String PName;
	private String PEmail;
	private int Pphonenumber;
	private String address;
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public String getPName() {
		return PName;
	}
	public void setPName(String pName) {
		PName = pName;
	}
	public String getPEmail() {
		return PEmail;
	}
	public void setPEmail(String pEmail) {
		PEmail = pEmail;
	}
	public int getPphonenumber() {
		return Pphonenumber;
	}
	public void setPphonenumber(int pphonenumber) {
		Pphonenumber = pphonenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Passenger [Pid=" + Pid + ", PName=" + PName + ", PEmail=" + PEmail + ", Pphonenumber=" + Pphonenumber
				+ ", address=" + address + "]";
	}
	public Passenger(int pid, String pName, String pEmail, int pphonenumber, String address) {
		super();
		Pid = pid;
		PName = pName;
		PEmail = pEmail;
		Pphonenumber = pphonenumber;
		this.address = address;
	}
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
