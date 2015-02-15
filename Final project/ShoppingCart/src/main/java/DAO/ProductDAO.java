package DAO;

import java.util.List;

import classes.Product;
import repositories.ProductRepository;

public class ProductDAO {
	
	private ProductRepository productrepository;

	public Product getProduct(long idProduct) {
		Product product = productrepository.findOne(idProduct);
		return product;
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
	
	public Product createProduct(String name, double price, String category) {
		return this.productrepository.save(new Product(name, price, category));
		}
}
