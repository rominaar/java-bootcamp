package repositories;

import java.util.List;

import classes.Customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public interface CustomerRepository extends CrudRepository<Customer, Long> {
	 
	Customer findByUser(String user);
	 
	List<Customer> findByName(String Name);
    
 
}