package com.globant.shoppingcart;

import classes.*;
import services.*;
import DAO.*;
import static org.junit.Assert.*;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest extends TestCase {
    
	@Before
	public void setUp() throws Exception {
	System.out.println("Start of test");
	}
	
	
	@After
	public void tearDown() throws Exception {
	System.out.println("End of test");
	}
	
	
	@Test
	
    
    public void testApp() {
    	
    	//Create a shopping cart
    	Cart c1 = new Cart();
    	CartServImplement cartsi = new CartServImplement();
    	 
    	Product p1 = new Product(" TV LED 32'' Samsung ", 5000.00, "Electronics");
    	Product p2 = new Product(" DVD Player Sony ", 2000.00, "Electronics");
    	Product p3 = new Product(" Bedroom set ", 10500.00, "Furniture");
    	
    	CustomerServImplement customersi= new CustomerServImplement();
    	
    	//New customer
    	
    	customersi.registration("Romina", "Acuña", "24-11-1989", "rominaar", "123456");
    	
    	//Login
    	customersi.login("rominaar","123456");
    	
    	
    	//insert items to a shopping cart
    	cartsi.addProduct(0, 1, customersi.getCustomer());
    	cartsi.addProduct(1, 1, customersi.getCustomer());
    	cartsi.addProduct(2, 1, customersi.getCustomer());
    	
    	Customer customer = customersi.getCustomer();
    	Cart cart = cartsi.getCart(customer);
    	
    	cartsi.PrintProductsPack(customer);
    	
    	cartsi.buyProducts(customer, "cash");
    			
    }
}

