package com.igordudek;

public class Main {

    public static void main(String[] args) {

//Create objects in BankAccount Class
        BankAccount johnSmith = new BankAccount();
        BankAccount kateRyan = new BankAccount();

//Fields initialization
        johnSmith.setCustomerName("John Smith");
        johnSmith.setAccountNumber("0098676545");
        johnSmith.setBalance(150420.5);
        johnSmith.setCustomerEmailAdress("johnsmith@gmail.com");
        johnSmith.setCustomerPhoneNumber("876-345-723");

        kateRyan.setCustomerName("Kate Ryan");
        kateRyan.setAccountNumber("6545898001");
        kateRyan.setBalance(25000.0);
        kateRyan.setCustomerEmailAdress("kateryan@hotmail.com");
        kateRyan.setCustomerPhoneNumber("435-987-341");

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
