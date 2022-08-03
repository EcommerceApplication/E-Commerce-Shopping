package com.shopping.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.shopping.app.model.Customer;
import com.shopping.app.repo.CustomerRepo;

@Service
public class CustomerLoginImpl{
	
	@Autowired
	private CustomerRepo custRepo;
	
	
	public String findByemailAndpassword(String email, String password) {
		
		Customer csutmr=custRepo.findbyemailAndpassword(email, password);
		
		String msg=null;
		
         String res=null;
		
		System.out.println(password);
		
		System.out.println(email+" "+password);
		
		if(csutmr!=null) {
		res=csutmr.getPassword();
			
			if(res.equals(password)) {
			msg="Customer login Successfully!";
			
		}
		}else {
			msg="Invalid Credentials";
		}
		
		return msg;
		
	}
	
	
	

}
