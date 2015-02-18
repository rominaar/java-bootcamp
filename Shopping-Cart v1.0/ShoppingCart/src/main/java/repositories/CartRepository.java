package repositories;

import classes.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("cartRepository")
public interface CartRepository extends CrudRepository<Cart, Long>{

}
