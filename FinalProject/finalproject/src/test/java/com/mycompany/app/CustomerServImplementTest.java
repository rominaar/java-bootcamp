package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import classes.Customer;
import repositories.CustomerRepository;
import services.CustomerServImplement;
import services.CustomerServices;
import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServImplementTest {

	    @Mock
	    private CustomerRepository customerrepository;

	    private CustomerServices customerservices;

	    @Before
	    public void setUp() {
	    	customerservices = new CustomerServImplement(customerrepository);
	    }

	    @Test
	    public void shouldSaveNewCustomer() {
	        final Customer savedCustomer = stubRepositoryToReturnCustomerOnSave();
	        //registration
	        final Customer customer = customerservices.registration("1", "Romina", "Acuña", "24-11-1989", "rominaar", "123456");
	        final Customer returnedCustomer = customerservices.save(customer);
	        // verify repository was called with Customer
	        verify(customerrepository, times(1)).save(customer);
	        assertEquals("Returned Customer should come from the repository", savedCustomer, returnedCustomer);
	        
	        
	      
	    	//Login			     
	        customerservices.login("rominaar","123456");	
	        	
	    }

	    private Customer stubRepositoryToReturnCustomerOnSave() {
	    	Customer customer = new Customer("1", "Romina", "Acuña", "24-11-1989", "rominaar", "123456");
	        when(customerrepository.save(any(Customer.class))).thenReturn(customer);
	        return customer;
	    }

	
}

