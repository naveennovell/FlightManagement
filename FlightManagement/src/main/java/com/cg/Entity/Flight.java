package com.cg.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="FlightsAvailable")
public class Flight {
	
	public Flight()
	{
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long FlightId;
	@Column
	private String FlightName;
	@Column
	private String Departure;
	@Column
	private String Duration;
	@Column
	private String Arrival;
	@Column
	private double price;
	public Long getFlightId() {
		return FlightId;
	}
	public void setFlightId(Long flightId) {
		FlightId = flightId;
	}
	public String getFlightName() {
		return FlightName;
	}
	public void setFlightName(String flightName) {
		FlightName = flightName;
	}
	public String getDeparture() {
		return Departure;
	}
	public void setDeparture(String departure) {
		Departure = departure;
	}
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	public String getArrival() {
		return Arrival;
	}
	public void setArrival(String arrival) {
		Arrival = arrival;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Flight(Long flightId, String flightName, String departure, String duration, String arrival, double price) {
		super();
		FlightId = flightId;
		FlightName = flightName;
		Departure = departure;
		Duration = duration;
		Arrival = arrival;
		this.price = price;
	}
	

}
