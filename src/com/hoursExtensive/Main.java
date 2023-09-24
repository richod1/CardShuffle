package com.hoursExtensive;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public  void determinMax(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter tree floating point value sepreated by comma");

        double number1=input.nextDouble();
        double number2=input.nextDouble();
        double number3=input.nextDouble();

        double result=maximum(number1,number2,number3);

        System.out.println("the maximum number is " + result);

    }
    public double maximum(double num1,double num2,double num3){
        double newNum=num1;
        if(num2 > newNum){
            newNum=num2;
        }
        if(num3 > newNum){
            newNum=num3;
        }return newNum;
    }

    public static void main(String[] args){
//        Main obj=new Main();
//        obj.determinMax();
//        findRandoms();
////        myArrays();
//        initArray();
//        StringArray();
//        SortArrays();
//        searchBin();
//        MatrixArray();

        checkFrequency();
    }


//    dealing with randoms
    public static void findRandoms(){
        Random randomNumbers=new Random();
        int face;
        for(int counter=1;counter <= 20;counter++){
            face=1 + randomNumbers.nextInt(6);

            System.out.printf("%d", face);

            if(counter % 5 == 0)
                System.out.println();
        }
    }

//    starting arrays
    public static void myArrays(){
        int[] numbers=new int[20];
        for (int i=0;i<numbers.length;i++){
            System.out.println(i);
        }
    }
    public static void initArray(){
        int[] nums={2,3,4,5,6,7};
        System.out.println("numbers : " + nums[3]);
        for(int num: nums){
            System.out.println(num);
        }
    }
    public static void StringArray(){
        String[] names={"degraft","frimpong","kweku"};
        for(String name:names){
            System.out.println("single name is :" + name);
        }
    }
//    sort arrays
    public static void SortArrays(){
        int[] arr={3,2,5,7,2,9,10};
        Arrays.sort(arr);
        for (int arra:arr) {
            System.out.println(arra);

        }
    }
    public static void searchBin(){
        int[] arr={0,9,8,7,6,5,4,3,2,1};
        int index=Arrays.binarySearch(arr,4);
        System.out.println("value for index 4 is :" + index);
    }
    public static void MatrixArray(){
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12,13,14}};
        System.out.println(matrix[0][2]);
        for (int j=0;j<=matrix[2].length;j++){
            System.out.println("value of index 0 arrays are : " + j);
        }
        for (int matrixs:matrix[2]) {
            System.out.println("value of index 2 array are :" + matrixs);
        }
    }

//    student frequency analyzer
    public static void checkFrequency(){
        int[] responses={1,2,3,5,6,4,6,7,8,9,2,3,5,7,8,9,10,4,2,6,9,3,7,2,1,7,9};
        int frequecncy[]=new int[11];

        for(int counter=0;counter<responses.length;counter++){
            ++frequecncy[responses[counter]];
        }
        System.out.printf("%s%10s","Rating","Frequency");
        for(int count=0;count<frequecncy.length;count++){
            System.out.printf("%d%10d",count,frequecncy[count]);
        }
    }
}


//Card shuffling
