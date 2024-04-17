package com.chainsys.polymorphisms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ABCBank {

	String name;
	int mobileNumber;
	int accountNumber;
	int amount;
	String branch;
	String location;
	static int totalBalance;

	public void getUserDetails() {
		String s1 = "^[a-zA-Z]+$";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name: ");
		name = sc.nextLine();
		Pattern p = Pattern.compile("[A-Z][a-z]");
		Matcher m = p.matcher(name);
		if (m.find()) {
			System.out.print("Enter your mobile number: ");
			mobileNumber = sc.nextInt();
			if (mobileNumber > 0) {
				System.out.print("Enter your account number: ");
				accountNumber = sc.nextInt();
				if (accountNumber > 0) {
					System.out.print("Enter your Amount: ");
					amount = sc.nextInt();
					if (amount > 0) {
						System.out.print("Enter your branch name: ");
						branch = sc.next();
						if (branch.matches(s1)) {
							System.out.print("Enter your location: ");
							location = sc.next();
						} else {
							System.out.println("Invalid Data");
						}
					} else {
						System.out.println("Invalid Data");
					}

				} else {
					System.out.println("Invalid Data");
				}
			} else {
				System.out.println("Invalid Data");
			}

		} else {
			System.out.println("Error");

		}

		sc.close();
	}

	public void printUserDetails() {
		System.out.println("User Details");
		System.out.println("**********************");
		System.out.println("Name: " + name);
		System.out.println("Mobile number: " + mobileNumber);
		System.out.println("Account number: " + accountNumber);
		System.out.println("Amount: " + amount);
		System.out.println("Branch Name: " + branch);
		System.out.println("location : " + location);
		System.out.println("**********************");
	}

	public static void showAvailableSavingPlans() {
		System.out.println("Available Saving Plans");
		System.out.println("**********************");
		System.out.println("You Are available for loans");
		System.out.println("**********************");
	}
	
	public void deposit(int amount) {
      System.out.println("before deposit" +amount);
    }
	
	public static void deposit(int amount, int accountNumber, int deposit) {
		System.out.println("Amount deposited - self");
		System.out.println(deposit + " has been deposited");
		int totalBalance = amount + deposit;
		System.out.println(totalBalance + " Total Balance Amount");
		System.out.println("**********************");
	}

	public static void deposit(int accountNumber, int amount, int deposit, int aadharNumber) {
		System.out.println(
				"Amount Deposited By This Account Number : " + accountNumber + " And AadharNumber : " + aadharNumber);
		System.out.println(deposit + " has been deposited");
		totalBalance = amount + deposit;
		System.out.println(totalBalance + " Total Balance Amount");
		System.out.println("**********************");
	}

}
