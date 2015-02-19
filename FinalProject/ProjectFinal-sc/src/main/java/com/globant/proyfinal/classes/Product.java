package com.globant.proyfinal.classes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


import com.google.common.base.Objects;

@Entity
public class Product {
	@Id
	@NotNull
	@Column(name = "idProduct", nullable = false, updatable = false)
	private int idProduct;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "category")
	private String category;

	public Product() {}
	
	public Product(int idproduct, String name, double price, String category) {
		this.idProduct = idproduct;
		this.name = name;
		this.price = price;
		this.category = category;
		}
	


	public int getIdProduct() {
		return idProduct;
		}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public String ShowProduct(){
		return ("NAME: " + name + "PRICE: " + price + "CATEGORY: " + category);
	}
	
	
	
	@Override
	public String toString() {
		return Objects.toStringHelper(this)
				.add("name", name)
				.add("price", price)
				.add("category", category)
				.toString();
	}
}