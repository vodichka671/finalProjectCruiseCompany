package com.mag.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SeaJorney {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@ManyToOne
	@JoinColumn(name = "ship_id",nullable = false)
	CruiseShip ship;
	
	@ManyToOne
	@JoinColumn(name = "route_id",nullable = false)
	Route route;
	
	Integer passengerBasic;
	Integer passengerBuisness;
	Integer passengerVIP;
	public Long getId() {
		return id;
	}
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public CruiseShip getShip() {
		return ship;
	}
	public void setShip(CruiseShip ship) {
		this.ship = ship;
	}

	public Integer getPassengerBasic() {
		return passengerBasic;
	}
	public void setPassengerBasic(Integer passengerBasic) {
		this.passengerBasic = passengerBasic;
	}
	public Integer getPassengerBuisness() {
		return passengerBuisness;
	}
	public void setPassengerBuisness(Integer passengerBuisness) {
		this.passengerBuisness = passengerBuisness;
	}
	public Integer getPassengerVIP() {
		return passengerVIP;
	}
	public void setPassengerVIP(Integer passengerVIP) {
		this.passengerVIP = passengerVIP;
	}

}
