package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import classes.Product;
import controllers.ProductController;
import services.ProductServices;

import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ProductControllerTest {

    @Mock
    private ProductServices productservices;

    private ProductController productcontroller;

    @Before
    public void setUp() {
        productcontroller = new ProductController(productservices);
    }

    @Test
    public void shouldCreateUser() throws Exception {
        final Product savedproduct = stubServiceToReturnStoredProduct();
        final Product product = new Product();
        Product returnedproduct = productcontroller.createProduct(product);
        // verify product was passed to ProductrService
        verify(productservices, times(1)).save(product);
        assertEquals("Returned user should come from the service", savedproduct, returnedproduct);
    }

    private Product stubServiceToReturnStoredProduct() {
        final Product product = new Product();
        when(productservices.save(any(Product.class))).thenReturn(product);
        return product;
    }

}