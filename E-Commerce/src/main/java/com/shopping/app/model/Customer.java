package com.shopping.app.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

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
public class Customer implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	//private static AtomicInteger idd=new AtomicInteger(2133);
	@Column(name="idcustomer",unique = true, nullable = false)
	private Long idcustomer;
	
	@Column(name = "last_name", nullable = false, length = 50)
	private String lastName;
	
	@Column(name = "first_name", nullable = false, length = 50)
	private String firstName;
	
	@Column(name = "username", unique = true, nullable = false, length = 50)
	private String username;
	
	@Column(name = "password", nullable = false, length = 256)
	private String password;
	
	@Column(name = "email", nullable = false, length = 256)
	private String email;
	
	@Column(name = "mobilenumber", nullable = false, length = 256)
	private long mobilenumber;
	
	/*
	 * private List<Order> orderss = new ArrayList<Order>(); private List<Cart>
	 * carts = new ArrayList<>();
	 */

	public Customer() {
	}

	public Customer(Long idcustomer, String lastName, String firstName, String username, String password,
			List<Order> orderss, List<Cart> carts) {

		this.idcustomer = idcustomer;//(long) idd.incrementAndGet();
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


	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


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
