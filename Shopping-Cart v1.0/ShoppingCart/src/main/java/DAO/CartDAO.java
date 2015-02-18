package DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import classes.*;
import repositories.CartRepository;

@Component
public class CartDAO {
	
	@Autowired
	private CartRepository cartrepository;
	
	@Autowired
	private CustomerDAO customerdao;

	public Cart save(Cart cart) {
		return cartrepository.save(cart);
	}

	
}