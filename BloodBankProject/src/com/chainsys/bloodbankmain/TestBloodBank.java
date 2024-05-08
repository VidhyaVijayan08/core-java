package com.chainsys.bloodbankmain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.chainsys.bloodbankdao.BloodBankB;
import com.chainsys.bloodbankdao.BloodBankD;
//import com.chainsys.bloodbankdao.BloodBankDetails;
//import com.chainsys.bloodbankdao.BloodBankImplement;
//import com.chainsys.bloodbankdao.BloodBanks;
import com.chainsys.bloodbankdao.BloodBanksDetails;
import com.chainsys.bloodbankutil.ConnectionUtil;

public class TestBloodBank extends BloodBanksDetails {
//	private static String name2;
 	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		TestBloodBank testBloodBank = new TestBloodBank();
//		Scanner sc = new Scanner(System.in);		
		System.out.println("Do you have an account ? (yes/no/student/admin/transaction/hospital/donordetails/register/login/availabilitydetails/test/matchingbloodgroupdetails)");
		String input = sc.next();
		String input1 ="admin",input2 ="user";
		if(input.equals(input1)) {
			System.out.println("Welcome To Admin Page");
			System.out.println("**********************");
			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
			bloodBanksDetails.admin();
		}else if(input.equals(input2)){
			System.out.println("Welcome To User Page");
			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
			System.out.println("Enter Type");
			System.out.println("1.student \n 2.donor \n 3. donordetails");
			String type1="student", type2="donor", type3 = "donordetails";
//			inserts(bloodBanksDetails.name,username,password,username1,password1);
//			bloodBanksDetails.userDetails();
			bloodBanksDetails.register();
			insert(bloodBanksDetails.username,password);

			bloodBanksDetails.userDetails();
			
		}
		
//		String inputs = "yes", input2 = "student", input3="admin", input4="transaction", input5="hospital", input6 = "donordetails", input7="register", input8="login", input9="availabilitydetails", input10="test", input11="matchingbloodgroupdetails";

