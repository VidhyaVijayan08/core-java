package com.chainsys.bloodbankmodel;

public class BloodBank {
	
	public static int id;
	public static String name;
	public static String bloodGroup;
	public static String username,username2,password2;
	public static String password;
	
	
	
	
public static int getId() {
		return id;
	}

	public static void setId(int id) {
		BloodBank.id = id;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		BloodBank.name = name;
	}

	public static String getBloodGroup() {
		return bloodGroup;
	}

	public static void setBloodGroup(String bloodGroup) {
		BloodBank.bloodGroup = bloodGroup;
	}

	public static String getUsername() {
		return username;
	}

	public static void setUsername(String username) {
		BloodBank.username = username;
	}

	public static String getUsername2() {
		return username2;
	}

	public static void setUsername2(String username2) {
		BloodBank.username2 = username2;
	}

	public static String getPassword2() {
		return password2;
	}

	public static void setPassword2(String password2) {
		BloodBank.password2 = password2;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		BloodBank.password = password;
	}
	
	

	//	public static int getId() {
//		return id;
//	}
//	public static void setId(int id) {
//		BloodBank.id = id;
//	}
//	public static String getName() {
//		return name;
//	}
//	public static void setName(String name) {
//		BloodBank.name = name;
//	}
//	public static String getBloodGroup() {
//		return bloodGroup;
//	}
//	public static void setBloodGroup(String bloodGroup) {
//		BloodBank.bloodGroup = bloodGroup;
//	}
//	public static String getUserName() {
//		return username;
//	}
//	public void setUserName(String username) {
//		BloodBank.username = username;
//	}
//	public static String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		BloodBank.password = password;
//	}
	public BloodBank() {
		
	}
	
	
	
	public BloodBank(int id, String name, String bloodGroup,String username, String password) {
		BloodBank.id = id;
		BloodBank.name = name;
		BloodBank.bloodGroup = bloodGroup;
		BloodBank.username = username;
		BloodBank.password = password;
	}
	@Override
	public String toString() {
		return "BloodBank [id=\" + id + \", name=\" + name + \", bloodGroup=\" + bloodGroup +\", username=" + username + ", password=" + password + "]";
	}	
	
	
	//Getters and Setters
//	public static int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public static String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public static String getBloodGroup() {
//		return bloodGroup;
//	}
//	public void setBloodgroup(String bloodGroup) {
//		this.bloodGroup = bloodGroup;
//	}
//	
//	public BloodBank() {
//		
//	}
//	
//	public BloodBank(int id, String name, String bloodGroup) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.bloodGroup = bloodGroup;
//	}
//	
//	//toString
//	@Override
//	public String toString() {
//		return "BloodBank [id=" + id + ", name=" + name + ", bloodGroup=" + bloodGroup + "]";
//	}
	
//	String userName;
//	String password;
//
//	public String getUserName() {
//		return userName;
//	}
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	
	
}
