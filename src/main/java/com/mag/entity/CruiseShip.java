package com.mag.entity;

import java.util.Set;

import javax.persistence.CascadeType;
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
	
	@OneToMany(mappedBy = "ship")
	private Set<SeaJorney> seajorneys;

	private Integer personalAmount;
	private Integer passengerBasicCapacity;
	private Integer passengerBuisnessCapacity;
	private Integer passengerVipCapacity;
	@OneToOne(mappedBy = "ship",cascade = CascadeType.ALL)
	TicketTypePrices prices;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "description",referencedColumnName = "id")
	ShipDescription description;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getPassengerVipCapacity() {
		return passengerVipCapacity;
	}
	public void setPassengerVipCapacity(Integer passengerVipCapacity) {
		this.passengerVipCapacity = passengerVipCapacity;
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
	
	public Integer getPassengerBasicCapacity() {
		return passengerBasicCapacity;
	}
	public void setPassengerBasicCapacity(Integer passengerBasicCapacity) {
		this.passengerBasicCapacity = passengerBasicCapacity;
	}
	public Integer getPassengerBuisnessCapacity() {
		return passengerBuisnessCapacity;
	}
	public void setPassengerBuisnessCapacity(Integer passengerBuisnessCapacity) {
		this.passengerBuisnessCapacity = passengerBuisnessCapacity;
	}

	public ShipDescription getDescription() {
		return description;
	}
	public void setDescription(ShipDescription description) {
		this.description = description;
	}
	public Set<SeaJorney> getSeajorneys() {
		return seajorneys;
	}
	public void setSeajorneys(Set<SeaJorney> seajorneys) {
		this.seajorneys = seajorneys;
	}

	public TicketTypePrices getPrices() {
		return prices;
	}
	public void setPrices(TicketTypePrices prices) {
		this.prices = prices;
	}
}
