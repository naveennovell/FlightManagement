package com.cg.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.Entity.Flight;
@Transactional
@Repository
public class FlightDaoImpl implements FlightDao {
	@PersistenceContext
	EntityManager em;

	@Override
	
	public void create(Flight flight) {
		System.out.println(flight.getArrival());
		em.persist(flight);
		
		
	}

}
