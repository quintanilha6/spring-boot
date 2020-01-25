package com.quinta.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService{
		public String retrieveWelcomeMessage() {
			return "Some message";
		}
}
