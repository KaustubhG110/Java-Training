package com.demo.books_constructor;

public class Customer {

	int customerId;
	String customerName;

	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + "]";
	}

}
