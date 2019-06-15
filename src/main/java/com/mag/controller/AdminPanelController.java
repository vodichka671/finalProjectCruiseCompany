package com.mag.controller;

import java.util.List;
import java.util.Map;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mag.domain.User;
import com.mag.entity.CruiseShip;
import com.mag.entity.Route;
import com.mag.repository.CruiseShipRepository;
import com.mag.repository.RouteRepository;
import com.mag.service.JorneyService;

@Controller 
@RequestMapping("/admin")
@PreAuthorize("hasAuthority('ADMIN')")
public class AdminPanelController {
	
	@Autowired
	CruiseShipRepository cruiseRepo;
	@Autowired 
	JorneyService jorneyService;
	
	@RequestMapping("/adminpage")
	public String getAdminPanel(Model model) {
		jorneyService.modelConnector(model);
		return "adminpage";
	}
	
	
	@RequestMapping(value = "/setjorney",method = RequestMethod.POST)
	public String setJorney(@RequestParam("shipName")String shipName,@RequestParam("description")String description,Model model) {

		jorneyService.setJorney(shipName, description);
		jorneyService.modelConnector(model);
		return "adminpage";
	}
}
