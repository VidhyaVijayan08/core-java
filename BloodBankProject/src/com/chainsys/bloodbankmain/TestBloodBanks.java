package com.chainsys.bloodbankmain;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.chainsys.bloodbankdao.BloodBanksDetails;
//import com.chainsys.bloodbankmodel.BloodBank;
import com.chainsys.bloodbankutil.ConnectionUtil;

public class TestBloodBanks extends BloodBanksDetails{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		String input1="1", input2="2",input3="existinguser", input4 = "newuser",input5;
		System.out.println("WELCOME TO BLOOD BANK ");
		System.out.println("1.admin\n2.user");
//		System.out.println("");
		String input=sc.next();
		if(input.equals(input1)) {
			System.out.println("Welcome To Admin Page");
			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
			bloodBanksDetails.admin();
		}else if(input.equals(input2)) {
			System.out.println("Welcome To User Page");
			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
			
			System.out.println("1. Existing User 2. New User");
			input5 = sc.next();
		
			if(input5.equals(input1)) {
//				bloodBanksDetails.login();
//				BloodBanksDetails.ins(BloodBanksDetails.username,BloodBanksDetails.password);
//				BloodBanksDetails.ins(username, password);
				ConnectionUtil.insert(username, password);
			}else if(input5.equals(input2)) {
				bloodBanksDetails.register();
//				ins(name,username,password);
			}else {
				System.out.println("Select any one of the option");
			}
			
		}
	}
	
	public static void insert() throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionUtil.getConnection();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.next();
		System.out.println("Enter your BloodGroup : ");
		String bloodGroup = sc.next();
		System.out.println("Enter your Username");
	}
	
//	public static void insert(String username,String password) throws ClassNotFoundException, SQLException {
//			Connection connection = ConnectionUtil.getConnection();
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Enter your name :");
//			String name = sc.next();
//			System.out.println("Enter Your BloodGroup :");
//		 	String bloodGroups=sc.next();
//		 	System.out.println("Enter your username");
//		 	String username1=sc.next();
//		 	System.out.println("Enter your password");
//		 	String password1=sc.next();
////		 	username=BloodBanksDetails.username;
//		 	System.out.println(name+ username1 + password1 + bloodGroups + username + password);
//	        String save="insert into bloodbank (name,bloodGroup,username,password)  values (?,?,?,?)";
//	        PreparedStatement prepareStatement = connection.prepareStatement(save);
//	        if(username1.equals(username) && password1.equals(password)) {
//	        	System.out.println("Already user");
//	        }else {
//	        	prepareStatement.setString(1, name);
//	  	        prepareStatement.setString(2, bloodGroups);
//	  	        prepareStatement.setString(3,username);
//	  	        prepareStatement.setString(4,password);
//	  	        int rows = prepareStatement.executeUpdate();
//	  	        System.out.println(rows+" inserted");
//	        }
//   }
}
