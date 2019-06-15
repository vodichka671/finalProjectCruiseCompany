package com.mag.controller;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mag.domain.Role;
import com.mag.domain.User;
import com.mag.repository.CruiseShipRepository;
import com.mag.repository.UserRepository;

@Controller
public class MainController {
@Autowired
private UserRepository userRepo;
@Autowired CruiseShipRepository cruisRepo;
	@RequestMapping("/")
	public String hello( Model model) {
		User admin = new User();
		admin.setUsername("admin");
		admin.setPassword("admin");
		admin.setActive(true);
		admin.setRoles(Collections.singleton(Role.ADMIN));
		if(userRepo.findUserByUsername("admin")==null) {
			userRepo.save(admin);
		}
		model.addAttribute("ships", cruisRepo.findAll());
		return"/hello";
	}

	@RequestMapping("/all")
	public @ResponseBody List<User> getUsers() {
		return (List<User>) userRepo.findAll();
	}

	
}
