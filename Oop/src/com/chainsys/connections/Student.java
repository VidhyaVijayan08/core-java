package com.chainsys.connections;

public class Student {

	int id;
	String name;
	String address;

	
	
	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		if (id > 0) {
			this.id = id;
		} else {
			System.out.println("Invalid Id. Please Enter Positive Value");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		if (name.matches("[a-zA-Z]+")) {
			this.name = name;
		} else {
			System.out.println("Invalid Movie Name.");
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
		if (address.matches("[a-zA-Z]+")) {
			this.address = address;
		} else {
			System.out.println("Invalid Movie Name.");
		}
	}

	public Student() {

	}

	public Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	// toString
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
