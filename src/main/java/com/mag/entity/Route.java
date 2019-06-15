package com.mag.entity;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Route {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String description;
	Integer portAmount;
	Integer duration;
	BigDecimal price;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "route_seaports",
				joinColumns = {@JoinColumn(name = "route_id")},
				inverseJoinColumns = {@JoinColumn(name="seaport_id")}
			)
	Set<Seaport> seaports;
	
	@OneToMany(mappedBy = "route")
	Set<SeaJorney> jorneys;
	
	
	
	@Override
	public String toString() {
		
		return ""+this.getId()+"\n" + this.getDescription()+"\n" + this.getDuration();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getPortAmount() {
		return portAmount;
	}
	public void setPortAmount(Integer portAmount) {
		this.portAmount = portAmount;
	}
	public Integer getDuration() {
		return duration;
	}
	public Set<Seaport> getSeaports() {
		return seaports;
	}
	public void setSeaports(Set<Seaport> seaports) {
		this.seaports = seaports;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Set<SeaJorney> getJorneys() {
		return jorneys;
	}
	public void setJorneys(Set<SeaJorney> jorneys) {
		this.jorneys = jorneys;
	}
	
}
