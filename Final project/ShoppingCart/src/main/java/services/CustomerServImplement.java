package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import classes.Customer;
import DAO.CustomerDAO;

@Service
@Configurable
public class CustomerServImplement implements CustomerServices {
	
	 @Autowired
	private CustomerDAO customerdao;

	//login
	 @Override
	public Customer login(String user, String password) {
		return customerdao.login(user, password);
	}

	//registration (new customer)
	 @Override
	public Customer registration(String name, String lastname, String dateofbirth, String user, String password) {
		return this.customerdao.registration(name, lastname, dateofbirth, user, password);
	}

	
	
	//public Customer getCustomer(){		return this.getCustomer();}

}
