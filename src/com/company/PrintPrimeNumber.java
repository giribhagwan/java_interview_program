package com.company;

import java.util.Scanner;

public class PrintPrimeNumber {

    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter how much prime number you want to print");
        int n=scanner.nextInt();

        for (int i=1;i<=n;i++){
            Boolean isPrime=true;
            for (int j=2;j<i;j++) {
                if (i % j == 0) {
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i);
            }
        }
    }
}
