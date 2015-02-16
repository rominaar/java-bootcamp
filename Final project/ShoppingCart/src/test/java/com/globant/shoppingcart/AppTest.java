package com.globant.shoppingcart;

import classes.*;
import services.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AppTest{
    
	@Before
	public void setUp() throws Exception {
	System.out.println("Start of test");
	}
	
	
	@After
	public void tearDown() throws Exception {
	System.out.println("End of test");
	}
	
	
	@Test
	 
	public void CartTest() {
		
	//Create a shopping cart
	Cart c1 = new Cart();
	CartServImplement cartsi = new CartServImplement();
	 
	Product p1 = new Product(" TV LED 32'' Samsung ", 5000.00, "Electronics");
	Product p2 = new Product(" DVD Player Sony ", 2000.00, "Electronics");
	Product p3 = new Product(" Bedroom set ", 10500.00, "Furniture");
	
	}
	
	/*
	@Test
	
	public void CustomerTest() {
		
		CustomerServImplement customersi= new CustomerServImplement();
    	
		
    	//New customer 
		customersi.registration("Romina", "Acuña", "24-11-1989", "rominaar", "123456");
    	
    	//Login
    	customersi.login("rominaar","123456");	
	}
	
	
	*/
	@Test
	
    public void testApp() {
    	
		CartServImplement cartsi = new CartServImplement();
		CustomerServImplement customersi= new CustomerServImplement();
		
		Product p1 = new Product( 01L, " TV LED 32'' Samsung ", 5000.00, "Electronics");
		Product p2 = new Product(02L, " DVD Player Sony ", 2000.00, "Electronics");
		Product p3 = new Product(03L, " Bedroom set ", 10500.00, "Furniture");
		
		//COMENTARIO ID: (strategy=GenerationType.AUTO)
		
		Customer c1 = new Customer("Romina", "Acuña", "24-11-1989", "rominaar", "123456");
		
    	//insert items to a shopping cart
    	cartsi.addProduct(p1.getIdProduct(), 1, c1);
    	cartsi.addProduct(p2.getIdProduct(), 1, c1);
    	cartsi.addProduct(p3.getIdProduct(), 1, c1);
    	
    	
    	Cart cart = cartsi.getCart(c1);
    	
    	cartsi.PrintProductsPack(c1);
    	
    	cartsi.buyProducts(c1, "cash");
    			
    }
}
