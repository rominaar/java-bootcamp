package services;

import javax.inject.Inject;

import repositories.CustomerRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import classes.Cart;
import classes.Customer;

@Service
public class CustomerServImplement implements CustomerServices{

    private final CustomerRepository customerrepository;

    @Inject
    public CustomerServImplement(final CustomerRepository customerrepository) {
        this.customerrepository = customerrepository;
    }

    @Transactional
    public Customer save(final Customer customer) {
        return customerrepository.save(customer);
      }
    
    
    public Customer login(String user, String password) {
		Customer customer = this.customerrepository.findByUser(user);
		if (customer == null) 
			{System.out.println("Invalid username");}
		else 
			if (customer.getPassword() != password) 
				{System.out.println("Invalid password");}
		return customer;
	}

	
	public Customer registration(int idCustomer, String name, String lastname, String dateofbirth, String user, String password) {
		Cart cart = new Cart();	
		Customer customer = new Customer(idCustomer, name, lastname, dateofbirth, user, password, cart);
		System.out.println("New registration: " + customerrepository.save(customer).getName());
		return this.customerrepository.save(customer);
	}

	

}
