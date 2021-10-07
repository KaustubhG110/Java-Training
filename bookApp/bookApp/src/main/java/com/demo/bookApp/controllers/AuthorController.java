package com.demo.bookApp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bookApp.models.Author;
import com.demo.bookApp.services.AuthorService;

@RestController
public class AuthorController {
	@Autowired
	private AuthorService authorService;

	@PostMapping("/author")
	public Author addAuthor(@RequestBody Author author) {
		return this.authorService.addAuthor(author);
	}

	@GetMapping("/author")
	public List<Author> getAuthors() {
		return this.authorService.getAuthors();
	}

	@GetMapping("author/{authorId}")
	public Optional<Author> getAuthor(@PathVariable String authorId) {
		return this.authorService.getAuthor(authorId);
	}

	@PutMapping("author/{authorId}")
	public Author changeAuthor(@PathVariable String authorId, @RequestBody Author author) {
		return this.authorService.changeAuthor(authorId, author);
	}

	@DeleteMapping("author/{authorId}")
	public void deleteAuthor(@PathVariable String authorId) {
		this.authorService.deleteAuthor(authorId);
	}
}
