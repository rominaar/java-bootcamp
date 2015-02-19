package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import classes.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

	Customer findByUser(String user);
	
	Customer save (Customer customer);

	Customer findByName(String user);

	 @Query("SELECT c FROM Customer c WHERE c.idCustomer = :id")
	public Customer findOne(@Param("id") int idCustomer);

	
	
}