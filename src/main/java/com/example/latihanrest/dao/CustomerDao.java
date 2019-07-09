package com.example.latihanrest.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.latihanrest.model.Customer;

public interface CustomerDao extends CrudRepository<Customer, Long> {
	
	

}
