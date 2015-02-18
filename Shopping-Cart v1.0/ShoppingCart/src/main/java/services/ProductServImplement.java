package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import classes.Product;
import DAO.ProductDAO;

@Service
@Configurable
public class ProductServImplement implements ProductServices{
	
	@Autowired
	private ProductDAO productdao;

	@Override
	public List<Product> getProductsByName(String name) {
		return productdao.getProductsByName(name);
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		return productdao.getProductsByCategory(category);
	}

	@Override
	public List<Product> getProducts() {
		return productdao.getProducts();
	}

	
}
