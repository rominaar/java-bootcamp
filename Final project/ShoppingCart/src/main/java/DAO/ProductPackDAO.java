package DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import classes.*;
import repositories.ProductPackRepository;

@Component
public class ProductPackDAO {
	
	@Autowired
	private ProductPackRepository productpackrepository;

	public void createProductPack(Product product, int quantity, Cart cart) {
		this.productpackrepository.save(new ProductPack(product, quantity, cart));
	}
		

}
