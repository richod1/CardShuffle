package com.classandobjects;

import java.util.Scanner;

public class MainBankAccount {
    public static void main(String[] args){
        BankAccount accountOne=new BankAccount(50.00);
        BankAccount accountTwo=new BankAccount(-7.53);

        System.out.println("account 1 balance is $"+accountOne.getBalance());
        System.out.println("account 2 balance is $"+ accountTwo.getBalance());

        Scanner input=new Scanner(System.in);
        double depositAmount;

        System.out.println("Enter deposit amount for account 1");
        depositAmount=input.nextDouble();

        System.out.println("adding deposit to account " + depositAmount);
        accountOne.credit(depositAmount);

        System.out.println("Account ONe balance is " + accountOne.getBalance());
        System.out.println("Account Two balance is " + accountTwo.getBalance());

        System.out.println("Enter deposit amount for account Two");
        depositAmount= input.nextDouble();
        System.out.println("adding deposit amount to account" + depositAmount);
        accountTwo.credit(depositAmount);

        System.out.println("Account one balance is " + accountOne.getBalance());
        System.out.println("Account two balance is " + accountTwo.getBalance());
    }
}
