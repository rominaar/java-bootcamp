package repositories;

import java.util.List;

import classes.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("productRepository")
public interface ProductRepository extends CrudRepository<Product, Long>{

	List<Product> findByCategory(String category);

	List<Product> findByName(String name);
	

}


