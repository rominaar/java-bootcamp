package services;

import classes.Customer;

public interface CustomerServices {

	public Customer login(String user, String password);

	public Customer registration(String name, String lastname, String dateofbirth, String user, String password);
	
	//public Customer getCustomer();
	
}