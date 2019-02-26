package com.hillel.javaintro.lessons.Lesson7;

import java.util.ArrayList;
import java.util.Scanner;

import static com.hillel.javaintro.lessons.Lesson5.Practise.*;

public class AddTask {




    public static boolean isItPalindrom(String text){
        int count=0;
        int n = text.length()/2;
            for (int i = 0, j = text.length()-1; i < n; i++, j--)
                if(text.charAt(i)==text.charAt(j))
                    count++;

            if(count==n)
                return true;
            else
                return false;
    }

    public static int countOfTheWordsInSentense(String sentence){
        int count = (sentence.charAt(0)!=' ')? 1 : 0;

        for(int i = 0; i < sentence.length(); i++){
            if(sentence.charAt(i)==' '&&sentence.charAt(i+1)!=' '&&sentence.charAt(i+1)!='!'&&sentence.charAt(i+1)!=','
                    &&sentence.charAt(i+1)!='?'&&sentence.charAt(i+1)!='.'&&sentence.charAt(i+1)!='"'&&sentence.charAt(i+1)!=':'&&
                    sentence.charAt(i+1)!=';'&&sentence.charAt(i+1)!='0'&&sentence.charAt(i+1)!='1'&&sentence.charAt(i+1)!='2'&&
                    sentence.charAt(i+1)!='3'&&sentence.charAt(i+1)!='4'&&sentence.charAt(i+1)!='5'&&sentence.charAt(i+1)!='6'&&
                    sentence.charAt(i+1)!='7'&&sentence.charAt(i+1)!='8'&&sentence.charAt(i+1)!='9')
                count++;
        }
        return count;
    }

    public static String removingNumFromString(String text){
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i)=='0'||text.charAt(i)=='1'||text.charAt(i)=='2'||text.charAt(i)=='3'||text.charAt(i)=='4'
                    ||text.charAt(i)=='5'||text.charAt(i)=='6'||text.charAt(i)=='7'||text.charAt(i)=='8'||text.charAt(i)=='9'){
                indexes.add(i);
            }
        }

        text = removeElementByIndex(text,indexes);
        return text;
    }

    public static String removingSpaceFromSentence(String text){
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i)==' '){
                indexes.add(i);
            }
        }
        text = removeElementByIndex(text, indexes);
        return text;
    }



    public static boolean checkingTelNum(final int num){
        System.out.print("Enter your telephone number: +380xxxxxxxx ");
        Scanner read = new Scanner(System.in);
        int enteringNum = read.nextInt();
        if(enteringNum==num){
            System.out.println("Well!");
            return true;
        }else {
            System.out.println("Incorrectly!");
            return false;
        }
    }


    public static AllLater countAllLater(String word){
       AllLater w = new AllLater();
       int j =1;

        w.later[0]=word.charAt(0);
       for (int i = 1; i<word.length(); i++){
           if(w.later[i-1]!=word.charAt(i)){
               w.later[j]=word.charAt(i);
               j++;
           }
        }
       for(int i = 0; i < w.counter.length; i++)
           w.counter[i]=0;
       for(int i = 0; i < w.later.length; i++)
           for(int k = 0; k < word.length(); k++){
               if(w.later[i]==word.charAt(k)){
                   w.counter[i]++;
               }
            }
       for(int i = 0; i<w.counter.length; i++)
           if(w.counter[i]==0)
               w.counterNull++;
           else
               w.counterNonNull++;
       for (int i = 0; i<w.counterNull; i++)
            w.counter=removeElementByNum(w.counter, 0);
       return w;
    }


    public static class AllLater{

        public int [] counter = new int[40];
        public char[] later = new char[40];
        public int counterNull = 0;
        public  int counterNonNull =0;

    }

}
