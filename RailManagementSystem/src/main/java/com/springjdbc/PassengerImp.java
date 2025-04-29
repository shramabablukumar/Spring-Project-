package com.springjdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class PassengerImp implements PassengerDao {
	private JdbcTemplate jtemplate;
	
	

	public PassengerImp() {
		super();
		// TODO Auto-generated constructor stub
	}



	public PassengerImp(JdbcTemplate jtemplate) {
		super();
		this.jtemplate = jtemplate;
	}



	@Override
	public String toString() {
		return "PassengerImp [jtemplate=" + jtemplate + "]";
	}



	public JdbcTemplate getJtemplate() {
		return jtemplate;
	}



	public void setJtemplate(JdbcTemplate jtemplate) {
		this.jtemplate = jtemplate;
	}



	@Override
	public int insert(Passenger passenger) {
		String q = "insert into RailWayMang(Pid,PName,PEmail,Pphonenumber,address)value(?,?,?,?,?)";
       int update = this.jtemplate.update(q,passenger.getPid(),passenger.getPName(),passenger.getPEmail(),passenger.getPphonenumber(),passenger.getAddress());
		
		return update;
	}



	@Override
	public int edit(Passenger passenger) {
		String q = "update  RailWayMang set PName = ?,PEmail = ?,Pphonenumber = ?,address = ? where Pid = ?";
		int update1 = this.jtemplate.update(q,passenger.getPName(),passenger.getPEmail(),passenger.getPphonenumber(),passenger.getAddress(),passenger.getPid());
		return update1;
	}



	@Override
	public int Delete(int id) {
		String q = "delete from RailWayMang where Pid = ?";
		int delete = this.jtemplate.update(q,id);
		return delete;
	}



	@Override
	public Passenger getPass(int id) {
		String q = "select * from  RailWayMang where pid= ?";
		RowMapper<Passenger> romap = new RowMapperTr();
		Passenger singleObject = this.jtemplate.queryForObject(q,romap,id);
		
		
		return singleObject;
	}



	@Override
	public List<Passenger> getAllData() {
		String q = "select * from  RailWayMang";
		RowMapper<Passenger> rowmap1 = new RowMapperTr();
		List<Passenger> allData = this.jtemplate.query(q, rowmap1);
		return allData;
	}



	

}
