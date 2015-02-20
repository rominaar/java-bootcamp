package com.globant.finalproject.models;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface ProductRepository extends CrudRepository<Product, String> {

	//@Query ("SELECT p FROM Product p WHERE p.name = name")
	public Product findByName(String name);

	List<Product> findByCategory(String category);
	
	

}