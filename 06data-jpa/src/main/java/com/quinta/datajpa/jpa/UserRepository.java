package com.quinta.datajpa.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{
	
	// Pattern of "findBy<variable>...
	// Examples:
	// findByNameIgnoreCase
	// findByLastNameOrderByFirstNameAsc (ascending)
	// findFirst10ByLastName
	// findTop3ByLastName
	List<User> findByRole(String role);
	
}
