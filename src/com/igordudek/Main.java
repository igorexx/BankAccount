package com.igordudek;

public class Main {

    public static void main(String[] args) {

//Create objects in BankAccount Class
        BankAccount johnSmith = new BankAccount("9876456754", 150000.0,
                "John Smith", "johnsmith@gmail.com", "6654-987-543");
        BankAccount kateRyan = new BankAccount("43257687664", 25000,
                "Kate Ryan", "kateryan@hotmail.com", "324-625-324");
        BankAccount robertDurst = new BankAccount("Robert Durst", "durst@yahoo.com", "73635-736-32873");

        VipCustomer donaldTrump = new VipCustomer();
        VipCustomer billGates = new VipCustomer("Bill Gates", "bill@gates.com");
        VipCustomer markZuckerberg = new VipCustomer("Mark Zuckerberg", 50000, "mark@facebook.com");


        johnSmith.depositFunds(40000.7);
        kateRyan.withdrawFunds(20000);

        johnSmith.clientInfo();
        kateRyan.clientInfo();
        robertDurst.clientInfo();

        System.out.println("VIP customers:");
        System.out.println(donaldTrump.getVipName() + " " + donaldTrump.getVipEmailAddress() + " credit limit: " +
                donaldTrump.getVipCreditLimit());
        System.out.println(billGates.getVipName() + " " + billGates.getVipEmailAddress() + " credit limit: " +
                billGates.getVipCreditLimit());
        System.out.println(markZuckerberg.getVipName() + " " + markZuckerberg.getVipEmailAddress() + " credit limit: " +
                markZuckerberg.getVipCreditLimit());

    }


}