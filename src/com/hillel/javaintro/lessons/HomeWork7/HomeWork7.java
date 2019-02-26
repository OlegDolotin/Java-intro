package com.hillel.javaintro.lessons.HomeWork7;

import java.util.List;
import java.util.Scanner;

import static com.hillel.javaintro.lessons.HomeWork7.Practise7.*;
public class HomeWork7 {

    public static void main(String[] args) {
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Task 1

        int[] randomNum = new int[]{1,3,4,4,7,43,6,2,3,2,6,8,6578,3511,22,6844};
        List<Integer> test;
        test = searchEvenNum(randomNum);
        int[] fibon;

        System.out.print("Even num: ");
        for (int i: test)
            System.out.print(i+" ");

        System.out.println();

        System.out.print("Not even num: ");
        test = searchNotEvenNum(randomNum);
        for (int i: test)
            System.out.print(i+" ");


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Task 2


        test = searchPrimeNum(randomNum);
        System.out.print("Prime num: ");
        for (int i: test)
            System.out.print(i+" ");



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Task 3


        fibon = _20FirstsNumOfFib();
        System.out.print("20_Fibons num: ");
        for (int i: fibon)
            System.out.print(i+" ");



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Task 4


        int max, min;
        max = max(randomNum);
        min = min(randomNum);
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);



/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Task 5


        int[][] A = new int[3][4];
        int[][] B = new int[5][3];
        int[][] C;
        for(int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                A[i][j]=j;
        System.out.println("Matrix A: ");

        printingMatrix(A);

        for(int i = 0; i < B.length; i++)
            for (int j = 0; j < B[0].length; j++)
                B[i][j]=j;

        System.out.println("Matrix B: ");
        printingMatrix(B);


        System.out.println("Multiplied matrix: ");

        C=multiplyMatrix(A,B);

        for(int i = 0; i < C.length; i++)
            for (int j = 0; j < C[0].length; j++){
                System.out.print(C[i][j]+" ");
                if(j==C[0].length-1)
                    System.out.println();
            }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Task 6


        int[] in = new int[2];
        System.out.print("The longest num = ");
        in = theLongestNumInTheArr(randomNum);
        System.out.println(in[0]);
        System.out.print("The length = ");
        System.out.println(in[1]);

        System.out.print("The shortest num = ");

        in= theShortestNumInTheArr(randomNum);
        System.out.println(in[0]);
        System.out.print("The length = ");
        System.out.println(in[1]);




/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Task 7


        test = differentNum(randomNum);
        System.out.print("The different numbers = ");
        for (Integer i:test) {
            System.out.print(i+" ");
        }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Task 8
        Scanner read = new Scanner(System.in);
        int temp = read.nextInt();
        printingLikeMatrixNMultiplyN(temp);

    }
}
