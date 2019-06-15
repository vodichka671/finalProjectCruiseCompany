package com.mag.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class Excursion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	BigDecimal price;
	@OneToOne
	@MapsId
	private Seaport seaport;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Seaport getSeaport() {
		return seaport;
	}
	public void setSeaport(Seaport seaport) {
		this.seaport = seaport;
	}
}
