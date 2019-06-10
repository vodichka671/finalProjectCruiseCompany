package com.mag.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "ship_desription")
public class ShipDescription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String description;

	@OneToOne(mappedBy = "description")
	private CruiseShip ship;
	

	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public CruiseShip getShip() {
		return ship;
	}
	public void setShip(CruiseShip ship) {
		this.ship = ship;
	}

}
