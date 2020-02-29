package com.quinta.jpa.jpa;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.quinta.jpa.jpa.entity.User;
import com.quinta.jpa.jpa.service.UserRepository;

@Component
public class UserRepositoryServiceCommandLineRunner implements CommandLineRunner{
	
	private static final Logger log = LoggerFactory.getLogger(UserRepositoryServiceCommandLineRunner.class);
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public void run(String... arg0) throws Exception {
		User user = new User("Jill", "Admin");
		
		// Use save() method for both create and update
		userRepository.save(user);
		log.info("User created: " + user);
		
		// find by id
		Optional<User> userWithIdOne= userRepository.findById(1L);
		log.info("User found by id 1: " + userWithIdOne);
		
		// find by id
		List<User> users= userRepository.findAll();
		log.info("All users: " + users);
		
		
	}
}
