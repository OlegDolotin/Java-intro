package com.hillel.javaintro.lessons.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestClass {
    public static void main(String[] args) {
        //int x = 1563847412;


//        x = reverse(x);
//        System.out.println(x);
//        System.out.println(Integer.MIN_VALUE);
        /*int[] nums =new int[]{-1,4,2,3};
        boolean b = checkPossibility(nums);
        System.out.println(b);*/

        /*String J = "aA", S = "aAAbbbb";
        int k = 0;
        k = numJewelsInStones(J,S);
        System.out.println(k);*/

        /*String[] emails = new String[]{"fg.r.u.uzj+o.pw@kziczvh.com","r.cyo.g+d.h+b.ja@tgsg.z.com"
                ,"fg.r.u.uzj+o.f.d@kziczvh.com","r.cyo.g+ng.r.iq@tgsg.z.com","fg.r.u.uzj+lp.k@kziczvh.com"
                ,"r.cyo.g+n.h.e+n.g@tgsg.z.com","fg.r.u.uzj+k+p.j@kziczvh.com","fg.r.u.uzj+w.y+b@kziczvh.com"
                ,"r.cyo.g+x+d.c+f.t@tgsg.z.com","r.cyo.g+x+t.y.l.i@tgsg.z.com","r.cyo.g+brxxi@tgsg.z.com"
                ,"r.cyo.g+z+dr.k.u@tgsg.z.com","r.cyo.g+d+l.c.n+g@tgsg.z.com","fg.r.u.uzj+vq.o@kziczvh.com"
                ,"fg.r.u.uzj+uzq@kziczvh.com","fg.r.u.uzj+mvz@kziczvh.com","fg.r.u.uzj+taj@kziczvh.com"
                ,"fg.r.u.uzj+fek@kziczvh.com"};
        int counter = 0;
        counter = numUniqueEmails(emails);
        System.out.println(counter);*/

        int[]num = new int[]{2,1,2,5,3,2};
        int r =0;
        r = repeatedNtimes(num);
        System.out.println(r);

    }


    public static int reverse(int x) {
        if(x==0||x>Integer.MAX_VALUE|| x<Integer.MIN_VALUE){
            return 0;
        }else {
        double u = Math.ceil(Math.log10(Math.abs((double) x) + 0.5));
        int countNums = (int)u;
        long[] arrOfNums = new long [countNums];
        arrOfNums[0]=x%10;
        for(int i = 1, j = 10; i < countNums; i++, j*=10){
            arrOfNums[i]=(x/j)%10;
        }

        for(int i = countNums-2,k = 10; i >=0; i--, k*=10){
            arrOfNums[i]*=k;
            if(arrOfNums[i]>Integer.MAX_VALUE||arrOfNums[i]<Integer.MIN_VALUE)
                return 0;
        }

        long l = 0;
        for(int i = 0; i < countNums; i++){
            if(l>Integer.MAX_VALUE||l<Integer.MIN_VALUE)
                return 0;
            l+=arrOfNums[i];
        }
        int g =(int)l;
        return g;}
    }








    public static int numJewelsInStones(String J, String S) {
        char text [] = new char [J.length()];
        text[0]=J.charAt(0);
        int j = 1, counter = 0;
        for(int i = 1; i < J.length(); i++)
            if(J.charAt(i-1)!=text[i]){
                text [j] = J.charAt(i);
                j++;
            }

        for(int i = 0; i < text.length; i++) {
            for (int g = 0; g < S.length(); g++) {
                if (text[i] == S.charAt(g))
                    counter++;
            }
        }
        return counter;
    }




    public static int numUniqueEmails(String[] emails) {
        int h = 0;
        String[] localName = new String[emails.length];
        for(int i = 0; i < emails.length; i++){
            h = emails[i].indexOf('@');
            localName[i]=emails[i].substring(0,h);
            emails[i]=emails[i].substring(h,emails[i].length());
            localName[i]=localName[i].replace(".","");
            if(localName[i].contains("+")){
                localName[i]=localName[i].substring(0,localName[i].indexOf("+"));
            }
            emails[i]=localName[i]+emails[i];

        }
        int [] input = new int[emails.length];

        for (int i = 0; i <emails.length; i++)
            input[i]=emails[i].hashCode();
        Arrays.sort(input);
        int i = 1, j = 0;

        while(i < input.length){
            if(input[i] == input[j]){
                i++;
            }else{
                input[++j] = input[i++];
            }
        }

        return j+1;
    }


    public static int uniqueMorseRepresentations(String[] words) {
        Set <String> seen = new HashSet<String>();
        String[] morthWords = new String[words.length];
        for(int i = 0; i < words.length; i++){
            words[i].toLowerCase();
            for (int j = 0; j < words[i].length(); j++){
                switch (words[i].charAt(j)) {
                    case ('a'):
                        morthWords[i]+=".-";
                        break;
                    case ('b'):
                        morthWords[i]+="-...";
                        break;
                    case ('c'):
                        morthWords[i]+="-.-.";
                        break;
                    case ('d'):
                        morthWords[i]+="-..";
                        break;
                    case ('e'):
                        morthWords[i]+=".";
                        break;
                    case ('f'):
                        morthWords[i]+="..-.";
                        break;
                    case ('g'):
                        morthWords[i]+="--.";
                        break;
                    case ('h'):
                        morthWords[i]+="....";
                        break;
                    case ('i'):
                        morthWords[i]+="..";
                        break;
                    case ('j'):
                        morthWords[i]+=".---";
                        break;
                    case ('k'):
                        morthWords[i]+="-.-";
                        break;
                    case ('l'):
                        morthWords[i]+=".-..";
                        break;
                    case ('m'):
                        morthWords[i]+="--";
                        break;
                    case ('n'):
                        morthWords[i]+="-.";
                        break;
                    case ('o'):
                        morthWords[i]+="---";
                        break;
                    case ('p'):
                        morthWords[i]+=".--.";
                        break;
                    case ('q'):
                        morthWords[i]+="--.-";
                        break;
                    case ('r'):
                        morthWords[i]+=".-.";
                        break;
                    case ('s'):
                        morthWords[i]+="...";
                        break;
                    case ('t'):
                        morthWords[i]+="-";
                        break;
                    case ('u'):
                        morthWords[i]+="..-";
                        break;
                    case ('v'):
                        morthWords[i]+="...-";
                        break;
                    case ('w'):
                        morthWords[i]+=".--";
                        break;
                    case ('x'):
                        morthWords[i]+="-..-";
                        break;
                    case ('y'):
                        morthWords[i]+="-.--";
                        break;
                    case ('z'):
                        morthWords[i]+="--..";
                        break;
                }
            }
            seen.add(morthWords[i]);
        }
        return seen.size();
    }


    public static int repeatedNTimes(int[] A) {
        if(A.length<4||A.length>10000||A.length%2!=0)
            return -1;
        Arrays.sort(A);
        int repeatedNum=-1;
        for (int i = 0; i < A.length-1; i++)
            if(A[i]==A[i+1])
                repeatedNum=A[i];
        return repeatedNum;
    }


    public static int repeatedNtimes(int[] A) {
        for (int k = 1; k <= A.length-2; ++k)
            for (int i = 0; i < A.length - k; ++i)
                if (A[i] == A[i+k])
                    return A[i];

        throw null;
    }


    public int[] sortedSquares(int[] A) {
        if(A==null||A.length>10000)
            return null;
        for(int i = 0; i < A.length; i++)
            A[i]= A[i]*A[i];
        Arrays.sort(A);
        return A;
    }










}
