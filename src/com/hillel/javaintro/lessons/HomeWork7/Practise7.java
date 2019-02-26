package com.hillel.javaintro.lessons.HomeWork7;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Practise7 {
    // Task 1
    public static List searchEvenNum(int[] oldArr){
        if(oldArr.length==0)
            return null;
        List<Integer> newArr = new ArrayList<Integer>();
        for(int i = 0; i < oldArr.length; i++)
            if(oldArr[i]%2==0)
                newArr.add(oldArr[i]);
        return newArr;
    }


    public static List searchNotEvenNum(int[] oldArr){
        if(oldArr.length==0)
            return null;
        List<Integer> newArr = new ArrayList<Integer>();
        for(int i = 0; i < oldArr.length; i++)
            if(!(oldArr[i]%2==0))
                newArr.add(oldArr[i]);
        return newArr;
    }

    //Task 2
    public static List searchPrimeNum(int[] oldArr){
        if(oldArr.length==0)
            return null;
        List<Integer> newArr = new ArrayList<Integer>();
        for(int i = 0; i <oldArr.length; i++)
            if((oldArr[i]==2||oldArr[i]==3)||(((oldArr[i]*oldArr[i])-1)%24==0)&&oldArr[i]>1)
                newArr.add(oldArr[i]);
        return newArr;
    }

    //Task 3
    public static int[] _20FirstsNumOfFib(){
        int[]fibon = new int[20];
        fibon[0]=1;
        fibon[1]=1;
        for (int i = 2; i < 20; i++)
            fibon[i]=fibon[i-2]+fibon[i-1];
        return fibon;
    }

    //Task 4
    public static int max(int[]arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
            if(arr[i]>max)
                max=arr[i];
        return max;
    }


    public static int min(int[]arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++)
            if(arr[i]<min)
                min=arr[i];
        return min;
    }

    //Task 5
    public static int[][] multiplyMatrix (int[][] A, int[][] B){
        if(A.length!=B[0].length&&A[0].length!=B.length)
            return null;
        int[][] newMatrix;
        int n,m,p;
        n=m=p=0;
        int[][] temp;
        if(A[0].length==B.length){
        m = A.length;
        n = A[0].length;
        p = B[0].length;
        }
        if(A.length==B[0].length){
        temp=A;
        A=B;
        B=temp;
        m = A.length;
        n = A[0].length;
        p = B[0].length;
        }
        newMatrix= new int[m][p];
        for(int i = 0; i < m ;i++)
            for(int j = 0; j < p ;j++)
                for(int k = 0; k < n ;k++)
                    newMatrix[i][j]+=A[i][k]*B[k][j];
        return newMatrix;
    }

    //Task 6
    public static int[] theLongestNumInTheArr(int[]arr){
        double max = Double.MIN_VALUE;
        int [] t = new int[2];
        double temp;
        int temp1=-1;
        for (int i = 0; i < arr.length; i++) {
            temp = Math.ceil(Math.log10(Math.abs(arr[i]) + 0.5));
            if(max<temp){
                max=temp;
                temp1=arr[i];
            }
        }
        t[0]=temp1;
        t[1]=(int)max;

        return t;
    }
    public static int[] theShortestNumInTheArr(int[]arr){
        double min = Double.MAX_VALUE;
        int [] t = new int[2];
        double temp;
        int temp1=-1;
        for (int i = 0; i < arr.length; i++) {
            temp = Math.ceil(Math.log10(Math.abs(arr[i]) + 0.5));
            if(min>temp){
                min=temp;
                temp1=arr[i];
            }
        }
        t[0]=temp1;
        t[1]=(int)min;
        return t;
    }

    //Task 7
    public static List<Integer> differentNum(int[]oldArr){
        if(oldArr.length==0)
            return null;
        List<Integer> newArr = new ArrayList<Integer>();

        int[] nums = new int[10];

        double countNum;
        int tempValue, tempNum;

        for (int i = 0; i < oldArr.length; i++){
            tempValue = oldArr[i];
            countNum=Math.ceil(Math.log10(Math.abs(oldArr[i]) + 0.5));
            tempNum=oldArr[i]%10;
            nums[tempNum]++;
            if(countNum-1==0){
                newArr.add(tempValue);
                nums = new int[10];
            }
            else
                for(int j = 10, k = 0 ; k < countNum-1; k++,j*=10){
                    tempNum=(oldArr[i]/j)%10;
                    nums[tempNum]++;
                    if(nums[tempNum]>=2){
                        nums = new int[10];
                        break;
                    }
                    if(k==countNum-2)
                        newArr.add(tempValue);
                }
        }
        return newArr;
    }

    //Task 8
    public static void printingMatrix(int[][] arr){
        for(int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
                if(arr[0].length-1==j)
                    System.out.println();
            }
    }

    public static void printingMatrix_olnyNMultiplyN_(int[][] arr){
        if(arr.length==arr[0].length)
            for(int i = 0; i < arr.length; i++)
                for (int j = 0; j < arr[0].length; j++){
                    System.out.print(arr[i][j]+" ");
                    if(arr[0].length-1==j)
                        System.out.println();
                }
        else
            System.out.println("Error, matrix is not n*n! ");
    }


    public static void printingLikeMatrixNMultiplyN(int k){
        double pointer = Math.ceil(Math.sqrt(Math.abs(k)));
        Random rand = new Random();
        int counter = 0;

        for(int i = 0; i < k; i++){
            if(counter==pointer-1) {
                System.out.println(rand.nextInt(10) + " ");
                counter=0;
            }
            else {
                System.out.print(rand.nextInt(10) + " ");
                ++counter;
            }
        }
    }



}
