package com.chainsys.polymorphismsupdate;

import java.util.Scanner;

public abstract class BloodBanks {
	int id,input2;
	public static String name;
	public static String bloodGroup,bloodGroup1,bloodGroup2;

	public void purchase() {

	}

	public void testing() {
		System.out.println("Get Ready");
	}

	public void testing(int id) {
		System.out.println("You can go to the room for blood donate");
	}

	public void available(String bloodGroup) {
		System.out.println("BloodGroup Matched");
	}

	public abstract void testing(String name);

	public void userDetails() {

		String s1 = "^[a-zA-Z]+$";
//		String s2 = "[!@#$%&*()_+=|<>?{}\\[\\]~-]";
		String bloodGroup1="A-";
		String bloodGroup2="O+";
		String bloodGroup3="AB-";
		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Your Id : ");
//		id = sc.nextInt();
//		if (id > 0) {
		
			System.out.println("Enter Your Name : ");
			name = sc.next();
			for(int count=0,i=1;i<=1;i++) {
				if (name.matches(s1)) {
					System.out.println("Enter Your Blood Group : ");
					bloodGroup = sc.next();
//					System.out.println("Enter How Much Blood Used 1.100ml 2.200ml 3.250ml 4.300ml");
//					int bloodUsed =sc.nextInt();
					if(bloodGroup.equals(bloodGroup1)||bloodGroup.equals(bloodGroup2)||bloodGroup.equals(bloodGroup3)){
						System.out.println("User Details");
						System.out.println("**********************");
						id = count+1;
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
			}
			
//		} else {
//			System.out.println("Invalid Data");
//		}
		sc.close();
	}
	
	public void displayDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome Here We Can Learn:-");
		System.out.println("**********************************");
		System.out.println("What are the components of blood?");
		System.out.println("Select One Option To Know The Details: \n 1.Red blood cells\n 2.Platelets\n 3. White blood cells\n 4. Plasma\n 5. Cryoprecipitate AHF");
		input2 = 4;
		int input3= sc.nextInt();
		switch(input3) {
		case 1: 
			System.out.println("=> Red blood cells. These cells carry oxygen to the tissues in the body and are commonly used in the treatment of anemia.");
			break;
		case 2: 
			System.out.println("=> Platelets. They help the blood to clot and are used in the treatment of leukemia and other forms of cancer.");
			break;
		case 3:
			System.out.println("=> White blood cells. These cells help to fight infection, and aid in the immune process.");
			break;
		case 4:
			System.out.println("=> Plasma. The watery, liquid part of the blood in which the red blood cells, white blood cells, and platelets are suspended. Plasma is needed to carry the many parts of the blood through the bloodstream. Plasma serves many functions, including the following:");
			System.out.println("a. Helps to maintain blood pressure\nb. Provides proteins for blood clotting\nc. Balances the levels of sodium and potassium");
			break;
		case 5:
			System.out.println("=> Cryoprecipitate AHF. The portion of the plasma that contains clotting factors that help to control bleeding.");
			break;
		}sc.close();
	}
}
