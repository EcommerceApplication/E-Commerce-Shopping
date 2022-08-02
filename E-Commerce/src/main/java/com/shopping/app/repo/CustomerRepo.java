package com.shopping.app.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.app.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Long>{
	
	//Customer findBy(String username);
	
	Boolean existsByemail(String email);
	Optional<Customer> findByemail(String email);
	
	
	

}
