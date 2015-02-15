package services;

import classes.*;
import DAO.*;

public class CartServImplement implements CartServices{
	
	private CartDAO cartdao;
	private CustomerDAO customerdao;
	private PaymentDAO paymentdao;
	private ProductPackDAO productpackdao;
	private ProductDAO productdao;


	//get cart by user
	public Cart getCart(Customer customer) {
		return customerdao.getCustomer(customer).getCart();
	}

	public Payment buyProducts(Customer customer, String type) {
		//attached values 
		customer = customerdao.getCustomer(customer);
		Payment payment = paymentdao.createPayment(customer, type, customer.getCart());
		return payment;
	}

	public Cart addProduct(long idProduct, int quantity, Customer customer) {
		Cart cart = getCart(customer);
		Product product = productdao.getProduct(idProduct);
		productpackdao.createProductPack(product, quantity, cart);
		cart.calculateTotal();
		return cartdao.save(cart);
}
}
