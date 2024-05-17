package com.chainsys.bloodbankmain;

import java.sql.SQLException;
import java.util.Scanner;

import com.chainsys.bloodbankdao.BloodBankDetails;
import com.chainsys.bloodbankdao.BloodBanksDetails;
import com.chainsys.bloodbankutil.ConnectionUtil;

public class TestsBloodBank extends BloodBanksDetails{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		String input1="1", input2="2",input3="existinguser", input4 = "newuser",input5,input6="register";
		System.out.println("WELCOME TO BLOOD BANK ");
		System.out.println("1.admin\n2.user");
		input5 = sc.next();
		
		if(input5.equals(input1)) {
//			bloodBanksDetails.login();
//			BloodBanksDetails.ins(BloodBanksDetails.username,BloodBanksDetails.password);
//			BloodBanksDetails.ins(username, password);
			ConnectionUtil.insert(username, password);
		}else if(input5.equals(input2)) {
			BloodBankDetails bloodBankDetails = new BloodBankDetails();
			System.out.println("Enter Type");
			System.out.println("1.Student \n 2.Donor \n 3.Donordetails \n 4.Newuser");
			String type1="Student", type2="Donor", type3 = "Donordetails", type4="New", type5="Test",type6="Availablebags";
			String input7=sc.next();
			if(input7.equals(type1)) {
//				BloodBankDetails bloodBankDetails1 = new BloodBankDetails();
				bloodBankDetails.displayDetails();
			}else if(input7.equals(type2)) {
				String input="yes";	
				System.out.println("You are going to donate blood");
					String inputs = sc.next();
					if(inputs.equals(input)) {
						System.out.println("Please Enter Your Id :");
						int unit,unit1=300,unit2=200,unit3=250,id1=5, id=sc.nextInt();
						System.out.println("Please Enter Your Name : ");
						String name1="Vidhya", name = sc.next();
						System.out.println("Please Enter Your PhoneNumber : ");
						long phonenumber1 =1234565432l, phoneNumber = sc.nextLong();
						if(id==id1 && name.equals(name1) && phoneNumber == phonenumber1 ) {
							System.out.println("Confirmation Successfull");
							System.out.println("Please Enter your age");
							int age = sc.nextInt();
							if(age>=18) {
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
								 else {
										System.out.println("Sorry, You Cannot Donate Blood");
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
								
							}else {
								System.out.println("Select any one of the option");
							}
						}
					}
							
				}
			}else if(input7.equals(type3)) {
				bloodBankDetails.bloodDonorsDetails("Vidhya", "O+", "Avadi",134226728l,"Chennai");
				
			}	else if(input7.equals(type4)) {
			bloodBankDetails.userDetails();
		}else if(input7.equals(type5)){
			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
			bloodBanksDetails.diseaseTest();
		}
		}else {
			System.out.println("Select any one of the option");
		}
	
		}
	}
