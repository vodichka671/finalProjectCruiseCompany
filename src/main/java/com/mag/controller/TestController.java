package com.mag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mag.entity.CruiseShip;
import com.mag.entity.ShipDescription;
import com.mag.repository.CruiseShipRepository;
//import com.mag.repository.ShipNameRepository;

@Controller
public class TestController {
	@Autowired
	CruiseShipRepository cruiseRepo;
	//@Autowired
//	ShipNameRepository shipNameRepo;
	@RequestMapping("/saveentity")
	public String procedure(Model model) {
		
		//model.addAttribute("hell", ship);
		
		
		return "hello";
	}
}
