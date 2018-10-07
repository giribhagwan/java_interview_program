package com.company;

public class RevertStringUsingRecorsive {

    static String rec(String str){
        if (str.length()<2)
            return str;

        return rec(str.substring(1)+str.charAt(0));

    }
    public static void main(String args[]){
        String str="java";
//        String returnStr="";
//        System.out.println(str.length());
//        for (int i=str.length()-1;i>=0;i--){
//            returnStr=returnStr+str.charAt(i);
//        }

        StringBuffer stringBuffer=new StringBuffer(str);
        System.out.println(stringBuffer.reverse());
//        System.out.println(rec(str));
    }
}
