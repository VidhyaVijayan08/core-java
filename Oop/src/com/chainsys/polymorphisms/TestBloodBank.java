package com.chainsys.polymorphisms;

import java.util.Scanner;

public class TestBloodBank {

	public static void main(String[] args) {
		BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
		bloodBanksDetails.userDetails();
		
		String bloodGroup = bloodBanksDetails.bloodGroup;
		test(bloodGroup,bloodBanksDetails.name);
		BloodBankD bloodBankD = new BloodBankD();
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
				System.out.println("Oops! we dont have that unit");
			}
		}else {
			System.out.println("We don't have this blood group");
		}sc.close();
		
	}
}
