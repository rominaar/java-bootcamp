package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import classes.*;
import DAO.*;

@Component
public class CartServImplement implements CartServices{
	
	@Autowired
	private CartDAO cartdao;
	
	@Autowired
	private CustomerDAO customerdao;
	
	@Autowired
	private PaymentDAO paymentdao;
	
	@Autowired
	private ProductPackDAO productpackdao;
	
	@Autowired
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

	public void PrintProductsPack(Customer customer) {
		Cart cart = getCart(customer);
		cart.PrintProductsPack();
		
	}
	
	
}
