package com.chainsys.abstraction;

public class EmployeeDetail extends EmployeeDetails{

	int salary=20000;
	@Override
	public void working(String name) {
		System.out.println(name + " is working in IT Sector");
		System.out.println("Annual Salary : "+salary*12);
	}
	
}