		//		if(input.equals(inputs)) {
//			System.out.println("You are going to donate blood");
//			String input1 = sc.next();
//			if(input1.equals(inputs)) {
//				System.out.println("Please Enter Your Id :");
//				int unit,unit1=300,unit2=200,unit3=250,id1=5, id=sc.nextInt();
//				System.out.println("Please Enter Your Name : ");
//				String name1="Vidhya", name = sc.next();
//				System.out.println("Please Enter Your PhoneNumber : ");
//				long phonenumber1 =1234565432l, phoneNumber = sc.nextLong();
//				if(id==id1 && name.equals(name1) && phoneNumber == phonenumber1 ) {
//					System.out.println("Confirmation Successfull");
//					System.out.println("Please Enter your age");
//					int age = sc.nextInt();
//					if(age>=18) {
//						System.out.println("How Much Do you want to donate");
//						unit=sc.nextInt();
//						if(unit==unit1) {
//							System.out.println("Unit Of Blood Taken");
//						 }else if(unit==unit2) {
//							 System.out.println("Unit Of Blood Taken");
//						 }else if(unit==unit3) {
//							 System.out.println("Unit Of Blood Taken");
//						 }else if(unit!=unit1 || unit!=unit2 || unit!=unit3){
//							 System.out.println("Sorry! Here we collect this much unit only because for donor's health concern.");
//						 }
//						 int donateBlood = sc.nextInt();
//						 if(donateBlood == 200) {
//							 System.out.println("You Have Finished Your Blood Donation And You Have Donated " + donateBlood);
//							 System.out.println("Thank You For Doing This Service");
//						 }else if(donateBlood == 250) {
//							 System.out.println(donateBlood + "ml finished blood donation");
//							 System.out.println("Thank You For Doing This Service");
//						 }else if(donateBlood == 300) {
//							 System.out.println("You Have Finished Your Blood Donation And You Have Donated " + donateBlood);
//							 System.out.println("Thank You For Doing This Service");
//						 }
//					}else {
//						System.out.println("Sorry, You Cannot Donate Blood");
//					}
//					
//				 }else {
//					 System.out.println("Sorry, No Records Found!");
//				 }
//			 }else {
//				 
//				 System.out.println("User have only allowed to donate");
//				 System.out.println("If you need blood please login again !Enter as a new login");
//			 }
//		}else if(input.equals(input2)) {
//			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
//			bloodBanksDetails.displayDetails();
//		}else if(input.equals(input3)){
//			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
////			bloodBanksDetails.admin();
//			 insertadmin(bloodBanksDetails.username1,bloodBanksDetails.password1);
////			BloodBankImplement bloodBankImplement = new BloodBankImplement();
////			bloodBankImplement.adminInsert(adminId,adminName);
////			insertAdminDetails(name,username,password,bloodGroup);
////			 readAdminDetails();
////			inserts(aid,aname,bloodGroup);
//		}else if(input.equals(input4)) {
//			 System.out.println("**********************************");
//			 System.out.println(" Daily transaction for blood bank");
//			 System.out.println("**********************************");
//			 BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
//			 bloodBanksDetails.transaction(1, "Vidhya", "O+","22-04-2024");
//			 System.out.println("--------------------");
//			 bloodBanksDetails.transaction(2, "Santhini", "O+","22-04-2024");
//			 System.out.println("--------------------");
//			 bloodBanksDetails.transaction(3, "Swarna", "A+", "23-04-2024");
//			 System.out.println("--------------------");
//			 bloodBanksDetails.transaction(4, "Sangeetha", "A-","20-04-2024");
//			 System.out.println("--------------------");
//			 bloodBanksDetails.transaction(5, "Swetha", "AB-","24-04-2024");
//			 System.out.println("**********************************");
//		}else if(input.equals(input5)) {
//			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
//			System.out.println("****************************************");
//			System.out.println("   Hospital Details For Blood Donation     ");
//			System.out.println("****************************************");
//			bloodBanksDetails.hospitalDetails("Apolo Hospital","Avadi","Chennai","Avadi");
//			System.out.println("----------------------------------------");
//			bloodBanksDetails.hospitalDetails("Vijaya Hospital ","Vadapalani","Chennai","Vadapalani");
//			System.out.println("----------------------------------------");
//			bloodBanksDetails.hospitalDetails("Meenakshi Hospital","Ambattur","Chennai","Ambattur");
//			System.out.println("----------------------------------------");
//			bloodBanksDetails.hospitalDetails("Military Hospital","Avadi","Chennai","Avadi");
//			System.out.println("----------------------------------------");
//			bloodBanksDetails.hospitalDetails("Aristo Hospital","Perambur","Chennai","Perambur");
//			System.out.println("*****************************************");
//		}else if(input.equals(input6)) {
//			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
//			bloodBanksDetails.bloodDonorsDetails("Vidhya","O+","Avadi",12345678l,"Chennai");
//		}else if(input.equals(input7)) {
//			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
//			bloodBanksDetails.register();
//			insert(username,password);
//		}else if(input.equals(input8)) {
//			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
//			bloodBanksDetails.login();
//			inserts(name,username,password,username1,password1);
//		}else if(input.equals(input9)) {
//			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
//			bloodBanksDetails.availableBloodBags();
//		}else if(input.equals(input10)) {
//			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
//			bloodBanksDetails.diseaseTest();
//		}else if(input.equals(input11)) {
//			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
//			bloodBanksDetails.matchingBloodGroupDetails();
//		}else{
//			BloodBanksDetails bloodBanksDetails = new BloodBanksDetails();
//			bloodBanksDetails.userDetails();
////			update();
//			update1(name);
//			read();
//			delete();
////			insert();
////			testBloodBank.insert();
////			BloodBankImplement bloodBankImplement = new BloodBankImplement();
////			BloodBankImplement.insert();
////			TestBloodBank testBloodBank = new TestBloodBank();
//			String bloodGroup = bloodBanksDetails.bloodGroup;
//			test(bloodGroup,bloodBanksDetails.name);
////		}else {
//			
//		}
////		TestBloodBank testBloodBank = new TestBloodBank();
//
//
////		testBloodBank.insert();
//		sc.close();	
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
//	public static void insert(String username,String password) throws SQLException, ClassNotFoundException {
//		Connection connection = ConnectionUtil.getConnection();
//		 System.out.println(connection);
////		 	Scanner sc=new Scanner(System.in);
//		 	String bloodGroup = "O+";
//		 	System.out.println(name + username + password + bloodGroup);
//	        String save="insert into bloodbank (name,username,password,bloodGroup)  values (?,?,?,?)";
//	        PreparedStatement prepareStatement = connection.prepareStatement(save);
//	        prepareStatement.setString(1, name);
//	        prepareStatement.setString(2, username);
//	        prepareStatement.setString(3,password);
//	        prepareStatement.setString(4, bloodGroup);
//	        int rows = prepareStatement.executeUpdate();
//	        System.out.println(rows+"inserted");
//		
//	}
//	public static void inserts(String username1,String password1) throws SQLException, ClassNotFoundException {
//		Connection connection = ConnectionUtil.getConnection();
//		 System.out.println(connection);
//		 	Scanner sc=new Scanner(System.in);
//		 	String bloodGroup = "O+";
//		 	System.out.println(name + username1 + password1+ bloodGroup);
//	        String save="insert into bloodbank (name,username,password,bloodGroup)  values (?,?,?,?)";
//	        PreparedStatement prepareStatement = connection.prepareStatement(save);
//	        prepareStatement.setString(1, name);
//	        prepareStatement.setString(2, username);
//	        prepareStatement.setString(3,password);
//	        prepareStatement.setString(4, bloodGroup);
//	        int rows = prepareStatement.executeUpdate();
//	        System.out.println(rows+"inserted");
//		
//	}
	
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
	
