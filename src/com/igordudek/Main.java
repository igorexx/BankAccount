package com.igordudek;

public class Main {

    public static void main(String[] args) {

//Create objects in BankAccount Class
        BankAccount johnSmith = new BankAccount("9876456754", 150000.0,
                "John Smith", "johnsmith@gmail.com", "6654-987-543");
        BankAccount kateRyan = new BankAccount("43257687664", 25000,
                "Kate Ryan", "kateryan@hotmail.com", "324-625-324");


        johnSmith.depositFunds(40000.7);
        kateRyan.withdrawFunds(40000);

        System.out.println(johnSmith.getCustomerName());
        System.out.println("Account Number " + johnSmith.getAccountNumber());
        System.out.println("Phone Number " + johnSmith.getCustomerPhoneNumber() + " e-mail " + johnSmith.getCustomerEmailAdress());
        System.out.println("Balance : " + johnSmith.getBalance());

        System.out.println(kateRyan.getCustomerName());
        System.out.println("Account Number " + kateRyan.getAccountNumber());
        System.out.println("Phone Number " + kateRyan.getCustomerPhoneNumber() + " e-mail " + kateRyan.getCustomerEmailAdress());
        System.out.println("Balance : " + kateRyan.getBalance());

    }

}
