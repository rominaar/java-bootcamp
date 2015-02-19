package com.globant.proyfinal.controllers;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.globant.proyfinal.services.CartServices;
import com.globant.proyfinal.classes.*;


@RestController
public class CartController {

	    private final CartServices cartservices;
	    private CustomerConnected customerconnected;
		

	    @Inject
	    public CartController(final CartServices cartservices) {
	        this.cartservices = cartservices;
	    }
	    
	 // get shopping cart
		@RequestMapping(method = RequestMethod.GET)
		public @ResponseBody Cart getShoppingCart() {
			
			return cartservices.getCart(customerconnected.getCustomer());
		}
		
		
		// buy products
		@RequestMapping(value = "/buy", method = RequestMethod.POST)
		public @ResponseBody Payment buyProducts(@RequestParam("type") String type) {
			
			return cartservices.buyProducts(customerconnected.getCustomer(), type);
		}
		
		
		// add product to shopping cart
		@RequestMapping(value = "/add-product", method = RequestMethod.POST)
		public @ResponseBody Cart addProduct(@RequestParam("Product") Product product, @RequestParam("quantity") int quantity) {
			
			return cartservices.addProduct(product, quantity, customerconnected.getCustomer());
		}
	
		@RequestMapping(value = "/cart", method = RequestMethod.POST)
	    public Cart createCart(@RequestBody @Valid final Cart cart) {
	        return cartservices.save(cart);
	    }

	

}