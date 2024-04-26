package com.chainsys.polymorphismsupdate;

public class BloodBankD implements BloodBankC {
 
	@Override
	public void test() {
		System.out.println("Checking For Your blood Group ");
	}

	@Override
	public void testing(int id) {
		System.out.println("Your blood Group matched");
	}

	@Override
	public void bloodTest(String name) {
		System.out.println("1 blood packet used by " + name);
	}

}
