package services;

import classes.Cart;
import classes.Customer;
import classes.Payment;

public interface CartServices {

	public Cart getCart(Customer customer);

	public Payment buyProducts(Customer customer, String type);

	public Cart addProduct(long idProduct, int quantity, Customer customer);
	
	public Payment saveCart(Customer customer);

}
