package com.ehelp.controller;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;

import com.ehelp.entity.User;
import com.ehelp.service.ServiceClass;

@Controller
public class ControllerClass {

	@Autowired
	private ServiceClass service;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/User_register")
	public String UserRegister() {
		return "registrationform";
	}


	@PostMapping("/save")
	public String addUser(@ModelAttribute User u) {
		service.save(u);
		return "redirect:/home";
	}


}


