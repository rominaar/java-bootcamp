package com.globant.proyfinal.services;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.globant.proyfinal.classes.*;
import com.globant.proyfinal.repositories.*;

@Service
public class ProductServImplement implements ProductServices {

    private final ProductRepository productrepository;

    @Inject
    public ProductServImplement(final ProductRepository productrepository) {
        this.productrepository = productrepository;
    }

    @Transactional
    public Product save(final Product product) {
        return productrepository.save(product);
    }
    
    public Product getProduct(String idProduct) {
		Product result = new Product();
		result = productrepository.findOne(idProduct);
		return result;
		}

	public List<Product> getProductsByCategory(String category) {
		return productrepository.findByCategory(category);
	}

	public List<Product> getProductsByName(String name) {
		return productrepository.findByName(name);
	}

	public List<Product> getProducts() {
		return (List<Product>) productrepository.findAll();
	}
	
	public Product createProduct(int idproduct, String name, double price, String category) {
		return this.productrepository.save(new Product(idproduct, name, price, category));
		}

}