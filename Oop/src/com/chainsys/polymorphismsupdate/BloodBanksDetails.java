package com.chainsys.polymorphismsupdate;

import java.util.Scanner;

public class BloodBanksDetails extends BloodBanks{

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
	
	public void admin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO BLOOD BANK");
		System.out.println("***********************");
		int id=5;
		String user="Vidhya";
		System.out.println("Enter your ID:");
		int aid=sc.nextInt();
		if(id==aid && id>0) {
			System.out.println("Enter your Name:");
			String aname=sc.next();
			if(aname.equals(user)) {
				System.out.println("Login Successfull");
			}
		}else {
			System.out.println("Incorrect Id!");
		}sc.close();	
	}

//	public void displayDetails() {
//		System.out.println("Welcome Here We Can Learn");
//		System.out.println("What are the components of blood?");
//		System.out.println("Select One Option To Know The Details: \n 1.Red blood cells\n 2.Platelets\n 3. White blood cells\n 4. Plasma\n 5. Cryoprecipitate AHF");
//		switch(5) {
//		case 1: 
//			System.out.println("Red blood cells. These cells carry oxygen to the tissues in the body and are commonly used in the treatment of anemia.");
//		case 2: 
//			System.out.println("Platelets. They help the blood to clot and are used in the treatment of leukemia and other forms of cancer.");
//		case 3:
//			System.out.println("White blood cells. These cells help to fight infection, and aid in the immune process.");
//		case 4:
//			System.out.println("Plasma. The watery, liquid part of the blood in which the red blood cells, white blood cells, and platelets are suspended. Plasma is needed to carry the many parts of the blood through the bloodstream. Plasma serves many functions, including the following:");
//			System.out.println("1. Helps to maintain blood pressure\n 2. Provides proteins for blood clotting\n 3. Balances the levels of sodium and potassium");
//		case 5:
//			System.out.println("Cryoprecipitate AHF. The portion of the plasma that contains clotting factors that help to control bleeding.");
//		}
//	}
}
