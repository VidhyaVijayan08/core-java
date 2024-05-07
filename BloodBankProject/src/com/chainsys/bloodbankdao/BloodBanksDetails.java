package com.chainsys.bloodbankdao;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BloodBanksDetails extends BloodBanks{

	public static String adminName= "Vidhya";
	public static int adminId=5;
	Scanner sc = new Scanner(System.in);
	public static String username;
	public static String password;
	public static String username1;
	public static String password1;
	public static String aname;
	public static int aid;
	public static String username2,password2;
//	public static String bloodGroup;
	
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
		int adminId=5;
		String adminName="Vidhya";
		System.out.println("Enter your ID:");
		aid=sc.nextInt();
		if(aid==adminId ) {
			System.out.println("Enter your Name:");
			 aname=sc.next();
			if(aname.equals(adminName) && aid==adminId) {
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
		String s1 = "^[a-zA-Z]+$",s2="^[a-zA-Z0-9]+$";
		if(name.matches(s1)) {
			System.out.println("Enter Your Username ");
			username = sc.next();
			if(username.matches(s2)) {
				System.out.println("Enter Your Password");
				password = sc.next();
				System.out.println("Registeration Success");	
			}else {
				System.out.println("Please Enter proper username");
			}
		}else {
			System.out.println("Please Enter proper name");
		}
		
	}
	
	public void login() {
		System.out.println("***************************");
		System.out.println("     Welcome To Login Page   ");
		System.out.println("***************************");
		System.out.println("Enter Your Username : ");
		 username1 =sc.next();
			String s1 = "^[a-zA-Z]+$",s2="^[a-zA-Z0-9]+$";
		 if(username1.matches(s1)) {
			 System.out.println("Enter your Password : ");
			 password1 = sc.next();
			 System.out.println(BloodBanksDetails.username);
			 System.out.println(password);
			 username2 = "Vidhya@08";
			 password2= "Sudha"; 
		 }else {
			 System.out.println("Incorrect username");
		 }
		
//		if(username.equals(username1) && password.equals(password1)) {
//			System.out.println("Login Successfull");
//		}else {
//			System.out.println("Login Failed");
//		}
	}
	
	public void availableBloodBags() {
		System.out.println("***************************");
		System.out.println("Available Blood Bags :- ");
		System.out.println("***************************");
		System.out.println("=> 50 Blood Bags are available");
		System.out.println("=> Each unit of blood is broken down into components,\n such as red blood cells, plasma, cryoprecipitated AHF,\n and platelets.One unit of whole blood,\n once it's separated, may be transfused to several patients,\n each with different needs.");
		System.out.println("***************************");
	}
	
	public void diseaseTest() throws ClassNotFoundException, SQLException {
		System.out.println("Screening for current or past infections, including:");
		System.out.println("1. Hepatitis viruses B and C \n2. Human immunodeficiency virus (HIV) \n3. Human T-lymphotropic viruses (HTLV) I and II \n4. Syphilis\n5. West Nile virus\n6. Chagas disease \n7.No disease ");
		try {
			int diseaseOption=sc.nextInt();
			if(diseaseOption==1||diseaseOption==2||diseaseOption==3||diseaseOption==4||diseaseOption==5||diseaseOption==6) {
				System.out.println("Sorry ! you are not supposed to donate blood");
			}
			else if(diseaseOption==7) {
				userDetails();
				System.out.println("Thank you for donating blood");
			}else {
				System.out.println("You can give blood");
			}
		}catch (InputMismatchException e) {
			System.out.println("Select any one of the option in integer!");
		}
	}
	
	public void matchingBloodGroupDetails() {
		System.out.println("*************************");
		System.out.println("Blood Type Matching");
		System.out.println("*************************");
		System.out.println(" On their surface, red cells have inherited chemical structures called antigens that can cause a person’s immune system\n to make antibodies against them. Humans have 35 major groups or families of these antigens, as well as other minor groups,\n but consideration of two, the ABO group and the RhD group, is very important to ensure that a transfusion recipient receives\n compatible blood. The presence of antigens within these groups is what determines a person’s blood type. Blood types are \n referred to as Type A, Type B, Type AB (which has both A and B antigens), or Type O (which has neither A or B antigens) \n followed by positive or negative, which indicates the presence of the RhD antigen. Persons who are RhD negative have no RhD antigen. ");
		System.out.println("*************************");
		System.out.println("Enter Your BloodGroup : ");
		System.out.println("*************************");
		String bloodGroup =sc.next(),bloodGroup1="A+",bloodGroup2="A-",bloodGroup3="B+",bloodGroup4="B-",bloodGroup5="AB+",bloodGroup6="AB-",bloodGroup7="O+",bloodGroup8="O-";
		System.out.println("*************************");
		if(bloodGroup.equals(bloodGroup1)) {
			System.out.println("Matching BloodGroups For " + bloodGroup);
			System.out.println("A+ = A+, A-, O+, O-");
		}else if(bloodGroup.equals(bloodGroup2)) {
			System.out.println("Matching BloodGroups For " + bloodGroup);
			System.out.println("A- = A-, O-");
		}else if(bloodGroup.equals(bloodGroup3)) {
			System.out.println("Matching BloodGroups For " + bloodGroup);
			System.out.println("B+ = B+, B-, O+, O-");
		}else if(bloodGroup.equals(bloodGroup4)) {
			System.out.println("Matching BloodGroups For " + bloodGroup);
			System.out.println("B- = B-, O-");	
		}else if(bloodGroup.equals(bloodGroup5)) {
			System.out.println("Matching BloodGroups For " + bloodGroup);
			System.out.println("AB+ = Compatible with all blood types");
		}else if(bloodGroup.equals(bloodGroup6)) {
			System.out.println("Matching BloodGroups For " + bloodGroup);
			System.out.println("AB- = AB-, A-, B-, O-");
		}else if(bloodGroup.equals(bloodGroup7)) {
			System.out.println("Matching BloodGroups For " + bloodGroup);
			System.out.println("O+ = O+, O-");
		}else if(bloodGroup.equals(bloodGroup8)) {
			System.out.println("Matching BloodGroups For " + bloodGroup);
			System.out.println("O- = O-");
		}else {
			System.out.println("Invalid Data");
		}
		System.out.println("*************************");
	}
}
