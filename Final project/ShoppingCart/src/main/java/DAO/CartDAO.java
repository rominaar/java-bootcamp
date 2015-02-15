package DAO;

import classes.*;
import repositories.CartRepository;

public class CartDAO {
	
	private CartRepository cartrepository;

	public Cart save(Cart cart) {
		return cartrepository.save(cart);
	}

	
}