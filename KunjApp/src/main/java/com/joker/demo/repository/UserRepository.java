package com.joker.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joker.demo.dto.User;

/**
 * Purpose : repository for CRUD operation 
 *  
 * @author Nikunj Balar
 *
 */
public interface UserRepository extends JpaRepository<User, Integer>{

	public User findByUserName(String email);

}
