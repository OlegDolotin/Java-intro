package com.hillel.javaintro.lessons.Lesson4;


import java.util.Scanner;
import java.util.Random;

public class Homework {
    public static void main(String[] args) {
        System.out.println("Enter the number of the Month (if else)");
        int n ;
        Scanner read =new Scanner(System.in);
        n = read.nextInt();
        if(n<1|n>12){
            System.out.println("Error, such month don't exist");
        }else if(n==1){
            System.out.println("January");
        }else if(n==2){
            System.out.println("February");
        }else if(n==3){
            System.out.println("March");
        }else if(n==4){
            System.out.println("April");
        }else if(n==5){
            System.out.println("May");
        }else if(n==6){
            System.out.println("June");
        }else if(n==7){
            System.out.println("July");
        }else if(n==8){
            System.out.println("August");
        }else if(n==9){
            System.out.println("September");
        }else if(n==10){
            System.out.println("October");
        }else if(n==11){
            System.out.println("November");
        }else if(n==12){
            System.out.println("December");
        }


        System.out.println("Enter the number of the Month (switch)");
        n = read.nextInt();
        switch(n){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case  8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Error, such month don't exist");
                break;
        }


        System.out.println("Cycle for");
        int [] num = new int [1000];
        Random rand =new Random();

        for(int i = 0; i < 1000; i++){
            num[i]=rand.nextInt(150);
        }
        int count = 0;
        for(int i = 0; i < 1000; i++){
            if(num[i]%7==0&&num[i]!=0){
                System.out.println("Number of number:"+(count+1)+", number:"+num[i]);
                count++;
                if (count==15)
                    break;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Cycle while");
        int i = 0;
        count = 0;
        while(i<1000){
            i++;
            if(num[i]%7==0&&num[i]!=0){
                System.out.println("Number of number:"+(count+1)+", number:"+num[i]);
                count++;
                if (count==15)
                    break;
            }
        }
        i = 0;
        count = 0;
        System.out.println();
        System.out.println();
        System.out.println("Cycle do while");
        do{
            i++;
            if(num[i]%7==0&&num[i]!=0) {
                System.out.println("Number of number:" + (count + 1) + ", number:" + num[i]);
                count++;
                if (count == 15)
                    break;
            }
        }while(i<1000);


    }
}