package com.quintanilha.springboot.webapp.webapp.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quintanilha.springboot.webapp.webapp.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer>{
	List<Todo> findByUser(String user); 
}
