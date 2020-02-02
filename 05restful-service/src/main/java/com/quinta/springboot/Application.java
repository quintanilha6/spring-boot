package com.quinta.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}
	
	// Only Creates this bean if profile is set to dev
	@Profile("dev")
	@Bean
	public String dummy() {
		return "dummy!";
	}
}