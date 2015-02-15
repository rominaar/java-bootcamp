package classes;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Payment {
	
	@Id
	@GeneratedValue
	@Column(name = "idPayment")
	private Long idPayment;
	
	private String type;
	private int total;
	private Cart cart;
	
	public Payment(){};
	
	public Payment(String type, int total, Cart cart){
		this.setType(type);
		this.setTotal(total);
		this.setCart(cart);
		
	}

	public long getIdPayment() {
		return idPayment;
	}

	public void setIdPayment(long idPayment) {
		this.idPayment = idPayment;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	

}
