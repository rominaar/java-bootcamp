package com.globant.shoppingcart;

import static org.junit.Assert.*;
import repositories.*;
import classes.*;
import repositories.ProductRepository;
import services.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.repository.CrudRepository;


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
	
	//Assert.assertEquals("NAME:  TV LED 32'' Samsung PRICE: 5000.0CATEGORY: Electronics", p1.ShowProduct() );
	
	
	
	}
	
@Test
	
	public void CustomerTest() {
		
		CustomerServImplement customersi= new CustomerServImplement();
    	
		
    	//New customer 
		customersi.registration("Romina", "Acu�a", "24-11-1989", "rominaar", "123456");
    	
    	//Login
    	customersi.login("rominaar","123456");	
	}
}
	
	
	

	/*
    
    @Test
	public void Application1 () {
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("/context.xml");
		 
		 Customer cu1 = context.getBean("customer", Customer.class);
	}
}
	
	
	
	
}
	
	
	@Test
	
	public void CustomerTest() {
		
		CustomerServImplement customersi= new CustomerServImplement();
    	
		
    	//New customer 
		customersi.registration("Romina", "Acu�a", "24-11-1989", "rominaar", "123456");
    	
    	//Login
    	customersi.login("rominaar","123456");	
	}
	
	
}
	
	
	@Test
	
    public void testApp() {
    	
		CartServImplement cartsi = new CartServImplement();
		CustomerServImplement customersi= new CustomerServImplement();
		
		Product p1 = new Product( 01L, " TV LED 32'' Samsung ", 5000.00, "Electronics");
		Product p2 = new Product(02L, " DVD Player Sony ", 2000.00, "Electronics");
		Product p3 = new Product(03L, " Bedroom set ", 10500.00, "Furniture");
		
		//COMENTARIO ID: (strategy=GenerationType.AUTO)
		
		Customer c1 = new Customer("Romina", "Acu�a", "24-11-1989", "rominaar", "123456");
		
    	//insert items to a shopping cart
    	cartsi.addProduct(p1.getIdProduct(), 1, c1);
    	cartsi.addProduct(p2.getIdProduct(), 1, c1);
    	cartsi.addProduct(p3.getIdProduct(), 1, c1);
    	
    	
    	Cart cart = cartsi.getCart(c1);
    	
    	cartsi.PrintProductsPack(c1);
    	
    	cartsi.buyProducts(c1, "cash");
    			
    } 
    
    @Test
	public void Application(){
		 
	    CrudRepository repository;
	    
	        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	        repository = context.getBean(ProductRepository.class);
	 
	      
	        createProduct(" TV LED 32'' Samsung ", 5000.00, "Electronics", repository);
	 
	        ((AbstractApplicationContext) context).close();
	 
	    }
	 
	    private static void createProduct(String name, double price, String category, CrudRepository repository){
	 
	        Product pro = new Product (name, price, category);
	        repository.save(pro);
	    }
	 
    
    
	

	
    *
    *
    */

