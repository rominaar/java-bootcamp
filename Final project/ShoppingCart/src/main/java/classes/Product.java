package classes;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idProduct")
	private Long idProduct;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "category")
	private String category;
	
	public Product(){}
	
	public Product(Long idproduct, String name, double price, String category) {
		this.idProduct = idproduct;
		this.name = name;
		this.price = price;
		this.category = category;
		}
	
	public Product(String name, double price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
		}
	

	public long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(long idProduct) {
		this.idProduct = idProduct;
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
	
	public void ShowProduct(){
		System.out.println("NAME: " + name + "PRICE: " + price + "CATEGORY: " + category);
	}
	

}
