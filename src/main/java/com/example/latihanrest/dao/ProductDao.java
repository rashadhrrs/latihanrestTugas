package com.example.latihanrest.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.latihanrest.model.Product;

public interface ProductDao extends CrudRepository<Product, Long> {
	
	@Query("select p from Product p where p.brand.id = :brandId")
	public Iterable<Product> findByBrandId(@Param("brandId") Long brandId);
}
