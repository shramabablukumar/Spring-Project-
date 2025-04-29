package com.springjdbc;

public class Employee {
	private int empid;
	private String empName;
	private String empCity;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empCity=" + empCity + "]";
	}
	public Employee(int empid, String empName, String empCity) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empCity = empCity;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
