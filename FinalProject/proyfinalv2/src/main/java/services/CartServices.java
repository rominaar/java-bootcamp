package services;

import classes.Cart;
import classes.Customer;
import classes.Payment;
import classes.Product;

public interface CartServices {

	public Cart getCart(Customer customer);

	public Payment buyProducts(Customer customer, String type);

	public Cart addProduct(Product product, int quantity, Customer customer);

	public Cart save(Cart cart);
	
	public void createProductPack(Product product, int quantity, Cart cart);
	
	public Payment createPayment(Customer customer, String type, Cart cart);
	
	public void PrintProductsPack(Cart cart);

}
