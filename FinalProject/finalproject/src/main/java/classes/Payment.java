package classes;
	

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;


@Entity
public class Payment {
	@Id
	@NotNull
	@Column(name = "idPayment", nullable = false, updatable = false)
	private String idPayment;
	
	@NotNull
	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "type")
	private String type;
	
	@Column(name = "total")
	private double total;
	
	@OneToOne(mappedBy = "idCart")
	@JoinColumn(name = "idCart")
	private Cart cart;
	
	@Column(name = "customer")
	private Customer customer;
	
	public Payment() {}
	
	public Payment(final String idPayment, Customer customer, String type, double total, Cart cart){
		this.idPayment = idPayment;
		this.setCustomer(customer);
		this.setType(type);
		this.setTotal(total);
		this.setCart(cart);
		
	}
	
	public String getIdPayment() {
		return idPayment;
	}

	public void setIdPayment(String idPayment) {
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
