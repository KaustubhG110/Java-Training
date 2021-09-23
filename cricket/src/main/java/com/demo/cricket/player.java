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

	public int getTestrating() {
		return testrating;
	}

	public void setTestrating(int testrating) {
		this.testrating = testrating;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "player [name=" + name + ", testrating=" + testrating + ", role=" + role + ", country=" + country + "]";
	}

	

}
