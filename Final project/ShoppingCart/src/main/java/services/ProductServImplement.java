package services;

import java.util.List;
import classes.Product;
import DAO.ProductDAO;

public class ProductServImplement implements ProductServices{
	
	private ProductDAO productdao;

	public List<Product> getProductsByName(String name) {
		return productdao.getProductsByName(name);
	}

	public List<Product> getProductsByCategory(String category) {
		return productdao.getProductsByCategory(category);
	}

	public List<Product> getProducts() {
		return productdao.getProducts();
	}

	
}
