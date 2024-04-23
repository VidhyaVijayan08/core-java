package com.chainsys.polymorphismsupdate;

import java.util.Scanner;

public class TestBloodBank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Already u are an user ? Say yes or no");
		String input = sc.next();
		String inputs = "yes";
		if(input.equals(inputs)) {
			System.out.println("You are going to donate blood");
			 String input1 = sc.next();
			 if(input1.equals(inputs)) {
				 System.out.println("Please Enter Your Id :");
				 int unit,unit1=300,unit2=200,unit3=250,id1=5, id=sc.nextInt();
				 System.out.println("Please Enter Your Name : ");
				 String name1="Vidhya", name = sc.next();
				 System.out.println("Please Enter Your PhoneNumber : ");
				 int phonenumber1 =1234565432, phoneNumber = sc.nextInt();
				 if(id==id1 && name.equals(name1) && phoneNumber == phonenumber1 ) {
					 System.out.println("Confirmation Successfull");
					 System.out.println("How Much Do you want to donate");
					 unit=sc.nextInt();
					 if(unit==unit1) {
						 System.out.println("Unit Of Blood Taken");
					 }else if(unit==unit2) {
						 System.out.println("Unit Of Blood Taken");
					 }else if(unit==unit3) {
						 System.out.println("Unit Of Blood Taken");
					 }else if(unit!=unit1 || unit!=unit2 || unit!=unit3){
						 System.out.println("Sorry! Here we collect this much unit only because for donor's health concern.");
					 }
					 int donateBlood = sc.nextInt();
					 if(donateBlood == 200) {
						 System.out.println("You Have Finished Your Blood Donation And You Have Donated " + donateBlood);
						 System.out.println("Thank You For Doing This Service");
					 }else if(donateBlood == 250) {
						 System.out.println(donateBlood + "ml finished blood donation");
						 System.out.println("Thank You For Doing This Service");
					 }else if(donateBlood == 300) {
						 System.out.println("You Have Finished Your Blood Donation And You Have Donated " + donateBlood);
						 System.out.println("Thank You For Doing This Service");
					 }
				 }else {
					 System.out.println("Sorry, No Records Found!");
				 }
			 }else {
				 System.out.println("User have only allowed to donate");
			 }
		}else {
			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
			bloodBanksDetails.userDetails();
			
			String bloodGroup = bloodBanksDetails.bloodGroup;
			test(bloodGroup,bloodBanksDetails.name);
//			BloodBankD bloodBankD = new BloodBankD();
		}sc.close();
		
	}
	public static void test(String bloodGroup,String name) {
		String bloodGroup1="A-";
		String bloodGroup2="O+";
		String bloodGroup3="AB-";
		int bloodGroupPacket1 = 200,bloodGroupPacket2 = 300, bloodGroupPacket3 = 250;
		
		Scanner sc =new Scanner(System.in);
		if(bloodGroup.equals(bloodGroup1)||bloodGroup.equals(bloodGroup2)||bloodGroup.equals(bloodGroup3)) {
			BloodBankB b2 = new BloodBankB();
			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
			bloodBanksDetails.testing();
			bloodBanksDetails.testing(10);
			b2.bloodTest(10);
			BloodBankD bloodBankD = new BloodBankD();
			bloodBankD.test();
			bloodBankD.testing(10);
			b2.bloodTesting(20);
			int bloodUsed = 100;
			bloodBankD.bloodTest(name);
			bloodBanksDetails.testing(name);
			
			if(bloodGroup.equals(bloodGroup1)) {
				System.out.println(bloodGroupPacket1 +" ml is available for " + bloodGroup1);
				System.out.println("We have " + bloodGroupPacket1 + "ml for " + bloodGroup1);
				System.out.println("Now we currently have " + (bloodGroupPacket1-bloodUsed));
			}else if(bloodGroup.equals(bloodGroup2)) {
				System.out.println(bloodGroupPacket2 +" ml is available for " + bloodGroup2);
				System.out.println("We have " + bloodGroupPacket2 + "ml for " + bloodGroup2);
				System.out.println("Now we currently have " + (bloodGroupPacket2-bloodUsed));
			}else if(bloodGroup.equals(bloodGroup3)) {
				System.out.println(bloodGroupPacket3 +" ml is available for " + bloodGroup3);
				System.out.println("We have " + bloodGroupPacket1 + "ml for " + bloodGroup3);
				System.out.println("Now we currently have " + (bloodGroupPacket3-bloodUsed));
			}else {
				System.out.println("Oops! we dont have that unit.");
			}
		}else {
			System.out.println("We don't have this blood group.");
			System.out.println("Available Blood Groups are \n 1. O+\n 2. A-\n 3. AB-\n");
		}sc.close();
		
	}
}
