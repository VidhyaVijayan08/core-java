package com.chainsys.polymorphisms;

import java.util.Scanner;

public class BloodBanks {
	int id;
	String name;
	String bloodGroup;
	
	public void purchase() {
		
	}
	
	public void userDetails() {

		String s1 = "^[a-zA-Z]+$";
		String s2 = "[!@#$%&*()_+=|<>?{}\\[\\]~-]";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Id : ");
		id = sc.nextInt();
		if(id > 0) {
			System.out.println("Enter Your Name : ");
			name = sc.next();
			if(name.matches(s1)) {
				System.out.println("Enter Your Blood Group : ");
				bloodGroup = sc.next();
						System.out.println("User Details");
						System.out.println("**********************");
						System.out.println("Id: " + id);
						System.out.println("Name: " + name);
						System.out.println("Blood Group: " + bloodGroup);
						System.out.println("**********************");
			}else {
				System.out.println("Invalid Data");
			}
		}else {
			System.out.println("Invalid Data");
		}
		sc.close();
	}
	
}
