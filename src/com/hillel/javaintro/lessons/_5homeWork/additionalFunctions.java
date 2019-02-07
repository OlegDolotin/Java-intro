package com.hillel.javaintro.lessons._5homeWork;

import java.util.*;

public class additionalFunctions {

    /**
     * Эта функция заполняет массив рандомными числами
     * @return заполненный массив
    */
    public static int[] fillingTheArrayWithRandomNumbers(int []arr, int bounds){
        Random rand = new Random();
        for (int i = 0; i<arr.length;i++){
            arr[i]=rand.nextInt(bounds);
        }
        return arr;
    }




    /**
     * Эта функция ищет индекс элемента по его значению
     * @param arr
     * @param num
     * @return индекс если такой элемент найден, и -1 если такого элемента не обнаружено
     */
    public static int searchIndexByNum1(int []arr, int num){
        for(int i = 0; i<arr.length;i++){
            if (arr[i]==15) {
                System.out.println("Index of the element equal to 15: "+ i);
                return i;
            }
        }
        return -1;
    }




    /**
     * Эта функция ищет индекс элемента по его значению
     * @param arr
     * @param num
     * @return индекс если такой элемент найден, и -1 если такого элемента не обнаружено
     */
    public static int searchIndexByNum2(int []arr, int num){
        int counter =0;
        for (int i = 0; i<arr.length; i++){
            if(arr[i]==15){
                System.out.println("Index of the element equal to 15: "+ i);
                return i;
            } else {
                counter++;
            }
        }
        if(counter==arr.length){
            System.out.println("Error, there are no elements equal to fifteen in this array");
        }
        return -1;
    }





    /**
     * Эта функция ищет индекс элемента по его значению
     * @param arr
     * @param num
     * @return индекс если такой элемент найден, и -1 если такого элемента не обнаружено
     */
    public static int searchIndexByNum3(int []arr, int num) {
        int i =0, counter =0;

        while (i<arr.length){
            if(arr[i]==15){
                System.out.println("Index of the element equal to 15: "+ i);
                return i;
            } else {
                counter++;
            }
            i++;
        }
        if(counter==arr.length){
            System.out.println("Error, there are no elements equal to fifteen in this array");
        }
        return -1;
    }





    /**
     * Эта функция выводит на экран каждый второй элемент
     * @param arr
     */
    public static void printingEverySecondElementOfArr(int []arr){
        for(int i = 0; i<arr.length; i++)
            if(i%2!=0)
                System.out.println("Number of element " +(i)+" value "+arr[i]);
    }





    /**
     * Эта функция находит максимальный эллемент массива
     * @param arr
     * @return значение максимального элемента
     */
    public static int searchTheMaximumElementOfArr(int[]arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }


    /**
     * Эта функция выводит на экран элементы по порядку в скобках
     * @param arr
     */
    public static void typeElementsInOrder(int []arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i<arr.length-1)
                System.out.print(", ");
        }
        System.out.print("]");
    }


    /**
     * Эта функция выводит элементы задом на перед в скобках
     * @param arr
     */
    public static void typeElementsInReversedOrder(int []arr){
        System.out.print("[");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i < arr.length && i != 0)
                System.out.print(", ");
        }
            System.out.print("]");
    }

}
