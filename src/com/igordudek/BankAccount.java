package com.igordudek;

/**
 * Created by igor on 28.02.2017.
 */
public class BankAccount {

    //Fields
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;


    //Constructor
    public BankAccount(String accountNumber, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public BankAccount(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("6353648", 10000.0, customerName, customerEmailAddress, customerPhoneNumber);
    }


    //Setters and getters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    //Deposit method
    public void depositFunds(double deposit) {
        this.balance += deposit;
        System.out.println(deposit + " deposit for " + this.customerName + " has been processed. New balance: " + this.balance);

    }

    //Withdrawal method
    public void withdrawFunds(double withdraw) {
        if (withdraw > this.balance) {
            System.out.println(customerName + " has only " + this.balance + ". Withdrawal not processed. Balance: " + this.balance);
        } else {
            this.balance -= withdraw;
            System.out.println(withdraw + " withdraw for " + this.customerName + " has been processed. New balance: " + this.balance);
        }
    }

    //Client info print method
    public void clientInfo() {
        System.out.println("**********************");
        System.out.println("Client info:");
        System.out.println("");
        System.out.println(this.customerName);
        System.out.println("Account number " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
        System.out.println("Phone number: " + this.customerPhoneNumber + " e-mail address: " + this.customerEmailAddress);
        System.out.println(" ");
    }
}
