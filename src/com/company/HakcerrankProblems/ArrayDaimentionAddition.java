package com.company.HakcerrankProblems;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayDaimentionAddition {


        // Complete the diagonalDifference function below.
        static int diagonalDifference(int[][] arr) {

            System.out.println("length "+arr.length);
            int temp=arr.length-1;
            int a = 0,b = 0;
            for(int i=0;i<arr.length;i++){
                a=a+arr[i][i];
                b=b+arr[i][temp];
                    temp=temp-1;
            }

            return a+b;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                System.out.println("count");
                String[] arrRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < n; j++) {
                    int arrItem = Integer.parseInt(arrRowItems[j]);
                    arr[i][j] = arrItem;
                }
            }

            int result = diagonalDifference(arr);

//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
//
//            bufferedWriter.close();

            scanner.close();
        }
    }





//    11
//       22
//          33
//
//        13
//      22
//   31