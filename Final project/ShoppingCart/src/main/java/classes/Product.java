package classes;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Product {
	
	@Id
	@GeneratedValue
	@Column(name = "idProduct")
	private Long idProduct;
	
	private String name;
	private int price;
	private String category;
	
	public Product(){}
	
	public Product(String name, int price, String category) {
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	};
	

}
