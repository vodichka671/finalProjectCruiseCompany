package com.mag.controller;

import java.util.Collections;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mag.domain.Role;
import com.mag.domain.User;
import com.mag.repository.UserRepository;

@Controller
public class RegistrationController {
	
	
	@Autowired
	private UserRepository repo;
		@RequestMapping("/registration")
	public	String registration() {
			return "registration";
		}

		@RequestMapping(value = "/registration",method = RequestMethod.POST)
	public	String index(@ModelAttribute("user")User user) {
			User userFromDb = repo.findUserByUsername(user.getUsername());
			//System.out.println(user.getName());
			//userFromDb.ifPresent(useropt->System.out.println(useropt.getName()+"is present in db"));
			if (userFromDb!=null) {
				System.out.println("User is already in db");
				return "index";
			}
			//User newUser = new User();
			//newUser.setUsername(username);
			//newUser.setPassword(password);
			user.setActive(true);
			user.setRoles(Collections.singleton(Role.USER));
			repo.save(user);
			
			return "redirect:/login";
		}

}
