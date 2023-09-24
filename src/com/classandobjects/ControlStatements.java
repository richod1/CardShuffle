package com.classandobjects;

import java.util.Scanner;

public class ControlStatements {
    public static void CheckScore(){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome to score app");
        int score;
        System.out.println("input your score here :");
        score=input.nextInt();

        if(score <= 49){
            System.out.println("You have failed the exam go for resit");
        }else if(score < 50){
            System.out.println("You have failed the exam");
        }else{
            System.out.println("You have pass in the exam");
        }
    }
    public static void CalAge(){
        Scanner input=new Scanner(System.in);
        System.out.println("input your age");
        int age=input.nextInt();
        if(age >= 18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("you are not eligible to vote");
        }

    }
    public static void main(String[] args){
        CalAge();
      CheckScore();
      Statement();
      loops();
      WhileLoops();
      DoWhileLoops();
      BranchStatements();
      BranchStatementContinue();
      ControlStatements obj=new ControlStatements();
      Scanner input=new Scanner(System.in);
      int a=input.nextInt();
      int b=input.nextInt();
      obj.add(a,b);
  }
    public static void Statement(){
        Scanner input=new Scanner(System.in);
        System.out.println("PLs input your number");
        int number=input.nextInt();
        if(number % 2 == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("number is odd");
        }
    }
    public static void loops(){
//        iteration using for loops
        for (int i=0;i<=5;i++){
            System.out.println("User iterations " + i);
        }
    }
    public static void WhileLoops(){
        int count=0;
        while(count <5){
            System.out.println("Count" +count);
            count++;
        }
    }
    public static void DoWhileLoops(){
        int Number=1;
        do {
            System.out.println("Number " + Number);
            Number++;
        }while(Number <=5);
    }
//    branching statements
    public static void BranchStatements(){
        for(int i=0;i<=10;i++){
            if(i == 5){
                break;
            }
            System.out.println("iterator" + i);
        }
    }
    public static void BranchStatementContinue(){
        for(int i=0;i<=20;i++){
            if(i == 10){
                continue;
            }
            System.out.println("Iterations " + i);
        }
    }
    public int add(int num1,int num2){
        int result=num1+num2;
        return result;
    }
}
