package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MathFormalReprasentation {

    static int numberPower(int p){
        int n=2,result=1;
        if(n>=0&&p==0)
        {
            result=1;
        }
        else if(n==0&&p>=1)
        {
            result=0;
        }
        else
        {
            for(int i=1;i<=p;i++)
            {
                result=result*n;
            }
        }
        return result;
    }
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
             for(int j=0;j<n;j++){
                 int rr=0;
                 for(int l=0;l<=j;l++) {
                     int re=0;
                         re=numberPower(l)*b;
                     rr +=re;
                 }
                r[j]=a+rr;
             }
             result.add(r);
        }
        result.forEach(e->{
            for (int i=0;i<e.length;i++) {
                System.out.print(e[i]+" ");
            }
            System.out.println();
        });
        in.close();
    }

}
