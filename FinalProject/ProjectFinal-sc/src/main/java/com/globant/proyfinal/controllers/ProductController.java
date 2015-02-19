package com.globant.proyfinal.controllers;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.globant.proyfinal.services.ProductServices;

import com.globant.proyfinal.classes.*;

//import services.ProductServices;

@RestController
public class ProductController {
	
	    private final ProductServices productServices;

	    @Inject
	    public ProductController(final ProductServices productServices) {
	        this.productServices = productServices;
	    }
	    
	    
	    @RequestMapping(value = "/product", method = RequestMethod.POST)
	    public Product createProduct(@RequestBody @Valid final Product product) {
	        return productServices.save(product);
	    }

	
}
