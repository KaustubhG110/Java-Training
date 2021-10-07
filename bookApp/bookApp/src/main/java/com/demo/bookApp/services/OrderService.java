package com.demo.bookApp.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bookApp.models.Book;
import com.demo.bookApp.models.Customer;
import com.demo.bookApp.models.Order;
import com.demo.bookApp.repositories.BookRepository;
import com.demo.bookApp.repositories.CustomerRepository;
import com.demo.bookApp.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private BookRepository bookRepository;

	public Order createOrder(Order order) {

		order.setOrderId(UUID.randomUUID().toString());
		
		Customer customer = this.customerRepository.findById(order.getCustomer().getCustomerId()).get();
		order.setCustomer(customer);
		
		Book book = this.bookRepository.findById(order.getBook().getBookId()).get();
		order.setBook(book);
		
		orderRepository.save(order);
		
		return order;
	}

	public List<Order> getOrders() {
		return this.orderRepository.findAll();
	}

	public Optional<Order> getOrder(String orderId) {
		return this.orderRepository.findById(orderId);
	}

	public Order changeOrder(String orderId, Order order) {
		order.setOrderId(orderId);
		
		Customer customer = this.customerRepository.findById(order.getCustomer().getCustomerId()).get();
		order.setCustomer(customer);
		
		Book book = this.bookRepository.findById(order.getBook().getBookId()).get();
		order.setBook(book);
		
		return this.orderRepository.save(order);
	}

	public void deleteOrder(String orderId) {
		this.orderRepository.deleteById(orderId);		
	}
	
	
}
