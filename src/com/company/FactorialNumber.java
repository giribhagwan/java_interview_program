package com.company;

public class FactorialNumber {
    static int fct(int num){
        if(num==0)
            return 1;
        else
            return num*(fct(num-1));
    }

    public  static void main(String args[]){
        System.out.println(fct(4));
    }
}
