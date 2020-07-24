package com.cg.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="BookingDetails")
public class Booking {
	public Booking()
	{
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long BookingId;
	
	@Column
	private String Name;
	@Column
	private String Age;
	@Column
	private double price;
	@Column
	private String FlightName;
	
	
	public Long getBookingId() {
		return BookingId;
	}
	public void setBookingId(Long bookingId) {
		BookingId = bookingId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getFlightName() {
		return FlightName;
	}
	public void setFlightName(String flightName) {
		FlightName = flightName;
	}
	public Booking(Long bookingId, String name, String age, double price, String flightName) {
		super();
		BookingId = bookingId;
		Name = name;
		Age = age;
		this.price = price;
		FlightName = flightName;
	}
	

}
