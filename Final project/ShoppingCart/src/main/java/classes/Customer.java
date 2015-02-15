package classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "user")

public class Customer {
	
	@Id
	@GeneratedValue
	@Column(name = "idUser")
	private Long idCustomer;
		
	
	@Column(name = "lame")
	private String name;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "dateofbirth")
	private String dateofbirth;
	
	@Column(name = "username")
	private String user;
	
	@Column(name = "password")
	private String password;  
	
	@OneToOne(mappedBy = "idCart")
	@JoinColumn(name = "idCart")
	private Cart cart;
	
	
	public Customer (){};
	
	//Constructor with cart 
	public Customer (String name, String lastname, String dateofbirth, String user, String password, Cart cart){
		this.name = name;
		this.lastname = lastname;
		this.dateofbirth = dateofbirth;
		this.user = user;
		this.password = password;
		this.cart = cart;
	}
	
	//Constructor without cart
	public Customer (String name, String lastname, String dateofbirth, String user, String password){
		this.name = name;
		this.lastname = lastname;
		this.dateofbirth = dateofbirth;
		this.user = user;
		this.password = password;
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
	public String getUsername() {
		return user;
	}
	public void setUsername(String username) {
		this.user = username;
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

}
