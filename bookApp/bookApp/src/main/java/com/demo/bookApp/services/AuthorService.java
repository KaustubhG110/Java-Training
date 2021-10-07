package com.demo.bookApp.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bookApp.models.Author;
import com.demo.bookApp.repositories.AuthorRepository;

@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepository authorRepository;
	
	public Author addAuthor(Author author) {
		author.setAuthorId(UUID.randomUUID().toString());
		authorRepository.save(author);
		return author;
		
	}

	public List<Author> getAuthors() {
		return this.authorRepository.findAll();
	}

	public Optional<Author> getAuthor(String authorId) {
		return this.authorRepository.findById(authorId);
	}

	public Author changeAuthor(String authorId, Author author) {
		author.setAuthorId(authorId);
		return this.authorRepository.save(author);
	}

	public void deleteAuthor(String authorId) {
		this.authorRepository.deleteById(authorId);		
	}

	
}
