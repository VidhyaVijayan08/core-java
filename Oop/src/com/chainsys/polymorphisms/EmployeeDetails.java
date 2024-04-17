package com.chainsys.polymorphisms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeDetails {
	int id;
	String name;
	int mobileNumber;
	String address;
	String location;

	public void getUserDetails() {
		String s1 = "^[a-zA-Z]+$";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Name: ");
		name = sc.nextLine();
		Pattern p = Pattern.compile("[A-Z][a-z]");
		Matcher m = p.matcher(name);
		if (m.find()) {
			System.out.print("Enter your ID number: ");
			id = sc.nextInt();
			if (id > 0) {
				System.out.print("Enter your Mobile Number: ");
				mobileNumber = sc.nextInt();
				if (mobileNumber > 0) {
					System.out.print("Enter your Address name: ");
					address = sc.next();
					if (address.matches(s1)) {
						System.out.print("Enter your Location name: ");
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
		sc.close();
	}

	public void printUserDetails() {
		System.out.println("Employee Details :-");
		System.out.println("**********************");
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Mobile number: " + mobileNumber);
		System.out.println("Address: " + address);
		System.out.println("location : " + location);
		System.out.println("**********************");
	}
	
	public void working() {
		System.out.println("Working as Software Developer");
	}
	
	public void working(int id) {
		System.out.println("Working as Software Tester");
	}

}
