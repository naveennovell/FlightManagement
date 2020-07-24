package com.cg.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.Dao.BookingDao;
import com.cg.Entity.Booking;
import com.cg.Entity.Flight;

public class BookingServiceImpl implements BookingService {
	@Autowired
	BookingDao bookingdao;

	@Override
	public void create(Booking booking) {
		// TODO Auto-generated method stub
		
	}
	



}
