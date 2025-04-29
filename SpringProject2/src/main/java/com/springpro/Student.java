package com.springpro;

import java.util.List;
import java.util.Map;

public class Student {
	private int sid;
	private String sname;
	private List<String>skills;
	private Map<String,String>course;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", skills=" + skills + ", course=" + course + "]";
	}
	public Student(int sid, String sname, List<String> skills, Map<String, String> course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.skills = skills;
		this.course = course;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
