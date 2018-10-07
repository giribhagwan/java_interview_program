package com.company;

public class TryCatch {
    public static void main(String args[]) {
        try {
            System.out.println("within try");
            int n = 10 / 0;

        } catch (Exception e) {
            System.out.println("withing exception");
        } finally {
            System.out.println("withing finally");
        }

    }
}