	public static void insert(String username,String password) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionUtil.getConnection();
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter your bloodgroup");
		String bloodGroups =sc.next();
		System.out.println("Enter your username");
		String username2= sc.next();
		System.out.println("Enter your password");
		String password2 = sc.next();
		System.out.println(name+ username2 + password2 +bloodGroups + BloodBanksDetails.username + password);
		 String save="insert into bloodbank (name,username,password,bloodGroup)  values (?,?,?,?)";
	        PreparedStatement prepareStatement = connection.prepareStatement(save);
	        if(username.equals(username1)&& password.equals(password1)) {
	        	System.out.println("Already user");
	        }else {
	        	prepareStatement.setString(1, name);
	  	        prepareStatement.setString(2, username2);
	  	        prepareStatement.setString(3,password2);
	  	        prepareStatement.setString(4, bloodGroup);
	  	        int rows = prepareStatement.executeUpdate();
	  	        System.out.println(rows+"inserted");
	        }
	}
	
	public static void inserts(String name,String username,String password,String username1,String password1) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionUtil.getConnection();
//		 System.out.println(connection);
//		 	Scanner sc=new Scanner(System.in);
//		 	System.out.println("Enter Your Name :");
//		 	String name=sc.next();
		 	System.out.println("Enter Your BloodGroup :");
		 	String bloodGroup=sc.next();
		 	System.out.println(name+ username1 + password1 + bloodGroup + username + password);
	        String save="insert into bloodbank (name,username,password,bloodGroup)  values (?,?,?,?)";
	        PreparedStatement prepareStatement = connection.prepareStatement(save);
	        if(username.equals(username1) && password.equals(password1)) {
	        	System.out.println("Already user");
	        }else {
	        	prepareStatement.setString(1, name);
	  	        prepareStatement.setString(2, username1);
	  	        prepareStatement.setString(3,password1);
	  	        prepareStatement.setString(4, bloodGroup);
	  	        int rows = prepareStatement.executeUpdate();
	  	        System.out.println(rows+"inserted");
	        }

	}
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
	 
	  
	  public static void inserts(int aid,String aname,String bloodGroup) throws ClassNotFoundException, SQLException {
		  Connection connection = ConnectionUtil.getConnection();
//		  Scanner sc= new Scanner(System.in);
		  System.out.println(connection);
		  System.out.println("Enter your bloodGroup");
		  String bloodGroup1=sc.next();
		  System.out.println(adminId + adminName + bloodGroup1);
		  String save = "insert into bloodbank (id,name,bloodGroup) values(?,?,?) ";
		  PreparedStatement prepareStatement = connection.prepareStatement(save);
			if(adminId==aid && adminName.equals(aname)) {
				prepareStatement.setInt(1, aid);
	  	        prepareStatement.setString(2, aname);
	  	        prepareStatement.setString(3, bloodGroup);
	  	        int rows = prepareStatement.executeUpdate();
	  	        System.out.println(rows+"inserted");
			}else {
				System.out.println("Invalid Data");
			}
	  }
	  
	  public static void insert(int aid,String aname,String bloodGroup) throws ClassNotFoundException, SQLException {
		  Connection connection = ConnectionUtil.getConnection();
//		  Scanner sc= new Scanner(System.in);
		  System.out.println(connection);
		  System.out.println("Enter your bloodGroup");
		  String bloodGroup1=sc.next();
		  System.out.println(adminId + adminName + bloodGroup1);
		  String save = "insert into bloodbank (id,name,bloodGroup) values(?,?,?) ";
		  PreparedStatement prepareStatement = connection.prepareStatement(save);
			if(adminId==aid && adminName.equals(aname)) {
				prepareStatement.setInt(1, aid);
	  	        prepareStatement.setString(2, aname);
	  	        prepareStatement.setString(3, bloodGroup);
	  	        int rows = prepareStatement.executeUpdate();
	  	        System.out.println(rows+"inserted");
			}else {
				System.out.println("Invalid Data");
			}
	  }
	  
	  
	  
