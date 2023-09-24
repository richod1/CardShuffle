package com.classandobjects;

import java.util.Scanner;

public class AdvanceControlStatements {
    public static int calculate(int num1,int num2){
        int result=num1+num2;
        return result;

    }
//    method overloading
    public static double calculate(double num1,double num2){
        double result=num1+num2;
        return result;
    }
    public static void main(String[] args){
AdvanceStatements101();
AdvanceStatement102();
MultiLoop();
LabelLoop();
Scanner input=new Scanner(System.in);
        System.out.println("input your first value ");
int num1=input.nextInt();
        System.out.println("input your second value ");
        int num2=input.nextInt();

calculate(num1,num2);

        System.out.println("input your first value ");
        double number1=input.nextDouble();
        System.out.println("input your second value ");
        double number2=input.nextDouble();
calculate(number1,number2);

int num=20;
String status=(num<=30)?"you are adult":"You are young";
        System.out.println(status);
    }
    public static void AdvanceStatements101(){
//        for each
        int[] number={2,3,4,5,6,7};
        for (int num:number) {
            System.out.println(num);
        }
    }
    public static void AdvanceStatement102(){
        int day=2;
       switch(day){
           case 1-> System.out.println("Sunday");
           case 2-> System.out.println("Monday");
           case 3-> System.out.println("Tuesday");
           default-> System.out.println("invalid choice");
       }
    }
    public static void MultiLoop(){
        int[][] matrix={{1,2,3,4,5},{2,4,6,8,10}};
        for(int[] row:matrix){
            for(int elem : row){
                System.out.println("Elements " + elem);
            }
            System.out.println(" ");

        }
    }
    public static void LabelLoop(){
        outerloop:
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i*j==6){
                    System.out.println("Breaking loop");
                    break outerloop;
                }
            }
        }
    }
}


class Person extends AdvanceControlStatements{
    String name;

    public Person(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }


    public static void main(String[] args){
        Scanner input=new Scanner(System.in);


    }
}