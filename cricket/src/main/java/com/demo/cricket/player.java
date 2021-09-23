package com.demo.cricket;

public class player {
	String name;
	int testrating;
	String role;
	String country;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return testrating;
	}

	public void setRating(int rating) {
		this.testrating = rating;
	}

	public String getrole() {
			return role;
	}

	public void setPosition(String position) {
		this.role = position;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", rating=" + testrating + ", role=" + role + ", country=" + country + "]";
	}

}
