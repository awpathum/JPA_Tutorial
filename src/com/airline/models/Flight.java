package com.airline.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Flight
 *
 */
@Entity
public class Flight implements Serializable {

	private static final long serialVersionUID = 1L;

	public Flight() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Enumerated(EnumType.STRING)
	private FlightDestinations flightOrigin;

	@Enumerated(EnumType.STRING)
	private FlightDestinations flightDestinations;

	private Integer price;

	@Temporal(TemporalType.TIMESTAMP)
	private Date flightTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public FlightDestinations getFlightOrigin() {
		return flightOrigin;
	}

	public void setFlightOrigin(FlightDestinations flightOrigin) {
		this.flightOrigin = flightOrigin;
	}

	public FlightDestinations getFlightDestinations() {
		return flightDestinations;
	}

	public void setFlightDestinations(FlightDestinations flightDestinations) {
		this.flightDestinations = flightDestinations;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Date getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(Date flightTime) {
		this.flightTime = flightTime;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", flightOrigin=" + flightOrigin
				+ ", flightDestinations=" + flightDestinations + ", price="
				+ price + ", flightTime=" + flightTime + "]";
	}

}