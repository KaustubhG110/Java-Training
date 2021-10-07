package com.demo.bookApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.bookApp.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {

}
