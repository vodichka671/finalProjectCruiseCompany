package com.mag.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.mag.entity.CruiseShip;
import com.mag.entity.Route;
import com.mag.entity.SeaJorney;
import com.mag.repository.CruiseShipRepository;
import com.mag.repository.DescriptionRepository;
import com.mag.repository.RouteRepository;
import com.mag.repository.SeaJorneyRepository;
//descRepo.findShipDescriptionByDescription(route.getDescription()).getId()
@Service
public class JorneyService {
	@Autowired
	private CruiseShipRepository cruisRepo;
	@Autowired
	private RouteRepository routeRepo;
	@Autowired
	private SeaJorneyRepository jorneyRepo;
	//@Autowired
	//private DescriptionRepository descRepo;
	
	public void setJorney(String shipName,String description) {
		Optional<Route> routeFromDb = routeRepo.findRouteByDescription(description);
		Optional<CruiseShip> shipFromDb = cruisRepo.findCruiseShipByShipName(shipName);
		
		//System.out.println("?????????????????"+routeFromDb.getDescription()+"??????????????");
		SeaJorney jorney = new SeaJorney();
		
		
		routeFromDb.ifPresent(presentRoute->{
			jorney.setRoute(presentRoute);
		});
		
		shipFromDb.ifPresent(presentShip ->{
			jorney.setShip(presentShip);
			jorney.setPassengerBasic(presentShip.getPassengerBasicCapacity());
			jorney.setPassengerBuisness(presentShip.getPassengerBuisnessCapacity());
			jorney.setPassengerVIP(presentShip.getPassengerVipCapacity());
		});
		
		jorneyRepo.save(jorney);
		
	}
	
	public void modelConnector(Model model) {
		model.addAttribute("ships",cruisRepo.findAll() );
		model.addAttribute("routes", routeRepo.findAll());
		model.addAttribute("jorneys", jorneyRepo.findAll());
	}
}
