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
	private double total;
	private Cart cart;
	private Customer customer;
	
	public Payment(){};
	
	public Payment(Customer customer, String type, double total, Cart cart){
		this.setCustomer(customer);
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

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	

}
