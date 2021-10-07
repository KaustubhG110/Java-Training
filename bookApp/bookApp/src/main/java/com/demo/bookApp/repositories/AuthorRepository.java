package com.demo.bookApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.bookApp.models.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, String> {
	
}
