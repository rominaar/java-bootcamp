package DAO;

import classes.*;
import repositories.ProductPackRepository;

public class ProductPackDAO {
	
	private ProductPackRepository productpackrepository;

	public void createProductPack(Product product, int quantity, Cart cart) {
		this.productpackrepository.save(new ProductPack(product, quantity, cart));
	}
		

}
