package com.mag.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mag.entity.CruiseShip;
import com.mag.repository.CruiseShipRepository;

public class CruiseShipService {
@Autowired
CruiseShipRepository repo;
	public void add(CruiseShip ship) {
		repo.save(ship);
	}
}
