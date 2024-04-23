package com.chainsys.polymorphismsupdate;

import java.util.Scanner;

public abstract class BloodBanks {
	int id;
	String name;
	public String bloodGroup;

	public void purchase() {

	}

	public void testing() {
		System.out.println("Blood Test Candidates Be Ready");
	}

	public void testing(int id) {
		System.out.println("You can go to the room for blood Test");
	}

	public void available(String bloodGroup) {
		System.out.println("bloodGroup Matched");
	}

	public abstract void testing(String name);

	public void userDetails() {

		String s1 = "^[a-zA-Z]+$";
		String s2 = "[!@#$%&*()_+=|<>?{}\\[\\]~-]";
		String bloodGroup1="A-";
		String bloodGroup2="O+";
		String bloodGroup3="AB-";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Id : ");
		id = sc.nextInt();
		if (id > 0) {
			System.out.println("Enter Your Name : ");
			name = sc.next();
			if (name.matches(s1)) {
				System.out.println("Enter Your Blood Group : ");
				bloodGroup = sc.next();
//				System.out.println("Enter How Much Blood Used 1.100ml 2.200ml 3.250ml 4.300ml");
//				int bloodUsed =sc.nextInt();
				if(bloodGroup.equals(bloodGroup1)||bloodGroup.equals(bloodGroup2)||bloodGroup.equals(bloodGroup3)){
					System.out.println("User Details");
					System.out.println("**********************");
					System.out.println("Id: " + id);
					System.out.println("Name: " + name);
					System.out.println("Blood Group: " + bloodGroup);
					System.out.println("**********************");
				}else {
					System.out.println("Sorry, Here that Blood Group is not Available!");
				}
			} else {
				System.out.println("Invalid Data");
			}
		} else {
			System.out.println("Invalid Data");
		}
		sc.close();
	}
}
