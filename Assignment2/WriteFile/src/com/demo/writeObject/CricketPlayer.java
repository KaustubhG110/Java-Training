package com.demo.writeObject;

import java.io.Serializable;

public class CricketPlayer implements Serializable {

	private static final long serialVersionUID = 1L;
	String name;
	int rating;
	String role;
	String country;

	public CricketPlayer(String name, int rating, String role, String country) {
		this.name = name;
		this.rating = rating;
		this.role = role;
		this.country = country;
	}

	@Override
	public String toString() {
		return "CricketPlayer [name=" + name + ", rating=" + rating + ", role=" + role + ", country=" + country + "]";
	}

}
