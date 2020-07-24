package com.cg.Dao;

import org.springframework.stereotype.Repository;

import com.cg.Entity.Flight;



@Repository
public interface FlightDao {
	public void create(Flight flight);

}
