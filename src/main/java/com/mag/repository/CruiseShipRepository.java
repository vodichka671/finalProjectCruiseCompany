package com.mag.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mag.entity.CruiseShip;

public interface CruiseShipRepository extends JpaRepository<CruiseShip, Long> {
	
}
