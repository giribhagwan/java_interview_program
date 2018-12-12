package com.company;



import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class ConvertDateInToTwentyFourHours {




        /*
         * Complete the timeConversion function below.
         */
        static String timeConversion(String s) {
            char c=s.charAt(s.length()-2);
            String[] time=s.split(":");
            int h=Integer.parseInt(time[0]);
            if (c=='P'){
                if (h!=12)
                h+=12;
            }
            if (c=='A'){
                if (h==12)
                    h=0;
            }

            return new DecimalFormat("00").format(h)+":"+time[1]+":"+time[2].charAt(0)+time[2].charAt(1);

        }

        private static final Scanner scan = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
//            BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String s = scan.nextLine();

            String result = timeConversion(s);
            System.out.println(result);
//            bw.write(result);
//            bw.newLine();
//
//            bw.close();
        }
    }

