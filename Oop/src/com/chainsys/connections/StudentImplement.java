package com.chainsys.connections;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentImplement{

	   public static void main(String args[]) throws ClassNotFoundException, SQLException {
		   StudentImplement studentImplement = new StudentImplement();
		   Student student = new Student (2,"Sandhya","Chennai");
//		   studentImplement.insertStudent();
		   studentImplement.updateStudent();
		   studentImplement.deleteStudent();
		   studentImplement.readStudent();
	   }
//	    public void insertStudent() throws ClassNotFoundException, SQLException{
//	        Connection connection = ConnectionUtil.getConnection();
//	        System.out.println(connection);
//	        String save="insert into student (id,name, address) values (3,'Swarna', 'chennai')";
//	        PreparedStatement prepareStatement = connection.prepareStatement(save);
//	        int rows = prepareStatement.executeUpdate();
//	        System.out.println(rows+"inserted");
//	    }
	    
	    public void updateStudent() throws ClassNotFoundException, SQLException {
	    	Connection connection = ConnectionUtil.getConnection();
	    	System.out.println(connection);
	    	 String save="UPDATE student SET name='Santhini' WHERE id=2";
		        PreparedStatement prepareStatement = connection.prepareStatement(save);
		        int rows = prepareStatement.executeUpdate();
		        System.out.println(rows+" updated");
	    }
	    
	    public void deleteStudent() throws ClassNotFoundException, SQLException {
	    	Connection connection = ConnectionUtil.getConnection();
	    	System.out.println(connection);
	    	String query="DELETE from student where id=3"; 
	    	PreparedStatement prepareStatement = connection.prepareStatement(query);
	    	int rows = prepareStatement.executeUpdate();
	    	System.out.println(rows + " deleted");
	    }
	    
	    public void readStudent() throws ClassNotFoundException, SQLException {
	    	Connection connection = ConnectionUtil.getConnection();
	    	System.out.println(connection);
	    	String query="SELECT * FROM student WHERE name='Santhini'"; 
	    	PreparedStatement prepareStatement = connection.prepareStatement(query);
	    	Statement stmt = connection.createStatement();
	    	ResultSet rows = stmt.executeQuery(query);
	        System.out.println("id\t\tname\t\taddress");
	        while (rows.next()) {
	        	 
                int id = rows.getInt("id");
                String name = rows.getString("name");
                String address = rows.getString("address");
                System.out.println(id + "\t\t" + name
                                   + "\t\t" + address);
            }
	    	System.out.println(rows+ " selected");
	    }
	  
}
