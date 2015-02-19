package services;

import java.util.List;

import classes.Product;

public interface ProductServices {

    Product save(Product product);
    
    public List<Product> getProductsByName(String searchname);
	
	public List<Product> getProductsByCategory(String searchcategory);

	public List<Product> getProducts();
	
	public Product createProduct(int idproduct, String name, double price, String category);

}
