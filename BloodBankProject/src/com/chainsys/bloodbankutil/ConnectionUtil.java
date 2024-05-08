package com.chainsys.bloodbankutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnectionUtil {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection = getConnection();
		System.out.println(connection);
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/bloodbanks","root","Welcome#78");
		return connection;
	}
	
	public static void insert(String username,String password) throws ClassNotFoundException, SQLException {
			Connection connection = ConnectionUtil.getConnection();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name :");
			String name = sc.next();
			System.out.println("Enter Your BloodGroup :");
		 	String bloodGroups=sc.next();
		 	System.out.println("Enter your username");
		 	String username1=sc.next();
		 	System.out.println("Enter your password");
		 	String password1=sc.next();
//		 	username=BloodBanksDetails.username;
		 	System.out.println(name+ username1 + password1 + bloodGroups + username + password);
	        String save="insert into bloodbank (name,bloodGroup,username,password)  values (?,?,?,?)";
	        PreparedStatement prepareStatement = connection.prepareStatement(save);
	        if(username1.equals(username) && password1.equals(password)) {
	        	System.out.println("Already user");
	        }else {
	        	prepareStatement.setString(1, name);
	  	        prepareStatement.setString(2, bloodGroups);
	  	        prepareStatement.setString(3,username1);
	  	        prepareStatement.setString(4,password1);
	  	        int rows = prepareStatement.executeUpdate();
	  	        System.out.println(rows+" inserted");
	        }
	}
	
	public static void delete(String username,String password) throws ClassNotFoundException, SQLException {
			Connection connection = ConnectionUtil.getConnection();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name :");
			String name = sc.next();
			System.out.println("Enter Your BloodGroup :");
		 	String bloodGroups=sc.next();
		 	System.out.println("Enter your username");
		 	String username1=sc.next();
		 	System.out.println("Enter your password");
		 	String password1=sc.next();
//		 	username=BloodBanksDetails.username;
		 	System.out.println(name+ username1 + password1 + bloodGroups + username + password);
	        String save="delete * from bloodbank values where id=2";
	        PreparedStatement prepareStatement = connection.prepareStatement(save);
	}
}
