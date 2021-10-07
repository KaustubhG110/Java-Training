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

import com.demo.bookApp.models.Publisher;
import com.demo.bookApp.services.PublisherService;

@RestController
public class PublisherController {
	@Autowired
	private PublisherService publisherService;

	@PostMapping("/publisher")
	public Publisher addPublisher(@RequestBody Publisher publisher) {
		return this.publisherService.addPublisher(publisher);
	}

	@GetMapping("/publisher")
	public List<Publisher> getPublishers() {
		return this.publisherService.getPublishers();
	}

	@GetMapping("publisher/{publisherId}")
	public Optional<Publisher> getPublisher(@PathVariable String publisherId) {
		return this.publisherService.getOrder(publisherId);
	}

	@PutMapping("publisher/{publisherId}")
	public Publisher changePublisher(@PathVariable String publisherId, @RequestBody Publisher publisher) {
		return this.publisherService.changePublisher(publisherId, publisher);
	}

	@DeleteMapping("publisher/{publisherId}")
	public void deletePublisher(@PathVariable String publisherId) {
		this.publisherService.deletePublisher(publisherId);
	}
}
