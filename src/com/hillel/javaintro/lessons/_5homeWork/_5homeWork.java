package com.hillel.javaintro.lessons._5homeWork;


import static com.hillel.javaintro.lessons._5homeWork.additionalFunctions.*;
import static com.hillel.javaintro.lessons._5.Practise.removeElementByNum;

public class _5homeWork {

    public static void main(String[] args) {

        int [] arr = new int [20];

        //задание 1

        arr =fillingTheArrayWithRandomNumbers(arr, 20);

        //задание 2.1(for)

        int indexOfTheDesiredNum =searchIndexByNum1(arr, 15);

        //задание 2.2(без 15(for)
        for (int i = 0; i < arr.length; i++){
            arr=removeElementByNum(arr, 15);
        }

        indexOfTheDesiredNum=searchIndexByNum2(arr,15);

        System.out.println();


        //задание 2.3(без 15(while))

        indexOfTheDesiredNum=searchIndexByNum3(arr,15);

        System.out.println();

        //задание 3

        printingEverySecondElementOfArr(arr);

        System.out.println();

        //задание 4

        int maxElementOfTheArr = searchTheMaximumElementOfArr(arr);
        System.out.println("The maximal element of Arr = "+ maxElementOfTheArr);

        System.out.println();

        //задание 5

        typeElementsInOrder(arr);

        System.out.println();
        //задание 6

        typeElementsInReversedOrder(arr);
    }
}
