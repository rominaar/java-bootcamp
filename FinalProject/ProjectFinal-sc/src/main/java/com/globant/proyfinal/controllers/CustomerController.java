package com.globant.proyfinal.controllers;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.globant.proyfinal.services.*;
import com.globant.proyfinal.classes.*;

@RestController
public class CustomerController {

	    private final CustomerServices customerservices;
	    private CustomerConnected customerconnected;
		

	    @Inject
	    public CustomerController(final CustomerServices customerservices) {
	        this.customerservices = customerservices;
	    }

	    @RequestMapping(value = "/customer", method = RequestMethod.POST)
	    public Customer createCustomer(@RequestBody @Valid final Customer customer) {
	        return customerservices.save(customer);
	    }

	 // Login
		@RequestMapping(value = "/login", method = RequestMethod.POST)
		public @ResponseBody Customer login(@RequestParam("user") String user, @RequestParam("password") String password) {
		Customer cl = this.customerservices.login(user, password);
		customerconnected.setCustomer(cl);   //
		return cl;
		}
		
		
		//Registration (new customer)
		@RequestMapping(value = "/registration", method = RequestMethod.POST)
		public @ResponseBody Customer Registration(@RequestParam("idCustomer") int idCustomer, @RequestParam("name") String name, @RequestParam("lastname") String lastname, 
				@RequestParam("dateofbirth") String dateofbirth, @RequestParam("user") String user,	@RequestParam("password") String password) {
		return this.customerservices.registration(idCustomer, name, lastname, dateofbirth, user, password);
		}
	
}
