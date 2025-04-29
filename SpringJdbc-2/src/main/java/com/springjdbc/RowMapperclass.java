package com.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperclass implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student so = new Student();
		so.setSid(rs.getInt(1));
		so.setSName(rs.getString(2));
		so.setSEmail(rs.getString(3));
		so.setSPass(rs.getString(4));
		
		
		return so;
	}

}
