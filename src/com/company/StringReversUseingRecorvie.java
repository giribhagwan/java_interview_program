package com.company;

public class StringReversUseingRecorvie {
    static String rec(String str){
        if (str.isEmpty()) {
            return str;
        }
        System.out.println("String to be passed in Recursive Function: "+str.substring(1));
        return rec(str.substring(1))+str.charAt(0);
    }
    public static void main(String args[]){
        System.out.println(rec("Guru99"));
    }
}