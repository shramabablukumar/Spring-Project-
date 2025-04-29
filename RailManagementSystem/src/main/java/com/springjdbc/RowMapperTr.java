package com.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperTr implements RowMapper<Passenger> {

	@Override
	public Passenger mapRow(ResultSet rs, int rowNum) throws SQLException {
		Passenger po = new Passenger();
		po.setPid(rs.getInt(1));
		po.setPName(rs.getString(2));
		po.setPEmail(rs.getString(3));
		po.setPphonenumber(rs.getInt(4));
		po.setAddress(rs.getString(5));
		
		
		return po;
	}
	

}
