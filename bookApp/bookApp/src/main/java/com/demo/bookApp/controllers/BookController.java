	package com.demo.bookApp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bookApp.models.Book;
import com.demo.bookApp.services.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;

	@PostMapping("/book")
	public Book addBook(@RequestBody Book book) {
		return this.bookService.addBook(book);
	}

	@GetMapping("/book")
	public List<Book> getBooks() {
		return this.bookService.getBooks();
	}

	@GetMapping("book/{bookId}")
	public Optional<Book> getBook(@PathVariable String bookId) {
		return this.bookService.getBook(bookId);
	}

	@PutMapping("book/{bookId}")
	public Book changeBook(@PathVariable String bookId, @RequestBody Book book) {
		return this.bookService.changeBook(bookId, book);
	}

	@DeleteMapping("book/{bookId}")
	public void deleteBook(@PathVariable String bookId) {
		this.bookService.deleteBook(bookId);
	}
}
