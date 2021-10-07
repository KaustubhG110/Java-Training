package com.demo.bookApp.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bookApp.models.Publisher;
import com.demo.bookApp.repositories.PublisherRepository;

@Service
public class PublisherService {

	@Autowired
	private PublisherRepository publisherRepository;
	
	public Publisher addPublisher(Publisher publisher) {
		
		publisher.setPublisherId(UUID.randomUUID().toString());
		
		publisherRepository.save(publisher);
		
		return publisher;
		
	}

	public List<Publisher> getPublishers() {
		return this.publisherRepository.findAll();
	}

	public Optional<Publisher> getOrder(String publisherId) {
		return this.publisherRepository.findById(publisherId);
	}

	public Publisher changePublisher(String publisherId, Publisher publisher) {
		publisher.setPublisherId(publisherId);
		return this.publisherRepository.save(publisher);
	}

	public void deletePublisher(String publisherId) {
		this.publisherRepository.deleteById(publisherId);
	}
}
