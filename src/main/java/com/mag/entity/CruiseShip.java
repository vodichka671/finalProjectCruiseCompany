package com.mag.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "cruise_ship")
public class CruiseShip {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String shipName;


	private Integer personalAmount;
	private Integer passengerCapacity;
	@OneToOne
	@JoinColumn(name="description_id", referencedColumnName = "id")
	ShipDescription description;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getShipName() {
		return shipName;
	}
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	public Integer getPersonalAmount() {
		return personalAmount;
	}
	public void setPersonalAmount(Integer personalAmount) {
		this.personalAmount = personalAmount;
	}
	public Integer getPassengerCapacity() {
		return passengerCapacity;
	}
	public void setPassengerCapacity(Integer passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	public ShipDescription getDescription() {
		return description;
	}
	public void setDescription(ShipDescription description) {
		this.description = description;
	}
	
	
}
