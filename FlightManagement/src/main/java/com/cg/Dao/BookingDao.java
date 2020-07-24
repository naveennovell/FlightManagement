package com.cg.Dao;

import org.springframework.stereotype.Repository;

import com.cg.Entity.Booking;

@Repository
public interface BookingDao {
	public void create(Booking booking);

}
