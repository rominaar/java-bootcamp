package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import classes.*;
import repositories.*;
import services.*;
import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CartServImplementTest {

	    @Mock
	    private CartRepository cartrepository;
	    
	    @Mock
	    private CustomerRepository customerrepository;
	    
	    @Mock
	    private ProductPackRepository productpackrepository;
	    
	    @Mock
	    private ProductRepository productrepository;
	    
	    @Mock
	    private PaymentRepository paymentrepository;

	    private CartServices cartservices;
	    private CustomerServices customerservices;
	    private ProductServices productservices;

	    @Before
	    public void setUp() {
	    	cartservices = new CartServImplement(cartrepository, customerrepository, paymentrepository, productpackrepository, productrepository);
	    }

	    @Test
	    public void shouldSaveNewCart() {
	    	
	    	
	    	final Cart savedCart = stubRepositoryToReturnCartOnSave();
	    	final Cart cart1 = new Cart();
	    	final Cart returnedcart = cartservices.save(cart1);
	        // verify repository was called with Cart
	        verify(cartrepository, times(1)).save(cart1);
	        assertEquals("Returned Customer should come from the repository", savedCart, returnedcart);
	        
	               	
	    }

	    private Cart stubRepositoryToReturnCartOnSave() {
	    	Cart cart = new Cart();
	        when(cartrepository.save(any(Cart.class))).thenReturn(cart);
	        return cart;
	    }

	
	    @Test
	    
	    public void TestMethods(){
	    	
	    	Product p1 = new Product (100, "Tablet Samsung", 3500, "Electronics");
	    	Customer c1 = new Customer (100, "Romina", "Acuña", "24-11-1989", "rominaar", "123456");
	    	
	    	//Cart cart = cartservices.addProduct(p1, 1, c1);
	    	Cart cart2 = new Cart();
	    	ProductPack pp = new ProductPack(p1, 2, cart2);
	    	
	    	pp.toString();
	    	
	    	//cartservices.PrintProductsPack(cart2);
	    	
	    	//Cart cartexpected = cartservices.getCart(c1);
	    	
	    	//assertEquals(cartexpected, cart);
	    	
	    	//cartservices.buyProducts(c1, "cash");
	    	
	    }
}





