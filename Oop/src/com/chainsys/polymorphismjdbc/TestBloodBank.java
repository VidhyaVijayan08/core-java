package com.chainsys.polymorphismjdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestBloodBank extends BloodBanksDetails{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		TestBloodBank testBloodBank = new TestBloodBank();
		Scanner sc = new Scanner(System.in);		
		System.out.println("Do you have an account ? (yes/no/student/admin/transaction/hospital/donordetails/register/login/availabilitydetails/test/matchingbloodgroupdetails)");
		String input = sc.next();
		String inputs = "yes", input2 = "student", input3="admin", input4="transaction", input5="hospital", input6 = "donordetails", input7="register", input8="login", input9="availabilitydetails", input10="test", input11="matchingbloodgroupdetails";
		if(input.equals(inputs)) {
			System.out.println("You are going to donate blood");
			String input1 = sc.next();
			if(input1.equals(inputs)) {
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
						System.out.println("Sorry, You Cannot Donate Blood");
					}
					
				 }else {
					 System.out.println("Sorry, No Records Found!");
				 }
			 }else {
				 
				 System.out.println("User have only allowed to donate");
				 System.out.println("If you need blood please login again !Enter as a new login");
			 }
		}else if(input.equals(input2)) {
			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
			bloodBanksDetails.displayDetails();
		}else if(input.equals(input3)){
			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
			bloodBanksDetails.admin();
		}else if(input.equals(input4)) {
			 System.out.println("**********************************");
			 System.out.println(" Daily transaction for blood bank");
			 System.out.println("**********************************");
			 BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
			 bloodBanksDetails.transaction(1, "Vidhya", "O+","22-04-2024");
			 System.out.println("--------------------");
			 bloodBanksDetails.transaction(2, "Santhini", "O+","22-04-2024");
			 System.out.println("--------------------");
			 bloodBanksDetails.transaction(3, "Swarna", "A+", "23-04-2024");
			 System.out.println("--------------------");
			 bloodBanksDetails.transaction(4, "Sangeetha", "A-","20-04-2024");
			 System.out.println("--------------------");
			 bloodBanksDetails.transaction(5, "Swetha", "AB-","24-04-2024");
			 System.out.println("**********************************");
		}else if(input.equals(input5)) {
			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
			System.out.println("****************************************");
			System.out.println("   Hospital Details For Blood Donation     ");
			System.out.println("****************************************");
			bloodBanksDetails.hospitalDetails("Apolo Hospital","Avadi","Chennai","Avadi");
			System.out.println("----------------------------------------");
			bloodBanksDetails.hospitalDetails("Vijaya Hospital ","Vadapalani","Chennai","Vadapalani");
			System.out.println("----------------------------------------");
			bloodBanksDetails.hospitalDetails("Meenakshi Hospital","Ambattur","Chennai","Ambattur");
			System.out.println("----------------------------------------");
			bloodBanksDetails.hospitalDetails("Military Hospital","Avadi","Chennai","Avadi");
			System.out.println("----------------------------------------");
			bloodBanksDetails.hospitalDetails("Aristo Hospital","Perambur","Chennai","Perambur");
			System.out.println("*****************************************");
		}else if(input.equals(input6)) {
			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
			bloodBanksDetails.bloodDonorsDetails("Vidhya","O+","Avadi",12345678l,"Chennai");
		}else if(input.equals(input7)) {
			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
			bloodBanksDetails.register();
		}else if(input.equals(input8)) {
			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
			bloodBanksDetails.login();
		}else if(input.equals(input9)) {
			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
			bloodBanksDetails.availableBloodBags();
		}else if(input.equals(input10)) {
			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
			bloodBanksDetails.diseaseTest();
		}else if(input.equals(input11)) {
			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
			bloodBanksDetails.matchingBloodGroupDetails();
		}else{
			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
			bloodBanksDetails.userDetails();
//			update();
			update1(name);
			read();
			delete();
//			insert();
//			testBloodBank.insert();
//			BloodBankImplement bloodBankImplement = new BloodBankImplement();
//			BloodBankImplement.insert();
//			TestBloodBank testBloodBank = new TestBloodBank();
			String bloodGroup = bloodBanksDetails.bloodGroup;
			test(bloodGroup,bloodBanksDetails.name);
//		}else {
			
		}
//		TestBloodBank testBloodBank = new TestBloodBank();


//		testBloodBank.insert();
		sc.close();	
	}
	
	public static void test(String bloodGroup,String name) throws ClassNotFoundException, SQLException {
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
			
		}	

		sc.close();
	}
	
//	  public static void insert() throws ClassNotFoundException, SQLException{		 
//		  	Connection connection = ConnectionUtil.getConnection();
//	        System.out.println(connection);
//	        System.out.println(name + bloodGroup);
//	        String save="insert into bloodbank (name,bloodgroup)  values (?,?)";
//	        PreparedStatement prepareStatement = connection.prepareStatement(save);
//	        prepareStatement.setString(1, name);
//	        prepareStatement.setString(2, bloodGroup);
//	        int rows = prepareStatement.executeUpdate();
//	        System.out.println(rows+"inserted");
//	    }
//	  public static void update() throws ClassNotFoundException, SQLException{		 
//		  	Connection connection = ConnectionUtil.getConnection();
//	        System.out.println(connection);
//	        System.out.println(name + bloodGroup);
//	        String save="UPDATE bloodbank SET name='Sana' WHERE id=2";
//	        PreparedStatement prepareStatement = connection.prepareStatement(save);
////	        prepareStatement.setString(2, name);
////	        prepareStatement.setString(2, bloodGroup);
//	        int rows = prepareStatement.executeUpdate();
//	        System.out.println(rows+" updated");
//	    }
//	  
	  public static void update1(String name) throws ClassNotFoundException, SQLException{		 
		  	Connection connection = ConnectionUtil.getConnection();
	        System.out.println(connection);
	        System.out.println("Updated Name:-");
	        System.out.println(name);
	        String save="UPDATE bloodbank SET name=? WHERE id=4";
	        PreparedStatement prepareStatement = connection.prepareStatement(save);
	        prepareStatement.setString(1, name);
	        int rows = prepareStatement.executeUpdate();
	        System.out.println(rows+" updated");
	    }
	  
	  public static void read() throws ClassNotFoundException, SQLException{		 
		  	Connection connection = ConnectionUtil.getConnection();
	        System.out.println(connection);
	        String save="SELECT * FROM bloodbank WHERE name='Angelin'";
	        PreparedStatement prepareStatement = connection.prepareStatement(save);
	        Statement stmt = connection.createStatement();
	    	ResultSet rows = stmt.executeQuery(save);
	    	while (rows.next()) {
                int id = rows.getInt("id");
                String name = rows.getString("name");
                String bloodGroup = rows.getString("bloodGroup");
                System.out.println("Retrieved Data");
                System.out.println("ID : " + id + "\t\t Name : " + name
                                   + "\t\t BloodGroup : " + bloodGroup);
            }
	        System.out.println(rows+" retrieved");
	    }
	  
	  public static void delete() throws ClassNotFoundException, SQLException {
			Connection connection = ConnectionUtil.getConnection();
	        System.out.println(connection);
	    	String query="DELETE from bloodbank where id=3"; 
	    	PreparedStatement prepareStatement = connection.prepareStatement(query);
	    	int rows = prepareStatement.executeUpdate();
	    	System.out.println(rows + " deleted");
	  }
	  
}
