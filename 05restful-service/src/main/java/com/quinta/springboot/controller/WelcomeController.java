package com.quinta.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quinta.springboot.configuration.BasicConfiguration;

@RestController
public class WelcomeController {
	
	@Value("${welcome.message}")
	private String welcomeMessage;
	
	@Autowired
	private BasicConfiguration config;
	
	/***********
	*	GETS   *
	***********/
	@GetMapping("/welcome")
	public String retrieveWelcomeMessage() {
		return welcomeMessage;
	}
	
	@GetMapping("/dynamic-configuration")
	public Map dynamicConfiguration() {
		Map map = new HashMap();
		map.put("message", config.getMessage());
		map.put("number", config.getNumber());
		map.put("value", config.isValue());
		
		return map;
	}
}