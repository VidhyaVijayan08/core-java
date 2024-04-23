package com.chainsys.polymorphismsupdate;

public class BloodBank {
	
	int id;
	String name;
	String bloodgroup;
	
	//Getters and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	
	public BloodBank() {
		
	}
	
	public BloodBank(int id, String name, String bloodgroup) {
		super();
		this.id = id;
		this.name = name;
		this.bloodgroup = bloodgroup;
	}
	
	//toString
	@Override
	public String toString() {
		return "BloodBank [id=" + id + ", name=" + name + ", bloodgroup=" + bloodgroup + "]";
	}
}
