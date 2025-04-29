package g.h.k;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int empid;
	private String empName;
	private String EmpCity;
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
		return EmpCity;
	}
	public void setEmpCity(String empCity) {
		EmpCity = empCity;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", EmpCity=" + EmpCity + "]";
	}
	public Employee(int empid, String empName, String empCity) {
		super();
		this.empid = empid;
		this.empName = empName;
		EmpCity = empCity;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
