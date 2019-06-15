package com.mag.repository;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mag.entity.CruiseShip;

public interface CruiseShipRepository extends JpaRepository<CruiseShip, Long> {
	//CruiseShip findCruiseShipByShipname(String shipName);
	//@Query("SELECT u FROM User u WHERE u.shipName = ?")
	Optional<CruiseShip> findCruiseShipByShipName(String shipName);
}
