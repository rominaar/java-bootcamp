package services;

import java.util.List;

import classes.Product;

public interface ProductServices {

	public List<Product> getProductsByName(String searchname);
	
	public List<Product> getProductsByCategory(String searchcategory);

	public List<Product> getProducts();
	
}
