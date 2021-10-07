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

import com.demo.bookApp.models.Order;
import com.demo.bookApp.services.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/order")
	public Order createOrder(@RequestBody Order order) {
		return this.orderService.createOrder(order);
	}

	@GetMapping("/order")
	public List<Order> getOrders() {
		return this.orderService.getOrders();
	}
	
	@GetMapping("order/{orderId}")
	public Optional<Order> getOrder(@PathVariable String OrderId) {
		return this.orderService.getOrder(OrderId);
	}

	@PutMapping("order/{orderId}")
	public Order changeOrder(@PathVariable String orderId, @RequestBody Order order) {
		return this.orderService.changeOrder(orderId, order);
	}

	@DeleteMapping("order/{orderId}")
	public void deleteOrder(@PathVariable String orderId) {
		this.orderService.deleteOrder(orderId);
	}
}
