package com.chainsys.polymorphismsupdate;

import java.util.Scanner;

public class BloodBanksDetails extends BloodBanks{

//	public int id1;
//	public Object name1;

	public String aname= "Vidhya";
	public int aid=5;
	Scanner sc = new Scanner(System.in);
	public String username,password,username1,password1;


	@Override
	public void testing(String name) {
		System.out.println("You can go to home " + name);
	}
	
	public void details() {
		System.out.println("******************************************************");
		System.out.println("After Blood Donation ");
		System.out.println("Go And Get Juice And Fruits Given In The Room No : 5");
		System.out.println("******************************************************");
	}
	
	public void transaction(int id,String tname,String bloodGroup,String date) {
			System.out.println(" Id : "+ id + "\n Name : " + tname + "\n BloodGroup : " + bloodGroup + "\n Date : " + date);
	
	}
	public void hospitalDetails(String hname, String address, String location, String branch) {
		System.out.println("    Hospital Name : "+ hname + "\n    Address : " + address + "\n    Location : " + location + "\n    Branch : " + branch);

	}
	
	public void bloodDonorsDetails(String donorName,String donorBloodGroup,String donorAddress, long donorMobileNumber,String donorLocation) {		
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you need blood ? (yes/no) ");
		String bloodGroup1 =sc.next();
		String bloodGroup2 = "yes";
		
		if(bloodGroup1.equals(bloodGroup2)) {
			System.out.println("Which bloodgroup you need ?");
			String bloodGroup=sc.next();
			if(bloodGroup.equals(donorBloodGroup)) {
				System.out.println("****************************************");
				System.out.println("             Donor Details         ");
				System.out.println("    Name : "+ donorName + "\n    BloodGroup : " + donorBloodGroup +"\n    Address : " + donorAddress + "\n    Mobile Number : " +donorMobileNumber + "\n    Location : " + donorLocation);
			}else {
				System.out.println("no results found");
			}
		}else {
			System.out.println("Thank you !");
		}
		sc.close();
	}
	
	public void admin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO BLOOD BANK");
		System.out.println("***********************");
		int id=5;
		String adminname="Vidhya";
		System.out.println("Enter your ID:");
		int aid=sc.nextInt();
		if(id==aid ) {
			System.out.println("Enter your Name:");
			String aname=sc.next();
			if(aname.equals(adminname)) {
				System.out.println("Login Successfull");
			}else {
				System.out.println("Login Failed ! Please Enter Correct Name");
			}
		}else {
			System.out.println("Incorrect Id!");
		}
		sc.close();	
	}

	public void register() {
		System.out.println("***************************");
		System.out.println("Welcome To Registration Page!");
		System.out.println("***************************");
		System.out.println("Enter Your Name : ");
		 name=sc.next();
		System.out.println("Enter Your Username ");
		String username = sc.next();
		System.out.println("Enter Your Password");
		@SuppressWarnings("unused")
		String password = sc.next();
		System.out.println("Registeration Success");
	}
	
	public void login() {
		System.out.println("***************************");
		System.out.println("     Welcome To Login Page   ");
		System.out.println("***************************");
		System.out.println("Enter Your Username : ");
		String userName1 =sc.next();
		System.out.println("Enter your Password : ");
		String password1 = sc.next();
		username = "Vidhya@08";
		password = "Sudha";
		if(username.equals(userName1) &&password.equals(password1)) {
			System.out.println("Login Successfull");
		}else {
			System.out.println("Login Failed");
		}
	}
	
	public void availableBloodBags() {
		System.out.println("50 Blood Bags are available");
	}
}
