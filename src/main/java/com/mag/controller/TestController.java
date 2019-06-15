package com.mag.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mag.domain.Role;
import com.mag.domain.User;
import com.mag.entity.CruiseShip;
import com.mag.entity.Excursion;
import com.mag.entity.Route;
import com.mag.entity.Seaport;
import com.mag.entity.ShipDescription;
import com.mag.entity.TicketTypePrices;
import com.mag.repository.CruiseShipRepository;
import com.mag.repository.DescriptionRepository;
import com.mag.repository.ExcursionRepository;
import com.mag.repository.RouteRepository;
import com.mag.repository.SeaportRepository;
import com.mag.repository.TicketTypesPriceRepository;
import com.mag.repository.UserRepository;
//import com.mag.repository.ShipNameRepository;

@Controller
public class TestController {
	@Autowired
	CruiseShipRepository cruiseRepo;
	@Autowired
	UserRepository userRepo;
	@Autowired
	DescriptionRepository descRepo;
	@Autowired
	SeaportRepository portRepo;
	@Autowired
	ExcursionRepository exRepo;
	@Autowired
	RouteRepository routeRepo;
	@Autowired
	TicketTypesPriceRepository ticketRepo;
	//@Autowired
//	ShipNameRepository shipNameRepo;
	@RequestMapping("/createdb")
	public String procedure(Model model) {
		
		     System.out.println(SecurityContextHolder.getContext().getAuthentication().getName());
		     
		  
		   
		     
		//Description Table -----------------------------------
		ShipDescription description = new ShipDescription();
		ShipDescription description1 = new ShipDescription();
		description1.setShipDescription("Azura is a ship that has been tailor-made for the British market. From the entertainment roster of former TV stars to the excellent range of ales and gins served in the ship's numerous bars.");
		description.setShipDescription("Balmoral is the largest of our ocean-going cruise ships, yet is still small enough to navigate size-restricted waterways such as the Kiel Canal, providing fantastic scenic cruising opportunities, and retains the warm, intimate and friendly atmosphere that the Fred. Olsen fleet is renowned for.");
		
	//	descRepo.save(description1);
	//	descRepo.save(description);
		
		//Cruise ship table -----------------------------------
		CruiseShip ship1 = new CruiseShip();
		CruiseShip ship2 = new CruiseShip();
		
		ship1.setDescription(description);
		ship1.setPassengerBasicCapacity(100);
		ship1.setPassengerBuisnessCapacity(50);
		ship1.setPassengerVipCapacity(10);
		ship1.setPersonalAmount(87);
		//ship1.setPrices(ticketprices1);
		ship1.setShipName("Azura");
		
		ship2.setDescription(description1);
		ship2.setPassengerBasicCapacity(120);
		ship2.setPassengerBuisnessCapacity(40);
		ship2.setPassengerVipCapacity(20);
		ship2.setPersonalAmount(135);
		//ship2.setPrices(ticketprices2);
		ship2.setShipName("Balmoral");
		
		
		// Port table ---------------------------
		Seaport port1 = new Seaport();
		Seaport port2 = new Seaport();
		Seaport port3 = new Seaport();
		Seaport port4 = new Seaport();
		
		port1.setPortName("Стокгольм");
		port2.setPortName("Питер");
		port3.setPortName("Хельсинки");
		port4.setPortName("Таллин");
		//Excursions table
		Excursion ex1 = new Excursion();
		Excursion ex2 = new Excursion();
		Excursion ex3 = new Excursion();
		Excursion ex4 = new Excursion();
		
		ex1.setPrice(new BigDecimal("30.45"));
		ex2.setPrice(new BigDecimal("33"));
		ex3.setPrice(new BigDecimal("35.50"));
		ex4.setPrice(new BigDecimal("23.80"));
		
		ex1.setSeaport(port1);
		ex2.setSeaport(port2);
		ex3.setSeaport(port3);
		ex4.setSeaport(port4);
		
		//Route setup ------------------------------
		Route route1 = new Route();
		Route route2 = new Route();
		Set<Seaport> b = new HashSet();
		b.addAll( (Collection<? extends Seaport>) Arrays.asList( portRepo.getOne((long)2),portRepo.getOne((long)1),portRepo.getOne((long)3)));         // from an array variabl
		route1.setDuration(5);
		route1.setPortAmount(3);
		route1.setDescription("Питер -> Стокгольм -> Хельсинки");
		route1.setPrice(new BigDecimal("250"));
		route1.setSeaports(b);
		
		//Ticket prices setup ---------------------------
		//cruiseRepo.saveAll(Arrays.asList(ship1,ship2));
		
		TicketTypePrices ticketprices1 = new TicketTypePrices();
		TicketTypePrices ticketprices2 = new TicketTypePrices();
		
		ticketprices1.setBasic(new BigDecimal("200"))
						.setBuisness(new BigDecimal("300"))
						.setVip(new BigDecimal("450")).setShip(cruiseRepo.getOne((long)1));
		
		ticketprices2.setBasic(new BigDecimal("150"))
		.setBuisness(new BigDecimal("250"))
		.setVip(new BigDecimal("450")).setShip(cruiseRepo.getOne((long)2));
		
		//ticketRepo.saveAll(Arrays.asList(ticketprices1,ticketprices2));
		
		
		
		//descRepo.saveAll(Arrays.asList(description,description1));
		//portRepo.saveAll(Arrays.asList(port1,port2,port3,port4));
		//exRepo.saveAll(Arrays.asList(ex1,ex2,ex3,ex4));
		routeRepo.save(route1);
		
		
		return "hello";
	}
}
