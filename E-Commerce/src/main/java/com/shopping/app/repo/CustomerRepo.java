package com.shopping.app.repo;

import java.util.Optional;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.shopping.app.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>{
	
	//Customer findBy(String username);
	
	@Query("SELECT u FROM Customer u WHERE u.email=?1 and u.password=?2")
	public Customer findbyemailAndpassword(String email,String password);
	
	
	

}
