package com.demo.bookApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.bookApp.models.Publisher;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, String> {
	
}
