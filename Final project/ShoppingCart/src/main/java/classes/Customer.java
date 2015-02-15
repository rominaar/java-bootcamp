package classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "user")

public class Customer {
	
	@Id
	@GeneratedValue
	@Column(name = "idUser")
	private Long idCustomer;
		
	private String name;
	private String lastname;
	private String dateofbirth;
	private String user;
	private String password;
	private Cart cart;
	
	/*  ¿Son necesarias las anotaciones @column???
	 * 
	@Column(name = "Name")
	private String name;
	
	@Column(name = "Lastname")
	private String lastname;
	
	@Column(name = "DateOfBirth")
	private String dateofbirth;
	
	@Column(name = "Username")
	private String user;
	
	@Column(name = "Password")
	private String password;    */
	

	
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
