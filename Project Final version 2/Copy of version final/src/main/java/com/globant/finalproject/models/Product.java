package com.globant.finalproject.models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;




@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotNull
	private String name;
	
	@NotNull
	private String price;
	
	@NotNull
	private String category;

	public Product() {}
	
	public Product(long id) { 
	    this.id = id;
	  }
	
	public Product(String name, String price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
		}
	


	public long getId() {
		return id;
		}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
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
	
	
	
	
}