package com.demo.books;

import java.util.List;

public class Order {

	int orderId;
	Customer customer;
	List<Book> orderItems;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Book> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<Book> orderItems) {
		this.orderItems = orderItems;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customer=" + customer + ", orderItems=" + orderItems + "]";
	}

}
