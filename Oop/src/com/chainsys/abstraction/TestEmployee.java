package com.chainsys.abstraction;

public class TestEmployee {

	public static void main(String[] args) {
		 EmployeeDetail employeeDetail = new EmployeeDetail();
		 employeeDetail.getUserDetails();
		 employeeDetail.printUserDetails();
		 employeeDetail.working();
		 employeeDetail.working(10);
		 employeeDetail.working("Vidhya");
	
		 EmployeeB e2 = new EmployeeB();
		 e2.partTimeEmployee(10000);
		 e2.fullTimeEmployee(20000);
		 
		 DetailsEmployees detailsEmployees = new DetailsEmployees();
		 detailsEmployees.working();
		 detailsEmployees.working(10);
		 detailsEmployees.working("Santhini");
	}

}
