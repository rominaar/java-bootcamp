package classes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Cart {
	
	@Id
	@GeneratedValue
	@Column(name = "idCart")
	private Long idCart;
	
	private double total;
	private List<ProductPack> productpack;
	private Customer customer;
		
	public Cart(){}
	

	public long getIdCart() {
			return idCart;
		}

	public void setIdCart(long idCart) {
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
		};

}
