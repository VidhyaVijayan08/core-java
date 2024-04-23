package com.chainsys.polymorphisms;

public class BloodBankB extends BloodBankA{
	public void bloodTest(int id) {
		System.out.println("Blood Test for this person ");
		System.out.println("Waiting Id is " + id);
	}
	public void bloodTesting(int id) {
		System.out.println("Blood Test Reports are Ready ");
		System.out.println("ID Number :" + id +" Collect your Reports" );
	}
}
