package repositories;

import classes.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("productPackRepository")
public interface ProductPackRepository extends CrudRepository<ProductPack, Long> {
	
	

}
