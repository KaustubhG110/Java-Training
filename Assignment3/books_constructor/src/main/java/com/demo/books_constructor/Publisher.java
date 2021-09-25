package com.demo.books_constructor;

public class Publisher {

	int publisherId;
	String publisherName;
	String publisherLocation;

	public Publisher(int publisherId, String publisherName, String publisherLocation) {
		super();
		this.publisherId = publisherId;
		this.publisherName = publisherName;
		this.publisherLocation = publisherLocation;
	}

	@Override
	public String toString() {
		return "Publisher [publisherId=" + publisherId + ", publisherName=" + publisherName + ", publisherLocation="
				+ publisherLocation + "]";
	}

}
