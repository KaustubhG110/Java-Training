package com.demo.bookApp.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bookApp.models.Author;
import com.demo.bookApp.models.Book;
import com.demo.bookApp.models.Publisher;
import com.demo.bookApp.repositories.AuthorRepository;
import com.demo.bookApp.repositories.BookRepository;
import com.demo.bookApp.repositories.PublisherRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private PublisherRepository publisherRepository;
	@Autowired
	private AuthorRepository authorRepository;
	
	public Book addBook(Book book) {

		book.setBookId(UUID.randomUUID().toString());
		
		Publisher publisher = this.publisherRepository.findById(book.getPublisher().getPublisherId()).get();
		book.setPublisher(publisher);
		
		Author author = this.authorRepository.findById(book.getAuthor().getAuthorId()).get();
		book.setAuthor(author);
		
		bookRepository.save(book);
		return book;

	}

	public List<Book> getBooks() {
		return this.bookRepository.findAll();
	}

	public Optional<Book> getBook(String bookId) {
		return this.bookRepository.findById(bookId);
	}

	public Book changeBook(String bookId, Book book) {
		book.setBookId(bookId);
		
		Publisher publisher = this.publisherRepository.findById(book.getPublisher().getPublisherId()).get();
		book.setPublisher(publisher);
		
		Author author = this.authorRepository.findById(book.getAuthor().getAuthorId()).get();
		book.setAuthor(author);
		
		return this.bookRepository.save(book);
	}

	public void deleteBook(String bookId) {
		this.bookRepository.deleteById(bookId);		
	}
}
