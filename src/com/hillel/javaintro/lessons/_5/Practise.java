package com.hillel.javaintro.lessons._5;

public class Practise {



    public static void main(String[] args) {
        int[]oldArr=new int[]{1,5,7,0,-6,4,8,3,1,-4};
        oldArr=removeElementByNum(oldArr, 4);
        for(int i =0; i<oldArr.length; i++){
            System.out.println(oldArr[i]);
        }
    }

    public  static int[] removeElementByNum(int[] oldArr,int num){
        int []newArr=new int[oldArr.length-1];
        int index = 0;
        for(int i = 0; i<oldArr.length;i++){
            if(oldArr[i]==num){
                index=i;
                break;
            }
        }
        for(int i = 0, j = 0; i<oldArr.length; i++, j++){
            if(i==index){
                --j;
                continue;
            }else
                newArr[j]=oldArr[i];
        }
        return newArr;
    }

    public static double arrAverage(int [] arr) {
        double result = 0.0;
        for(int i = 0;i < arr.length; i++)
            result+=arr[i];
        return result/arr.length;
    }
}