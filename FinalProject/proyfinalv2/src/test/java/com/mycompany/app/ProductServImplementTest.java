package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import classes.Product;
import repositories.ProductRepository;
import services.ProductServImplement;
import services.ProductServices;
import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ProductServImplementTest {

	    @Mock
	    private ProductRepository productrepository;

	    private ProductServices productservices;

	    @Before
	    public void setUp() {
	        productservices = new ProductServImplement(productrepository);
	    }

	    @Test
	    public void shouldSaveNewProduct() {
	        final Product savedproduct = stubRepositoryToReturnProductOnSave();
	        final Product product = productservices.createProduct(1, " TV LED 32'' Samsung ", 5000.00, "Electronics");
	        final Product returnedProduct = productservices.save(product);
	        // verify repository was called with user
	        verify(productrepository, times(1)).save(product);
	        assertEquals("Returned product should come from the repository", savedproduct, returnedProduct);
	        
	        String expectedstring = "NAME:  TV LED 32'' Samsung PRICE: 5000.0CATEGORY: Electronics" ;
	    	assertEquals(expectedstring, product.ShowProduct() );
	        
	    	/*
	    	//verify search
	    	Product p2 = productservices.createProduct(2, " DVD Player Sony ", 2000.00, "Electronics");
	    	assertEquals((productservices.getProductsByName(" DVD Player Sony ")).contains(p2), true);;
	    	
	        */
	    	
	    	
	    }

	    private Product stubRepositoryToReturnProductOnSave() {
	    	Product product = new Product(1, " TV LED 32'' Samsung ", 5000.00, "Electronics");
	        when(productrepository.save(any(Product.class))).thenReturn(product);
	        return product;
	    }

	
}
