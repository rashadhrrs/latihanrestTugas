package com.example.latihanrest.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.latihanrest.model.Person;

public interface PersonDao extends CrudRepository<Person, Long> {
	
	

}
