package com.globant.proyfinal.services;

import com.globant.proyfinal.classes.*;

public interface CartServices {

	public Cart getCart(Customer customer);

	public Payment buyProducts(Customer customer, String type);

	public Cart addProduct(Product product, int quantity, Customer customer);

	public Cart save(Cart cart);
	
	public void createProductPack(Product product, int quantity, Cart cart);
	
	public Payment createPayment(Customer customer, String type, Cart cart);
	
	public void PrintProductsPack(Cart cart);

}
