package com.springpro;

public class Student {
	private int Sid;
	private String Name;
	private Adress a;
	public int getSid() {
		return Sid;
	}
	public void setSid(int sid) {
		Sid = sid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Adress getA() {
		return a;
	}
	public void setA(Adress a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Name=" + Name + ", a=" + a + "]";
	}
	public Student(int sid, String name, Adress a) {
		super();
		Sid = sid;
		Name = name;
		this.a = a;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
