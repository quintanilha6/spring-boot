package com.quintanilha.springboot.webapp.webapp.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	public boolean validateUser(String _userId, String _pw) {
		return _userId.equalsIgnoreCase("quinta") 
				&& _pw.equalsIgnoreCase("quinta");
	}
}
