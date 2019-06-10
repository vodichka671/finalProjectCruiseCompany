package com.mag.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Excursion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	Long price;
	@OneToOne(mappedBy = "excursion")
	Seaport seaport;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public Seaport getSeaport() {
		return seaport;
	}
	public void setSeaport(Seaport seaport) {
		this.seaport = seaport;
	}
}
