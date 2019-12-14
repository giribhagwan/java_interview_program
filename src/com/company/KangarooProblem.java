package com.company;



import java.io.*;
import java.util.*;
public class KangarooProblem {



        // Complete the kangaroo function below.
        static String kangaroo(int x1, int v1, int x2, int v2) {
//            String result = null;
//            if(v1<v2){
//                result="NO";
//            }
//            else {
//            int k1_count=0,k2_count=0;
//            for (int i=0;i<=100;i++){
//                for (int k=x1;k<=i;k++){
//                    x1+=v1;
//                    k1_count++;
//                }
//                for (int k=x2;k<=i;k++){
//                    x2+=v2;
//                    k2_count++;
//                }
//                if (x1==x2&&k1_count==k2_count){
//                    result="YES";
//                    break;
//                }
//                else
//                    result="NO";
//                }
//            }
//            return result;

            if(v1 < v2) return "NO";
            if(x1 < x2 && v1 > v2) {
                int xDiff = Math.abs(x1 - x2);
                int vDiff = Math.abs(v1 - v2);
                if(xDiff % vDiff == 0) {
                    return "YES";
                } else {
                    return "NO";
                }
            }
            return "NO";






        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {

            String[] x1V1X2V2 = scanner.nextLine().split(" ");

            int x1 = Integer.parseInt(x1V1X2V2[0]);

            int v1 = Integer.parseInt(x1V1X2V2[1]);

            int x2 = Integer.parseInt(x1V1X2V2[2]);

            int v2 = Integer.parseInt(x1V1X2V2[3]);

            String result = kangaroo(x1, v1, x2, v2);
            System.out.println(result);

            scanner.close();
        }
    }

