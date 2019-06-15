package com.mag.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

public class ShipDescription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(columnDefinition="TEXT")
	private String shipDescription;
	
	@OneToOne(mappedBy = "description")
	private CruiseShip ship;
	
	
	public String getShipDescription() {
		return shipDescription;
	}
	public void setShipDescription(String shipDescription) {
		this.shipDescription = shipDescription;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public CruiseShip getShips() {
		return ship;
	}
	public void setShips(CruiseShip ship) {
		this.ship = ship;
	}

}
