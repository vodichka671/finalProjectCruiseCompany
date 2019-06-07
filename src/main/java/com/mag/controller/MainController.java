package com.mag.controller;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mag.entity.Role;
import com.mag.entity.User;
import com.mag.repository.UserRepository;

@Controller
public class MainController {
@Autowired
private JpaRepository<User, Long> repo;

	@RequestMapping("/all")
	public @ResponseBody List<User> getUsers() {
		return (List<User>) repo.findAll();
	}
	
}
