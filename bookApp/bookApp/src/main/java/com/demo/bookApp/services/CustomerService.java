package com.demo.bookApp.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bookApp.models.Customer;
import com.demo.bookApp.repositories.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public Customer addCustomer(Customer customer) {

		customer.setCustomerId(UUID.randomUUID().toString());
		customerRepository.save(customer);
		return customer;
	}

	public List<Customer> getCustomers() {
		return this.customerRepository.findAll();
	}

	public Optional<Customer> getCustomer(String customerId) {
		return this.customerRepository.findById(customerId);
	}

	public Customer changeCustomer(String customerId, Customer customer) {
		customer.setCustomerId(customerId);
		return this.customerRepository.save(customer);
	}

	public void deleteCustomer(String customerId) {
		this.customerRepository.deleteById(customerId);
	}
}
