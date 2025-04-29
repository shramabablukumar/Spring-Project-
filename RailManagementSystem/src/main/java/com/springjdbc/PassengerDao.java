package com.springjdbc;

import java.util.List;

public interface PassengerDao {
	
	public int  insert(Passenger passenger);
	public int edit(Passenger passenger);
	public int Delete(int id);
	
	public Passenger getPass(int id);
	public List<Passenger>getAllData();
	

}
