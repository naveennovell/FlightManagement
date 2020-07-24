package com.cg.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Dao.FlightDao;
import com.cg.Entity.Flight;

@Service
public class FlightServiceImpl implements FlightService{
	@Autowired
	FlightDao flightdao;

	@Override
	public void create(Flight flight) {
		flight.setFlightId(1001l);
		flight.setArrival("6am");
		flight.setDeparture("8:30am");
		flight.setDuration("2hrs30min");
		flight.setPrice(4230.0);
		flight.setFlightName("indigo");
		flightdao.create(flight);
		
		
	}

}
