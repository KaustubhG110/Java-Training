package com.demo.bookApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.bookApp.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {
	
}
