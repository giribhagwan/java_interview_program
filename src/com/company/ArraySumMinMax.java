package com.company;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class ArraySumMinMax {



        // Complete the miniMaxSum function below.
        static void miniMaxSum(int[] arr) {
            long[] result=new long[arr.length];
            for (int i=0;i<arr.length;i++){
                for (int j=0;j<arr.length;j++){
                    System.out.println(result[i]+"+"+arr[j]);
                    result[i]=result[i]+arr[j];
                }
                result[i]= result[i]-arr[i];
            }
            Arrays.sort(result);

            System.out.println(result[0]+" "+result[result.length-1]);

        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            int[] arr = new int[5];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < 5; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            miniMaxSum(arr);

            scanner.close();
        }
    }



