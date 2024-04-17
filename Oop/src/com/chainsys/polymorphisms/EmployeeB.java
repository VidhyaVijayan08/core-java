package com.chainsys.polymorphisms;

public class EmployeeB extends EmployeeA{
	public void partTimeEmployee(int salary) {
		System.out.println("Salary For Part Time Job");
		System.out.println("salary is " + salary);
	}
	public void fullTimeEmployee(int salary) {
		System.out.println("Salary For Full Time Job");
		System.out.println("salary is " + salary);
	}
}
