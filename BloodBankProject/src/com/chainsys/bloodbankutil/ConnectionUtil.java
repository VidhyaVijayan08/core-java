package com.chainsys.bloodbankutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.chainsys.bloodbankdao.BloodBanksDetails;

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
	//user
	public static void inserts(String username,String password) throws ClassNotFoundException, SQLException {
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
		 	username=BloodBanksDetails.username;
		 	System.out.println(name+ username1 + password1 + bloodGroups);
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
	
	public static void insert(String username, String password) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionUtil.getConnection();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your username");
	 	String username1=sc.next();
	 	System.out.println("Enter your password");
	 	String password1=sc.next();
//	 	username=BloodBanksDetails.use
	try {
		String query = "SELECT * FROM bloodbank WHERE username = ? AND password = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1,username1);
		preparedStatement.setString(2,password1);
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next()) {
			System.out.println("Login Successful!");
		}else {
			System.out.println("Username or Password incorrect!");
			inserts(username,password);
		}
		resultSet.close();
		preparedStatement.close();
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
	}
	
	public static void insertAdmin(String username, String password) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionUtil.getConnection();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your username");
	 	String username1=sc.next();
	 	System.out.println("Enter your password");
	 	String password1=sc.next();
//	 	username=BloodBanksDetails.use
	try {
		String query = "SELECT * FROM bloodbank WHERE username = ? AND password = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1,username1);
		preparedStatement.setString(2,password1);
		ResultSet resultSet = preparedStatement.executeQuery();
		if(resultSet.next()) {
			System.out.println("Login Successful!");
		}else {
			System.out.println("Username or Password incorrect!");
			inserts(username,password);
		}
		resultSet.close();
		preparedStatement.close();
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
	}
	
//	public static void delete(String username,String password) throws ClassNotFoundException, SQLException {
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
//	        String save="delete * from bloodbank values where id=2";
//	        PreparedStatement prepareStatement = connection.prepareStatement(save);
//	}
	
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
//	 	username=BloodBanksDetails.username;
	 	System.out.println(name+ username1 + password1 + bloodGroups + username + password);
        String save="delete * from bloodbank values where id=2";
        PreparedStatement prepareStatement = connection.prepareStatement(save);
	}
	public static void read() throws ClassNotFoundException, SQLException{		 
	  	Connection connection = ConnectionUtil.getConnection();
        System.out.println(connection);
        String save="SELECT * FROM bloodbank WHERE name='Santhini'";
        PreparedStatement prepareStatement = connection.prepareStatement(save);
        Statement stmt = connection.createStatement();
    	ResultSet rows = stmt.executeQuery(save);
    	while (rows.next()) {
            int id = rows.getInt("id");
            String name = rows.getString("name");
            String bloodGroup = rows.getString("bloodGroup");
            System.out.println("Retrieved Data");
            System.out.println("__________________________________________________________________________________");
            System.out.println("ID : " + id + "\t\t | \t Name : " + name + "\t\t | \t BloodGroup : " + bloodGroup);
            System.out.println("__________________________________________________________________________________");

        }
        System.out.println(rows+" retrieved");
    }
  
	public static void retreive() throws ClassNotFoundException, SQLException{		 
	  	Connection connection = ConnectionUtil.getConnection();
        System.out.println(connection);
        String save="SELECT * FROM bloodbank";
        PreparedStatement prepareStatement = connection.prepareStatement(save);
        Statement stmt = connection.createStatement();
    	ResultSet rows = stmt.executeQuery(save);
    	while (rows.next()) {
            int id = rows.getInt("id");
            String name = rows.getString("name");
            String bloodGroup = rows.getString("bloodGroup");
            System.out.println("Retrieved Data");
            System.out.println("__________________________________________________________________________________");
            System.out.println("ID : " + id + "\t\t Name : " + name  + "\t\t BloodGroup : " + bloodGroup);
            System.out.println("__________________________________________________________________________________");
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
  
  public static void update(String name) throws ClassNotFoundException, SQLException{	
	  Scanner sc = new Scanner(System.in); 
	  Connection connection = ConnectionUtil.getConnection();
      System.out.println(connection);
      System.out.println("Updated Name:-");
      System.out.println("Enter your name :");
      name =sc.next(); 
      String save="UPDATE bloodbank SET name=? WHERE id=4";
      PreparedStatement prepareStatement = connection.prepareStatement(save);
      prepareStatement.setString(1, name);
      int rows = prepareStatement.executeUpdate();
      System.out.println(rows+" updated");
  }
  
  
  //admin crud operation
 
  
  //update
  public static void updateAdmin(String name) throws ClassNotFoundException, SQLException{	
	  Scanner sc = new Scanner(System.in); 
	  Connection connection = ConnectionUtil.getConnection();
      System.out.println(connection);
      System.out.println("Updated Name:-");
      System.out.println("Enter your name :");
      name =sc.next(); 
      String save="UPDATE bloodbank SET name=? WHERE id=4";
      PreparedStatement prepareStatement = connection.prepareStatement(save);
      prepareStatement.setString(1, name);
      int rows = prepareStatement.executeUpdate();
      System.out.println(rows+" updated");
  }
  
  public static void insertsAdmin(String username,String password) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionUtil.getConnection();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Date :");
		String date = sc.next();
		System.out.println("Enter The Time :");
		String time = sc.next();
		System.out.println("Enter your Day :");
		String day = sc.next();
		System.out.println("Enter Your Venue :");
	 	String venue=sc.next();
	 	System.out.println("Enter your Approx Donor");
	 	String approxDonor=sc.next();
      String save="insert into camp (date,time,day,venue,Approx Donor)  values (?,?,?)";
      PreparedStatement prepareStatement = connection.prepareStatement(save);
      	prepareStatement.setString(1, date);
	        prepareStatement.setString(2, time);
	        prepareStatement.setString(3,day);
	        prepareStatement.setString(4,venue);
	        prepareStatement.setString(5, approxDonor);

	        int rows = prepareStatement.executeUpdate();
	        System.out.println(rows+" inserted");
}
  
  public static void adminUpdating()throws ClassNotFoundException, SQLException{	
	  Scanner sc = new Scanner(System.in); 
	  Connection connection = ConnectionUtil.getConnection();
      System.out.println(connection);
      System.out.println("Updated Name:-");
      System.out.println("Enter Location for Camp :");
      String location =sc.next(); 
      String save="UPDATE camp SET location=? WHERE id=4";
      PreparedStatement prepareStatement = connection.prepareStatement(save);
      prepareStatement.setString(1, location);
      int rows = prepareStatement.executeUpdate();
      System.out.println(rows+" updated");
  }
}
