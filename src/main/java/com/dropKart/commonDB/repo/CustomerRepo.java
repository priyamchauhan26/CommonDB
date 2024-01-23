package com.dropKart.commonDB.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dropKart.commonDB.model.Customer;







@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

	Customer findByEmail(String email);
	
	

}
