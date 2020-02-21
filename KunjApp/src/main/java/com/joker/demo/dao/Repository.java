package com.joker.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.joker.demo.dto.User;

public interface Repository extends CrudRepository<User	, Integer>{

}
