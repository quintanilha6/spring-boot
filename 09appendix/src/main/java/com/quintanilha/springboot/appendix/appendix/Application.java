package com.quintanilha.springboot.appendix.appendix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
	
	// What are the beans that Spring must manage?
	// What are the dependencies of a bean?
	// Where to search for beans?

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = 
				SpringApplication.run(Application.class, args);
		
		BinarySearchImpl bs = applicationContext.getBean(BinarySearchImpl.class);
		
		int result = bs.binarySearch(new int[] {12, 4, 6}, 3);
		
		System.out.print(result);

	}

}
