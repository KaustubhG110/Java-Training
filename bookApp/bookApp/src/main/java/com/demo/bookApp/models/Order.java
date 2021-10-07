package com.demo.bookApp.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "orderbook")
public class Order {

	@Id
	private String orderId;
	
	@ManyToOne(cascade = CascadeType.DETACH)
	Customer customer;
	
	@ManyToOne(cascade = CascadeType.DETACH)
	Book book;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customer=" + customer + ", book=" + book + "]";
	}

}
