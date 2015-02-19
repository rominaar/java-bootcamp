package classes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.google.common.base.Objects;

@Entity
public class ProductPack {
	
	@Id
	@NotNull
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idProductPack", nullable = false, updatable = false)
	private String idProductPack;
	
	@Column(name = "quantity")
	private int quantity;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idProduct")
	private Product product;
	
	@OneToOne(mappedBy = "idCart")
	@JoinColumn(name = "idCart")
	private Cart cart;
	
	@Column(name = "subtotal")
	private double subtotal;

	public ProductPack() {}
	
	public ProductPack( Product product, int quantity, Cart cart){
		this.setProduct(product);
		this.setQuantity(quantity);
		this.setCart(cart);
		
	}

	public String getIdProductPack() {
		return idProductPack;
	}

	public void setIdProductPack(String idProductPack) {
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
	
	@Override
	public String toString() {
		return Objects.toStringHelper(this)
				.add("quantity", quantity)
				.add("product", product)
				.add("subtotal", subtotal)
				.toString();
	}
}
