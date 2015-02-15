package classes;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class ProductPack {
	
	@Id
	@GeneratedValue
	@Column(name = "idProductPack")
	private Long idProductPack;
	
	private int quantity;
	private Product product;
	private Cart cart;
	private double subtotal;
	
	public ProductPack(){};
	
	public ProductPack(int quantity, Product product){
		this.setQuantity(quantity);
		this.setProduct(product);
		
	}

	public long getIdProductPack() {
		return idProductPack;
	}

	public void setIdProductPack(long idProductPack) {
		this.idProductPack = idProductPack;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
	//calculate subtotal = quantity * (individual) price
	public void CalculateSubtotal(){
		this.subtotal = quantity * (product.getPrice());
	}
		

}
