package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import services.CartServices;
import classes.*;

@Component
public class CartController {
	
	@Autowired
	private CartServices cartservices;
	
	@Autowired
	private CustomerConnected customerconnected;
	
		
	
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
	public @ResponseBody Cart addProduct(@RequestParam("idProduct") long idProduct, @RequestParam("quantity") int quantity) {
		
		return cartservices.addProduct(idProduct, quantity, customerconnected.getCustomer());
	}
	

}
