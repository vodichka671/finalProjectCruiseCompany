package com.mag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {
	@RequestMapping("/cruise")
	public String showJorneys(Model model) {
		
		return"cruisepage";
	} 
}
