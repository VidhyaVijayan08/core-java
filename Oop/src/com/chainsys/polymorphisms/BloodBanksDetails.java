package com.chainsys.polymorphisms;

public class BloodBanksDetails extends BloodBanks{

	@Override
	public void testing(String name) {
		System.out.println("You can go to home " + name);
	}

}
