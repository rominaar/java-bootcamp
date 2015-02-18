package classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.google.common.base.Objects;

@Entity
public class Customer {
	@Id
	@NotNull
	@Column(name = "idCustomer", nullable = false, updatable = false)
	private String idCustomer;
	
	@NotNull
	@Column(name = "name")
	private String name;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "dateofbirth")
	private String dateofbirth;
	
	@Column(name = "user")
	private String user;
	
	@Column(name = "password")
	private String password;  
	
	@OneToOne(mappedBy = "idCart")
	@JoinColumn(name = "idCart")
	private Cart cart;
	
	public Customer (){};
	
	//Constructor with cart 
		public Customer (final String idCustomer, String name, String lastname, String dateofbirth, String user, String password, Cart cart){
			this.idCustomer = idCustomer;
			this.name = name;
			this.lastname = lastname;
			this.dateofbirth = dateofbirth;
			this.user = user;
			this.password = password;
			this.cart = cart;
		}
		
		//Constructor without cart
		public Customer (final String idCustomer, String name, String lastname, String dateofbirth, String user, String password){
			this.idCustomer = idCustomer;
			this.name = name;
			this.lastname = lastname;
			this.dateofbirth = dateofbirth;
			this.user = user;
			this.password = password;
		}


	public String getIdCustomer() {
		return idCustomer;
		}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	@Override
	public String toString() {
		return Objects.toStringHelper(this)
				.add("id", idCustomer)
				.add("name", name)
				.add("dateofbirth", dateofbirth)
				.add("user", user)
				.add("password", password)
				.add("cart", cart)
				.toString();
	}
}