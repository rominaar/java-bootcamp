package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import classes.Product;
import DAO.ProductDAO;

@Component
public class ProductServImplement implements ProductServices{
	
	@Autowired
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
