package com.globant.proyfinal.services;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.globant.proyfinal.classes.*;
import com.globant.proyfinal.repositories.*;


@Service
public class CartServImplement implements CartServices {

    private final CartRepository cartrepository;
    private final CustomerRepository customerrepository;
    private final PaymentRepository paymentrepository;
    private final ProductPackRepository productpackrepository;
 
    
    @Inject
    public CartServImplement(final CartRepository cartrepository, final CustomerRepository customerrepository,
    						final PaymentRepository paymentrepository, final ProductPackRepository productpackrepository) {
        this.cartrepository = cartrepository;
        this.customerrepository = customerrepository;
        this.paymentrepository = paymentrepository;
        this.productpackrepository = productpackrepository;
        
        
    }
   
    

    @Transactional
    public Cart save(final Cart cart) {
        return cartrepository.save(cart);
    }

    
    @Transactional
	public Payment buyProducts(Customer customer, String type) {
		//attached values 
    	customer = customerrepository.findOne(customer.getIdCustomer());				
		return createPayment(customer, type, customer.getCart());		
		
	}
    
    @Override
	@Transactional
	public Cart addProduct(Product product, int quantity, Customer customer) {
		Cart cart = getCart(customer);
		createProductPack(product, quantity, cart);
		cart.calculateTotal();
		return cartrepository.save(cart);
		}

	public void PrintProductsPack(Cart cart) {
		//Cart cart = getCart(customer);
		cart.PrintProductsPack();
		
	}

	public Cart getCart(Customer customer) {
	
		Customer c1 = customerrepository.findOne(customer.getIdCustomer());
		if (c1 == null){System.out.println("Customer not exist");} 
		
			return c1.getCart();
		}
	
	
	public Payment createPayment(Customer customer, String type, Cart cart) {
		double total = cart.getTotal();
		//calculate discount
		if (type == "cash") { total = 0.5 * total; }
		return this.paymentrepository.save(new Payment(customer, type, total, cart));
	}
	
	
	public void createProductPack(Product product, int quantity, Cart cart) {
		this.productpackrepository.save(new ProductPack(product, quantity, cart));
	}





}
