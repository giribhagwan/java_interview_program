package com.company;

import java.util.Scanner;

public class MathFormalReprasentation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a = 0,b = 0,n = 0;
        for(int i=0;i<t;i++){
             a = in.nextInt();
              b = in.nextInt();
              n = in.nextInt();


        }
        for (int i=0;i<t;i++) {
        for (int j = 0; j < n; j++) {
                System.out.print(a + (2 * j) + b + " ");
        }
        System.out.println();
    }
        in.close();
    }

}
