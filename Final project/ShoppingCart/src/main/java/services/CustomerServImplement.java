package services;

import org.springframework.beans.factory.annotation.Autowired;

import classes.Customer;
import DAO.CustomerDAO;


public class CustomerServImplement implements CustomerServices {
	
	 @Autowired
	private CustomerDAO customerdao;

	//login
	public Customer login(String user, String password) {
		return customerdao.login(user, password);
	}

	//registration (new customer)
	public Customer registration(String name, String lastname, String dateofbirth, String user, String password) {
		return this.customerdao.registration(name, lastname, dateofbirth, user, password);
	}

	
	
	//public Customer getCustomer(){		return this.getCustomer();}

}
