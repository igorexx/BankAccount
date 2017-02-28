package com.igordudek;

/**
 * Created by igor on 28.02.2017.
 */
public class BankAccount {

//Fields
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmailAdress;
    private String customerPhoneNumber;

//Setters and getters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber () {
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

    public void setCustomerEmailAdress(String customerEmailAdress) {
        this.customerEmailAdress = customerEmailAdress;
    }
    public String getCustomerEmailAdress() {
        return customerEmailAdress;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

//Deposit method
    public double depositFunds(double deposit) {
        balance = balance + deposit;
        return balance;

    }

//Withdrawal method
    public double withdrawFunds(double withdraw) {
        if (withdraw > balance) {
            System.out.println(customerName + " has insufficient funds");
            return balance;
        }
        else {
            balance = balance - withdraw;
            return balance;
        }
    }
}
