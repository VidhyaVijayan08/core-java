package com.chainsys.abstraction;

public class DetailsEmployees implements DetailEmployee{
	public void working() {
		System.out.println("Working as Software Developer");
	}
	
	public void working(int id) {
		System.out.println("Working as Software Tester");
	}
	
	public void working(String name) {
		System.out.println("Working in IT Sector");
	}
}
