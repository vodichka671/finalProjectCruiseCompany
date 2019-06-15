package com.mag.entity;


import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class TicketTypePrices {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	BigDecimal basic;
	BigDecimal buisness;
	BigDecimal vip;
	@OneToOne
	@MapsId
	CruiseShip ship;
	public Long getId() {
		return id;
	}
	public TicketTypePrices setId(Long id) {
		this.id = id;
		return this;
	}
	public BigDecimal getBasic() {
		return basic;
	}
	public TicketTypePrices setBasic(BigDecimal basic) {
		this.basic = basic;
		return this;
	}
	public BigDecimal getBuisness() {
		return buisness;
	}
	public TicketTypePrices setBuisness(BigDecimal buisness) {
		this.buisness = buisness;
		return this;
	}
	public BigDecimal getVip() {
		return vip;
	}
	public TicketTypePrices setVip(BigDecimal vip) {
		this.vip = vip;
		return this;
	}
	public CruiseShip getShip() {
		return ship;
		
	}
	public TicketTypePrices setShip(CruiseShip ship) {
		this.ship = ship;
		return this;
	}
	
}
