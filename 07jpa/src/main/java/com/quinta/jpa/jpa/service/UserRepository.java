package com.quinta.jpa.jpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quinta.jpa.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
