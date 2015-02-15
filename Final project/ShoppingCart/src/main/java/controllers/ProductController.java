package controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import classes.Product;
import services.ProductServices;


public class ProductController {
	
	private ProductServices productServices;
	
	// search product by name
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public @ResponseBody List<Product> getProduct(@RequestParam("searchname") String searchname) {
		return productServices.getProductsByName(searchname);
	}
	
	
	// search products by category
	@RequestMapping(value = "/category/products", method = RequestMethod.GET)
	public @ResponseBody List<Product> getCategoryProducts(@RequestParam("searchcategory") String searchcategory) {
	 return productServices.getProductsByCategory(searchcategory);
		}
	
	
	// get all products
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Product> getProducts() {
	return productServices.getProducts();
	}

}
