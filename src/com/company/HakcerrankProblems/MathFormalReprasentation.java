package com.company.HakcerrankProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MathFormalReprasentation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a = 0,b = 0,n = 0;
        List<int[]> result=new ArrayList<>();
        for(int i=0;i<t;i++){
             a = in.nextInt();
             b = in.nextInt();
             n = in.nextInt();
            int[] r= new int[n];
            int count=0;
             for(int j=1;j<n;j++){
                 count++;
                 int rr=0;
               do{
                    rr+=(j*j)+b;
               }while (j>count);
                r[j]=a+rr;
             }
             result.add(r);
        }
        result.forEach(e->{
            for (int i=0;i<e.length;i++)
                System.out.print("\t"+e[i]);
            System.out.println();
        });
        in.close();
    }

}
