package com.chainsys.polymorphisms;

public class TestEmployee {

	public static void main(String[] args) {
		 EmployeeDetails employeeDetails = new EmployeeDetails();
		 employeeDetails.getUserDetails();
		 employeeDetails.printUserDetails();
		 employeeDetails.working();
		 employeeDetails.working(10);
		 
	
		 EmployeeB e2 = new EmployeeB();
		 e2.partTimeEmployee(10000);
		 e2.fullTimeEmployee(20000);
	}

}
