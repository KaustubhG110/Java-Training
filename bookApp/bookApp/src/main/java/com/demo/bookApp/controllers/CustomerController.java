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

import com.demo.bookApp.models.Customer;
import com.demo.bookApp.services.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/customer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return this.customerService.addCustomer(customer);
	}
	
	@GetMapping("/customer")
	public List<Customer> getCustomers() {
		return this.customerService.getCustomers();
	}
	
	@GetMapping("cutomer/{customerId}")
	public Optional<Customer> getCustomer(@PathVariable String customerId) {
		return this.customerService.getCustomer(customerId);
	}

	@PutMapping("cutomer/{customerId}")
	public Customer changeCustomer(@PathVariable String customerId, @RequestBody Customer customer) {
		return this.customerService.changeCustomer(customerId, customer);
	}

	@DeleteMapping("cutomer/{customerId}")
	public void deleteCustomer(@PathVariable String customerId) {
		this.customerService.deleteCustomer(customerId);
	}
}
