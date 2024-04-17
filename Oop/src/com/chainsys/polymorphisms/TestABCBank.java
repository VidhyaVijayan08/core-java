package com.chainsys.polymorphisms;
public class TestABCBank {

    public static void main(String[] args) {
        ABCBank abcBank = new ABCBank();
        abcBank.getUserDetails();
        abcBank.printUserDetails();
        ABCBank.showAvailableSavingPlans();
        abcBank.deposit(4000);
        ABCBank.deposit(4000,5432675,20000);
        ABCBank.deposit(50000,537817,90000,12345678);
   
        
        BankB b=new BankB();
        b.details();
        b.display();
    }
}
