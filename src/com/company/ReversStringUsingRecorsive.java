package com.company;

public class ReversStringUsingRecorsive
{
   public String rec(String string){
        if (string.isEmpty()){
            return string;
        }
       return rec(string.substring(1)) + string.charAt(0);
    }


    public static void main(String args[]){
        String str="java";
        System.out.println(new ReversStringUsingRecorsive().rec(str));
    }
}
