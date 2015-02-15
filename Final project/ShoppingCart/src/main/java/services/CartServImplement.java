package services;

import classes.Cart;
import classes.Customer;
import classes.Payment;
import DAO.*;

public class CartServImplement implements CartServices{
	
	private CartDAO cartdao;
	private CustomerDAO customerdao;
	private PaymentDAO paymentdao;


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
		// TODO Auto-generated method stub
		return null;
	}

	public Payment saveCart(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
