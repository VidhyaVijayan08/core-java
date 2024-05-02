//package com.chainsys.polymorphismjdbc;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//
//public class BloodBankImplement extends BloodBank{
//	
//	
//	  public static void insert() throws ClassNotFoundException, SQLException{
//		
//		  	
//	        Connection connection = ConnectionUtil.getConnection();
//	        System.out.println(connection);
//	        System.out.println(id + name + bloodGroup);
//	        String save="insert into bloodbank values (?, ?)";
//	        PreparedStatement prepareStatement = connection.prepareStatement(save);
//
//	        prepareStatement.setString(1, BloodBank.getName());
//	        prepareStatement.setString(2, BloodBank.getBloodGroup());
//	        int rows = prepareStatement.executeUpdate();
//	        System.out.println(rows+"inserted");
//	    }
//}
