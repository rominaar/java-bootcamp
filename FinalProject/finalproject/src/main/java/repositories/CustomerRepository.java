package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import classes.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

	Customer findByUser(String user);
	
	Customer save (Customer customer);

	Customer findByName(String user);
	
	
}