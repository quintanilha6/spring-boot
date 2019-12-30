package com.quintanilha.springboot.webapp.webapp.logincontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.quintanilha.springboot.webapp.webapp.service.LoginService;

@Controller
public class LoginController {
	// Model - used to pass data from Controller to view (j s p)
	
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/login", method= RequestMethod.GET)
	public String showLoginMessage(ModelMap model) {
		return "login";
	}
	
	@RequestMapping(value="/login", method= RequestMethod.POST)
	public String showWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		boolean isValidUser = service.validateUser(name, password);
		if (!isValidUser) {
			model.put("errorMessage", "Invalid credentials!");
			return "login";
		}
			
		model.put("name", name);
		model.put("password", password);
		return "welcome";
	}

}
