package com.shopping.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.app.model.Customer;
import com.shopping.app.service.CustomerLoginImpl;
import com.shopping.app.service.CustomerServiceImp;

//AddCustomers: http://localhost:8080/customer/Register.
//GetCustomers: http://localhost:8080/customer/getCustomers.
//Login:        http://localhost:8080/customer/login.

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerLoginImpl custloginImpl;

	@Autowired
	private CustomerServiceImp custServiceImpl;
	
	
	
	@GetMapping("/getCustomers")
	public List<Customer> getAllCustomer() {
		
		List<Customer> allData=custServiceImpl.customers();
		
		return allData;
		
		
	}
	

	
	@PostMapping("/Register")
	public String addCustomer(@RequestBody Customer customer) {
		
		String s=custServiceImpl.saveCustomers(customer);
		
		return s;
	}

	
	@PostMapping("/login")
	public String login(@RequestBody Customer customer) {
		
		String email=customer.getEmail();
		String password=customer.getPassword();
		
		String s=custloginImpl.findByemailAndpassword(email, password);
		
		
		return s;
	}
	
	
	
	
	
}
