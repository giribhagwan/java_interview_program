package com.company;

public class PalendromNumber {
    public static void main(String args[]){
//        int n=1212;
//        int some=0,temp;
//        temp=n;
//        while (n>0){
//            System.out.println("value:"+n);
//            int reminder=n%10;
//            some=(some*10)+reminder;
//            System.out.println("some:"+some);
//            n=n/10;
//            System.out.println("n:"+n);
//        }
//        if (temp==some)
//            System.out.println("no is pallendrom");
//        else
//            System.out.println("note");


        String str= "How are you";
        String [] words=str.split(" ");
        String revertString="";
        for (int i=0;i<words.length;i++){
            System.out.println(words[i]);

            String word=words[i];
            String reverWord="";
            for (int j=word.length()-1;j>=0;j--){
                reverWord=reverWord+word.charAt(j);
                System.out.println(reverWord);
            }
            revertString=revertString+reverWord+ " ";


        }
        System.out.println(revertString);



    }
}
