package com.springpro;

public class Student {
	private int id;
	private String Name;
	public Student(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + "...................." + this.Name;
	}
	
	

}
