package com.hillel.javaintro.lessons.Lesson5;

import com.hillel.javaintro.lessons.Lesson7.AddTask.*;

import java.util.ArrayList;

public class Practise {



    public static void main(String[] args) {
        //int[]oldArr=new int[]{1,5,7,0,-6,4,8,3,1,-4};
        //oldArr=removeElementByNum(oldArr, 4);
        //for(int i =0; i<oldArr.length; i++){
        //    System.out.println(oldArr[i]);
        //}

//        int []oldArr =new int[]{1,5,7,0,-6,4,8,3,1,-4};
//        for(int i =0; i<oldArr.length; i++){
//            System.out.println(oldArr[i]);
//        }
        //oldArr=insertsTheElementIntoAnArr(oldArr,5, 10);
//        oldArr = reverseTheArr(oldArr);
//        System.out.println();
//        for(int i =0; i<oldArr.length; i++){
//                System.out.println(oldArr[i]);
//        }
            int[]arr=new int[]{12, 15, 23, 32 ,12 ,62};

            for(int i =0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
            System.out.println();
            arr=findRepeatedElementsIntoAnArr(arr);

            for(int i =0;i<arr.length;i++){
                System.out.println(arr[i]);
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




    public  static AllLater removeElementByNum(AllLater w, int num){
        int index = 0;
        for(int i = 0; i<w.counter.length;i++){
            if(w.counter[i]==num){
                index=i;
                break;
            }
        }
        for(int i = 0, j = 0; i<w.counter.length; i++, j++){
            if(i==index){
                --j;
                continue;
            }else
                w.counter[j]=w.counter[i];
        }
        return w;
    }




    public  static int[] removeElementByNum(String oldArr,char num){
        int []newArr=new int[oldArr.length()-1];
        int index = 0;
        for(int i = 0; i<oldArr.length();i++){
            if(oldArr.charAt(i)==num){
                index=i;
                break;
            }
        }
        for(int i = 0, j = 0; i<oldArr.length(); i++, j++){
            if(i==index){
                --j;
                continue;
            }else
                newArr[j]=oldArr.charAt(i);
        }
        return newArr;
    }


    public  static String removeElementByIndex(String oldArr, ArrayList<Integer> index){
        String newArr = "";
        int l = 0;
        for(int i = 0; i<oldArr.length(); i++){

            if(l!=index.size()&&i==index.get(l)){
                l++;
                continue;
            }else
                newArr+=oldArr.charAt(i);
        }
        return newArr;
    }











    public static double arrAverage(int [] arr) {
        double result = 0.0;
        for(int i = 0;i < arr.length; i++)
            result+=arr[i];
        return result/arr.length;
    }




    public static int [] copyTheElementsOfArr(int []arr){
        int[] newArr =new int[arr.length];
        for(int i = 0; i<arr.length; i++)
            newArr[i]=arr[i];
        return newArr;
    }




    public static int[] insertsTheElementIntoAnArr(int []arr,int index,int value){
        int [] newArr= new int[arr.length+1];
        for(int i = 0; i<=index; i++){
            if (i==index)
                newArr[index]=value;
            else
                newArr[i]=arr[i];
        }


        for (int i = index+1; i<newArr.length; i++)
            newArr[i]=arr[i-1];
        return newArr;
    }



    public static int[] reverseTheArr(int []arr){
        int []newArr = new int [arr.length];
        for(int i = 0, j = arr.length-1; i < arr.length; i++, j--)
            newArr[i]=arr[j];
        return newArr;
    }




    public static int [] findRepeatedElementsIntoAnArr(int[]arr){
        int []repeatedArr =new int[arr.length];


        return repeatedArr;
    }

}