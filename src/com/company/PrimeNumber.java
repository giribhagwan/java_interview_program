package com.company;

public class PrimeNumber {

//    static int prim(int num) {
//        if (num<=num/2)
//            return num;
//        else
//            return prim(num - 1);
//    }

    public static void main(String args[]) {
    int num=2;
    Boolean flag=false;
    for (int i=2;i<=num/2;i++) {
        if (num % i == 0) {
            flag=true;
            break;
        }
    }
    if (!flag)
        System.out.println("is a prime");
    else
        System.out.println("not");

//        System.out.println(prim(29));

    }

}
