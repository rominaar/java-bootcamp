package DAO;

import classes.*;
import repositories.CustomerRepository;


public class CustomerDAO {
	
	private CustomerRepository customerrepository;

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

