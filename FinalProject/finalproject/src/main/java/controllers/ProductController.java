package controllers;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import classes.Product;
import services.ProductServices;

//import services.ProductServices;

@RestController
public class ProductController {
	
	    private final ProductServices productServices;

	    @Inject
	    public ProductController(final ProductServices productServices) {
	        this.productServices = productServices;
	    }
	    
	    
	    @RequestMapping(value = "/user", method = RequestMethod.POST)
	    public Product createProduct(@RequestBody @Valid final Product product) {
	        return productServices.save(product);
	    }

	
}
