package com.chainsys.bloodbankmain;

import java.sql.SQLException;
import java.util.Scanner;

import com.chainsys.bloodbankdao.BloodBankDetails;
import com.chainsys.bloodbankdao.BloodBanksDetails;
import com.chainsys.bloodbankutil.ConnectionUtil;

public class TestsBloodBank extends BloodBanksDetails {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		 String inputs,input1 = "1", input2 = "2", input3 = "existinguser", input4 = "newuser", input5, input6 = "register",input8="3",input10="4", input12="5";
		System.out.println("WELCOME TO BLOOD BANK ");
		System.out.println("1.admin\n2.user");
		input5 = sc.next();
		if (input5.equals(input1)) {
			System.out.println("Welcome To Admin Page");
//			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
//			bloodBanksDetails.admin();
			System.out.println("1. Users Page 2.Admin Page 3.Stock Page ");
			 inputs = sc.next();
		
			if(inputs.equals(input1)) {
				System.out.println("Users Page");
				System.out.println("1.Insert 2.Read 3.Update 4.Delete");
				inputs = sc.next();
				if(inputs.equals(input1)) {
					ConnectionUtil.insert(username, password);
				}else if(inputs.equals(input2)) {
					ConnectionUtil.read();
					ConnectionUtil.retreive();
				}else if(input5.equals(input8)) {
					ConnectionUtil.update(name);
				}else if(inputs.equals(input10)) {
					ConnectionUtil.delete();
				}
			}else if(inputs.equals(input2)) {
					System.out.println("Admin Page");
					System.out.println("1.Insert 2.Read 3.Update 4.Delete 5.Camp");
					inputs = sc.next();
					if(inputs.equals(input1)) {
						ConnectionUtil.insertAdmin(username, password);
					}else if(inputs.equals(input2)) {
						ConnectionUtil.read();
						ConnectionUtil.retreive();
					}else if(inputs.equals(input8)) {
						ConnectionUtil.update(name);
					}else if(inputs.equals(input10)) {
						ConnectionUtil.delete();
					}else if(inputs.equals(input12)) {
						System.out.println("Camp Page");
						System.out.println("1.Insert 2.Read 3.Update 4.Delete 5.Camp");
						inputs = sc.next();
						if(inputs.equals(input12)) {
							ConnectionUtil.insertsAdmin(username, password);
						}else if(inputs.equals(input2)) {
							ConnectionUtil.read();
							ConnectionUtil.retreive();
						}else if(inputs.equals(input8)) {
							ConnectionUtil.update(name);
						}else if(inputs.equals(input10)) {
							ConnectionUtil.delete();
						}				
					}

			}
		} else if (input5.equals(input2)) {
			System.out.println("Welcome To User Page");
			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();

			System.out.println("1. Existing User 2. New User");
			String input9 = sc.next();

			if (input9.equals(input1)) {
				ConnectionUtil.insert(username, password);
//				bloodBanksDetails.login();
				BloodBankDetails bloodBankDetails = new BloodBankDetails();
				System.out.println("Enter Type");
				System.out.println("1.Student \n 2.Donor \n 3.Donordetails \n 4.New \n 5.Test \n 6. Availablebags \n 7. Matchingbloodgroups");
				// String input8 = sc.next();

				String type1 = "Student", type2 = "Donor", type3 = "Donordetails", type4 = "New", type5 = "Test",
						type6 = "Availablebags",type7="Matchingbloodgroups";
				String input7 = sc.next();
				if (input7.equals(type1)) {
					// BloodBankDetails bloodBankDetails1 = new BloodBankDetails();
					bloodBankDetails.displayDetails();
				} else if (input7.equals(type2)) {
					String input = "yes";
					System.out.println("You are going to donate blood");
					 inputs = sc.next();
					if (inputs.equals(input)) {
						System.out.println("Please Enter Your Id :");
						int unit, unit1 = 300, unit2 = 200, unit3 = 250, id1 = 5, id = sc.nextInt();
						System.out.println("Please Enter Your Name : ");
						String name1 = "Vidhya", name = sc.next();
						System.out.println("Please Enter Your PhoneNumber : ");
						long phonenumber1 = 1234565432l, phoneNumber = sc.nextLong();
						if (id == id1 && name.equals(name1) && phoneNumber == phonenumber1) {
							System.out.println("Confirmation Successfull");
							System.out.println("Please Enter your age");
							int age = sc.nextInt();
							if (age >= 18) {
								System.out.println("How Much Do you want to donate");
								unit = sc.nextInt();
								if (unit == unit1) {
									System.out.println("Unit Of Blood Taken");
								} else if (unit == unit2) {
									System.out.println("Unit Of Blood Taken");
								} else if (unit == unit3) {
									System.out.println("Unit Of Blood Taken");
								} else if (unit != unit1 || unit != unit2 || unit != unit3) {
									System.out.println(
											"Sorry! Here we collect this much unit only because for donor's health concern.");
								} else {
									System.out.println("Sorry, You Cannot Donate Blood");
								}
								int donateBlood = sc.nextInt();
								if (donateBlood == 200) {
									System.out.println("You Have Finished Your Blood Donation And You Have Donated "
											+ donateBlood);
									System.out.println("Thank You For Doing This Service");
								} else if (donateBlood == 250) {
									System.out.println(donateBlood + "ml finished blood donation");
									System.out.println("Thank You For Doing This Service");
								} else if (donateBlood == 300) {
									System.out.println("You Have Finished Your Blood Donation And You Have Donated "
											+ donateBlood);
									System.out.println("Thank You For Doing This Service");

								} else {
									System.out.println("Select any one of the option");
								}
							}
						}
					}
				} else if (input7.equals(type3)) {
					bloodBankDetails.bloodDonorsDetails("Vidhya", "O+", "Avadi", 134226728l, "Chennai");
				} else if (input7.equals(type4)) {
					bloodBankDetails.userDetails();
				} else if (input7.equals(type5)) {
					BloodBanksDetails bloodBanksDetail = new BloodBanksDetails();
					bloodBanksDetails.diseaseTest();
				}else if(input7.equals(type6)) {
					bloodBankDetails.availableBloodBags();
				}else if(input7.equals(type7)) {
					bloodBanksDetails.matchingBloodGroupDetails();
				} else {
					System.out.println("Select any one of the option");
				}
			} else if (input9.equals(input2)) {
//			bloodBanksDetails.register();
				ConnectionUtil.inserts(username, password);
			}
		}
	}
}
