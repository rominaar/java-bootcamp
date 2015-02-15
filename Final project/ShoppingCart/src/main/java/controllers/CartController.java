package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import services.CartServices;
import classes.*;


public class CartController {
	
	private CartServices cartservices;
	private CustomerConnected customerconnected;
	//private Product product;
	//private ProductPack productpack;
		
	
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
		//ProductPack productpack = new ProductPack(quantity, product);
		return cartservices.addProduct(idProduct, quantity, customerconnected.getCustomer());
	}
	

}
