package com.springjdbc;

import java.util.List;

public interface StudentDao {
	public int insert(Student student);
	public int update(Student student);
	public int Delete(int id);
	public Student getStud(int id);
	public List<Student>getAlldata();

}
