package com.cg.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.cg.Entity.Booking;

public class BookingDaoImpl implements BookingDao{
	@PersistenceContext
	EntityManager em;

	@Override
	public void create(Booking booking) {
		em.persist(booking);
		
	}

}
