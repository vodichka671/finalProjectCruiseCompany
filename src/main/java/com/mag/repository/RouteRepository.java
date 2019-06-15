package com.mag.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mag.entity.Route;
import com.mag.entity.ShipDescription;

public interface RouteRepository extends JpaRepository<Route, Long>{
	//@Query("SELECT u FROM Route u WHERE u.description = ?")
	Optional<Route> findRouteByDescription(String description);
}
