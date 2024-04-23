package com.chainsys.abstraction;

public class DetailsEmployees implements DetailEmployee{
	
	int developerSalary=20000,testerSalary=15000;
	public void working() {
		System.out.println("Working as Software Developer ");
		System.out.println("Developer Salary " + developerSalary);
		System.out.println("Annual Salary for Developer" + developerSalary*12);
	}
	
	public void working(int id) {
		System.out.println("Working as Software Tester " + testerSalary);
		System.out.println("Annual Salary for Tester");
	}
	
	public void working(String name) {
		System.out.println("Working in IT Sector");
		System.out.println();
	}
}
