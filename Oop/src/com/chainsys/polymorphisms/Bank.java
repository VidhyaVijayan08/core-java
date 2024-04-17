package com.chainsys.polymorphisms;

public class Bank {
//	Bank - POJO
//	ABCBank - deposit(), getUserDetails(), printUserDetails(),showAvailableSavingsPlans()
//	TestABCBank - main
	String name;
	int mobileNumber;
	int accountNumber;
	int amount;
	String branch;
	String location;
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public Bank() {
		
	}
	
	public Bank(String name, int mobileNumber, int accountNumber, int amount, String branch, String location) {
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.branch = branch;
		this.location = location;
	}
	
	//toString
	@Override
	public String toString() {
		return "Bank [name=" + name + ", mobileNumber=" + mobileNumber + ", accountNumber=" + accountNumber
				+ ", amount=" + amount + ", branch=" + branch + ", location=" + location + "]";
	}
	
	
	
	
}
