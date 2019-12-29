package com.quintanilha.springboot.webapp.webapp.logincontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	// Model - used to pass data from Controller to view (j s p)
	
	@RequestMapping("/login")
	public String loginMessage(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		return "login";
	}

}
