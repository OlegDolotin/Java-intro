package com.hillel.javaintro.lessons._5;

public class Practise {



    public static void main(String[] args) {
        int[]olDarr=new int[]{1,5,7,0,-6,4,8,3,1,-4};
        removeElementByNum(olDarr, 4);
    }

    public  static int[] removeElementByNum(int[] olDarr,int num){
        int []newArr=new int[olDarr.length-1];
        int index = 0;
        for(int i = 0; i<olDarr.length;i++){
            if(olDarr[i]==num){
                index=i;
                break;
            }
        }
        for(int i = 0, j = 0; i<olDarr.length; i++, j++){
            if(i==index){
                --j;
                continue;
            }else
                newArr[j]=olDarr[i];
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