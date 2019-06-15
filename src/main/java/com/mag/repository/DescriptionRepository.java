package com.mag.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mag.entity.CruiseShip;
import com.mag.entity.ShipDescription;

public interface DescriptionRepository extends JpaRepository<ShipDescription, Long> {
	//ShipDescription findShipDescriptionByDescription(String description);
	
}
