package com.globant.proyfinal.services;

import com.globant.proyfinal.classes.*;

public interface CustomerServices {
	
	Customer save(Customer customer);
	
	public Customer login(String user, String password);

	public Customer registration(int idCustomer, String name, String lastname, String dateofbirth, String user, String password);
	
	
}
