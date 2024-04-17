package com.chainsys.polymorphisms;

public class BankA{
	int balance;
	public void deposit(int amount) {
        double bonus = amount * 0.05;
        this.balance += amount + bonus;
        System.out.println("Deposit of $" + amount +" made with a 5% bonus of $" + bonus + ". New balance is $" + this.balance);
    }
	
	public void details() {
		System.out.println("Details of A");
	}

	public void display() {
		System.out.println("Display of A");
	}
}
