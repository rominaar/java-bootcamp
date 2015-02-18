package classes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.google.common.base.Objects;



@Entity
public class Cart {
	@Id
	@NotNull
	@Column(name = "idCart", nullable = false, updatable = false)
	private String idCart;
	

	@Column(name = "total")
	private double total;
	
	@OneToMany(mappedBy = "Cart")
	private List<ProductPack> productpack;
	
	 @OneToOne(mappedBy = "Cart")
	private Customer customer;
		
	public Cart(){}
	
	public String getIdCart() {
		return idCart;
	}

	public void setIdCart(String idCart) {
		this.idCart = idCart;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<ProductPack> getProductpack() {
		return productpack;
	}

	public void setProductpack(List<ProductPack> productpack) {
		this.productpack = productpack;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public void calculateTotal() {
	double total = 0;
	for (ProductPack pp : productpack) {
		total += pp.getSubtotal();
		}
	setTotal(total);
	}


	public void PrintProductsPack() {
	for (ProductPack pp : productpack) {
		System.out.println("PRODUCT: " + pp.getProduct().getName() + "QUANTITY: "+ pp.getQuantity()
				+ "PRICE: " + pp.getSubtotal());
		}
	}
	
	@Override
	public String toString() {
		return Objects.toStringHelper(this)
				.add("total", total)
				.add("productPack", productpack)
				.add("customer", customer)
				.toString();
	}

	
	
}
