package com.demo.bookApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.bookApp.models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
	
}