//	  public static void ins(String name) {
//		  BloodBankDetails b =new BloodBankDetails();
//		  name2 = b.name;
//		  System.out.println(name2);
//	  }
	  
	  //Admin CRUD Operations
	  //1. Insert Operation
	  public static void insertAdminDetails(String name,String username,String password,String bloodGroup) throws ClassNotFoundException, SQLException {
		  Connection connection = ConnectionUtil.getConnection();
//		  Scanner sc= new Scanner(System.in);
//		  System.out.println(connection);
	        String save="insert into bloodbank (name,username,password,bloodGroup)  values (?,?,?,?)";
//		  String save = "insert into bloodbank (name) values (?)  ";
		  PreparedStatement prepareStatement = connection.prepareStatement(save);
		  if(adminId==aid && adminName.equals(aname)) {
			 String name1="Vidhya",username1="Vidhyaa@08",password1="Sudha",bloodGroup1="O+";
//			 name=name1,username=username1;
	  	        prepareStatement.setString(1, name);
	  	        prepareStatement.setString(2, username);
	  	        prepareStatement.setString(3, password);
	  	        prepareStatement.setString(4, bloodGroup);
	  	        int rows = prepareStatement.executeUpdate();
	  	        System.out.println(rows+"inserted");
			}else {
				System.out.println("Invalid Data");
			}
	  }
	  
	  //2.Read Operation
	  public static void readAdminDetails() throws ClassNotFoundException, SQLException{		 
		  	Connection connection = ConnectionUtil.getConnection();
	        System.out.println(connection);
	        String save="SELECT * FROM bloodbankadmin WHERE name='Vidhya'";
	        PreparedStatement prepareStatement = connection.prepareStatement(save);
	        Statement stmt = connection.createStatement();
	    	ResultSet rows = stmt.executeQuery(save);
	    	while (rows.next()) {
              int id = rows.getInt("id");
              String name = rows.getString("name");
              System.out.println("Retrieved Data");
              System.out.println("ID : " + id + "\t\t Name : " + name);
          }
	        System.out.println(rows+" retrieved");
	    }
	  
	  //3.update operation
	  public static void updateAdminDetails(String name) throws ClassNotFoundException, SQLException{		 
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
	  
	  
	  //insert operation
//		static Scanner sc = new Scanner(System.in);
	  public static void insertadmin(String username1, String password1) throws ClassNotFoundException, SQLException {
		
			 Connection connection = ConnectionUtil.getConnection();
			  System.out.println("Enter your name :");
			  String name=sc.next();
			  System.out.println(name);
			  System.out.println("Enter your username : ");
			  String username = sc.next();
			  System.out.println(username);
			  System.out.println("Enter your password :");
			  String password = sc.next();
			  System.out.println(password);
			  System.out.println("Enter your bloodGroup :");
			  String bloodGroup = sc.next();
			  System.out.println(bloodGroup);
		      String save="insert into bloodbank (name,username,password,bloodGroup)  values (?,?,?,?)";
		      PreparedStatement prepareStatement = connection.prepareStatement(save);
			  if(username.equals(username1)&& password.equals(password1)) {
				    prepareStatement.setString(1, getName());
		  	        prepareStatement.setString(2, getUserName());
		  	        prepareStatement.setString(3, password);
		  	        prepareStatement.setString(4, bloodGroup);
		  	        int rows = prepareStatement.executeUpdate();
		  	        System.out.println(rows+"inserted");
			  }else {
					System.out.println("Invalid Data");
			  }  
		 }
	}
	  


