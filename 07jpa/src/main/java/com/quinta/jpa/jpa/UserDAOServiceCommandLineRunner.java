package com.quinta.jpa.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.quinta.jpa.jpa.entity.User;
import com.quinta.jpa.jpa.service.UserDAOService;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner{
	
	private static final Logger log = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);
	
	@Autowired
	UserDAOService userDAOService;
	
	@Override
	public void run(String... arg0) throws Exception {
		User user = new User("Jack", "Admin");
		long inserted = userDAOService.insert(user);
		
		log.info("User created: " + user);
		
	}
}
