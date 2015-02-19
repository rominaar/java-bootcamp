package com.globant.proyfinal.services;

import java.util.List;

import com.globant.proyfinal.classes.*;

public interface ProductServices {

    Product save(Product product);
    
    public List<Product> getProductsByName(String searchname);
	
	public List<Product> getProductsByCategory(String searchcategory);

	public List<Product> getProducts();
	
	public Product createProduct(int idproduct, String name, double price, String category);

}
