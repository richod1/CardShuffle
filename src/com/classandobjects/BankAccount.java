package com.classandobjects;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance){
        if(initialBalance > 0.0){
            balance = initialBalance;
        }
    }
    public void credit(double amount){
        balance=balance+amount;
    }

    public double getBalance(){
        return balance;
    }
}
