package com.shopping.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name = "customers", catalog = "shopping_cart_db")
public class Customer implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcustomer;
	private String lastName;
	private String firstName;
	private String username;
	private String password;
	private String email;
	private long mobilenumber;
	
	/*
	 * private List<Order> orderss = new ArrayList<Order>(); private List<Cart>
	 * carts = new ArrayList<>();
	 */

	public Customer() {
	}

	public Customer(Long idcustomer, String lastName, String firstName, String username, String password,
			List<Order> orderss, List<Cart> carts) {

		this.idcustomer = idcustomer;
		this.lastName = lastName;
		this.firstName = firstName;
		this.username = username;
		this.password = password;
		/*
		 * this.orderss = orderss; this.carts = carts;
		 */
		
	}

	
	public Customer(String email, long mobilenumber) {
		super();
		this.email = email;
		this.mobilenumber = mobilenumber;
	}

	
	
	public Long getIdCustomer() {
		return this.idcustomer;
	}

	public void setIdCustomer(Long idCustomer) {
		this.idcustomer = idCustomer;
	}

	@Column(name = "last_name", nullable = false, length = 50)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "first_name", nullable = false, length = 50)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	
	@Column(name = "username", unique = true, nullable = false, length = 50)
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false, length = 256)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	@Column(name = "email", nullable = false, length = 256)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "mobilenumber", nullable = false, length = 256)
	public long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	/*
	 * @JsonIgnore
	 * 
	 * @OneToMany(fetch=FetchType.LAZY,mappedBy = "customer")
	 * 
	 * @Cascade(CascadeType.SAVE_UPDATE)//1 object propagating to another object via
	 * an association. public List<Order> getOrderss() { return orderss; }
	 * 
	 * public void setOrderss(List<Order> orderss) { this.orderss = orderss; }
	 */
	/*
	 * @JsonIgnore
	 * 
	 * @OneToMany(fetch=FetchType.LAZY,mappedBy = "customer")
	 * 
	 * @Cascade(CascadeType.SAVE_UPDATE) public List<Cart> getCarts() { return
	 * carts; }
	 * 
	 * public void setCarts(List<Cart> carts) { this.carts = carts; }
	 */
	
	

}
