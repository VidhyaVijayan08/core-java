package com.chainsys.polymorphismjdbc;

public class BloodBank {
	
	static int id;
	static String name;
	static String bloodGroup;
	
	//Getters and Setters
	public static int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodgroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	public BloodBank() {
		
	}
	
	public BloodBank(int id, String name, String bloodGroup) {
		super();
		this.id = id;
		this.name = name;
		this.bloodGroup = bloodGroup;
	}
	
	//toString
	@Override
	public String toString() {
		return "BloodBank [id=" + id + ", name=" + name + ", bloodGroup=" + bloodGroup + "]";
	}
}
