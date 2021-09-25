package com.demo.books_constructor;

import java.util.List;

public class Order {

	int orderId;
	Customer customer;
	List<Book> orderItems;

	public Order(int orderId, Customer customer, List<Book> orderItems) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.orderItems = orderItems;

	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customer=" + customer + ", orderItems=" + orderItems + "]";
	}

}
