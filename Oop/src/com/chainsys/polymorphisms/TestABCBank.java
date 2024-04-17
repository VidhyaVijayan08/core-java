package com.chainsys.polymorphisms;
public class TestABCBank {

    public static void main(String[] args) {
        ABCBank abcbank = new ABCBank();
        abcbank.getUserDetails();
        abcbank.printUserDetails();
        ABCBank.showAvailableSavingPlans();
        ABCBank.deposit(4000,5432675,20000);
        ABCBank.deposit(50000,537817,90000,12345678);
   
//        BankA a=new BankA();
//        a.details();
//        a.display();
//        BankB b=new BankB();
//        b.details();
//        b.display();
    }
}
