package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrintMathMultipl {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        for (int i=1;i<=10;i++){
            System.out.println(N+" x "+i+" = "+N*i);
        }

    }
}
