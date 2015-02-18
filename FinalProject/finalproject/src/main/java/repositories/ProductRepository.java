package repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import classes.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

	List<Product> findByName(String name);

	List<Product> findByCategory(String category);
	
	Product save (Product product);
}