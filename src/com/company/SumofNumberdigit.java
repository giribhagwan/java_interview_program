package com.company;

public class SumofNumberdigit {
    public static void main(String args[]) {
        int num = 1234;
        int sum = 0, temp;
        while (num > 0) {
            temp = num % 10;
            sum = sum + temp;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
