package controllers;

import classes.Customer;
import classes.CustomerConnected;
import services.CustomerServices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;

public class CustomerController {
	
	private CustomerServices customerservices;
	private CustomerConnected customerconnected;
	
	// Login
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody Customer login(@RequestParam("user") String user, @RequestParam("password") String password) {
	Customer cl = this.customerservices.login(user, password);
	customerconnected.setCustomer(cl);   //
	return cl;
	}
	
	
	//Registration (new customer)
	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public @ResponseBody Customer Registration(@RequestParam("name") String name, @RequestParam("lastname") String lastname, 
			@RequestParam("dateofbirth") String dateofbirth, @RequestParam("user") String user,	@RequestParam("password") String password) {
	return this.customerservices.registration(name, lastname, dateofbirth, user, password);
	}
	
	
	//
	

}
