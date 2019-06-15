package com.mag.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Seaport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String portName;
	@ManyToMany(mappedBy = "seaports")
	Set<Route> routes;
	
	@OneToOne(mappedBy = "seaport",cascade = CascadeType.ALL)
	//@JoinColumn(referencedColumnName = "id")
	Excursion excursion;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPortName() {
		return portName;
	}
	public void setPortName(String portName) {
		this.portName = portName;
	}
	public Set<Route> getRoutes() {
		return routes;
	}
	public void setRoutes(Set<Route> routes) {
		this.routes = routes;
	}
}
