package com.globant.proyfinal.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.globant.proyfinal.classes.*;

public interface ProductRepository extends CrudRepository<Product, String> {

	List<Product> findByName(String name);

	List<Product> findByCategory(String category);
	
	Product save (Product product);

	@Query("SELECT p FROM Product p WHERE p.idCustomer = :id")
	public Product findOne(@Param("id") int idProduct);


}