package com.igordudek;

public class Main {

    public static void main(String[] args) {

//Create objects in BankAccount Class
        BankAccount johnSmith = new BankAccount("9876456754", 150000.0,
                "John Smith", "johnsmith@gmail.com", "6654-987-543");
        BankAccount kateRyan = new BankAccount("43257687664", 25000,
                "Kate Ryan", "kateryan@hotmail.com", "324-625-324");


        johnSmith.depositFunds(40000.7);
        kateRyan.withdrawFunds(20000);

        johnSmith.clientInfo();
        kateRyan.clientInfo();

    }
}

