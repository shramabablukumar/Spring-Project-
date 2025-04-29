package com.springjdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentImpl implements StudentDao {

	private JdbcTemplate jtemplate;
	
	public JdbcTemplate getJtemplate() {
		return jtemplate;
	}

	public void setJtemplate(JdbcTemplate jtemplate) {
		this.jtemplate = jtemplate;
	}

	@Override
	public String toString() {
		return "StudentImpl [jtemplate=" + jtemplate + "]";
	}
	

	public StudentImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentImpl(JdbcTemplate jtemplate) {
		super();
		this.jtemplate = jtemplate;
	}

	@Override
	public int insert(Student student) {
		String q = "INSERT INTO StudTable(sid, SName, SEmail, SPass) VALUES (?, ?, ?, ?)";
	       int result = this.jtemplate.update(q,student.getSid(),student.getSName(),student.getSEmail(),student.getSPass());
	       
		return result;
	}

	@Override
	public int update(Student student) {
	    String q = "update StudTable set SName = ?, SEmail = ?, SPass = ? where sid = ?";
	    int result = this.jtemplate.update(q, 
	                                       student.getSName(), 
	                                       student.getSEmail(), 
	                                       student.getSPass(), 
	                                       student.getSid()); // sid should come last
	    return result;
	}

	@Override
	public int Delete(int id) {
		String q = "delete from StudTable where sid=?";
		int res = this.jtemplate.update(q,id);
		return res;
	}

	@Override
	public Student getStud(int id) {
		String q = "SELECT * FROM StudTable WHERE sid = ?";

		RowMapper<Student> rowma = new RowMapperclass();
		Student result = this.jtemplate.queryForObject(q,rowma,id);
		
		
		return result;
	}

	@Override
	public List<Student> getAlldata() {
		String q = "Select * From StudTable";
		RowMapper<Student> rowma1 = new RowMapperclass();
		List<Student> query = this.jtemplate.query(q, rowma1);
		
	
		return query;
	}

}
