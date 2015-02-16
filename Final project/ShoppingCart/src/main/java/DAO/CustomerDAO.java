package DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import classes.*;
import repositories.CustomerRepository;

@Component
public class CustomerDAO {
	
	@Autowired
	private CustomerRepository customerrepository;
	
	/*private static CustomerDAO customerdao = null;
	
	 public CustomerDAO(){}
	
	public static CustomerDAO getInstance() {
		if (customerdao == null) {
			customerdao = new CustomerDAO();
		}
		return customerdao;
	}*/
	

	public Customer login(String user, String password) {
		Customer customer = this.customerrepository.findByUser(user);
		if (customer == null) 
			{System.out.println("Invalid username");}
		else 
			if (customer.getPassword() != password) 
				{System.out.println("Invalid password");}	
		return customer;
	}

	
	public Customer registration(String name, String lastname, String dateofbirth, String user, String password) {
		Cart cart = new Cart();	
		Customer customer = new Customer(name, lastname, dateofbirth, user, password, cart);
		return this.customerrepository.save(customer);
	}


	public Customer getCustomer(Customer customer) {
		return this.customerrepository.findByUser(customer.getUsername());
	}

	
}

