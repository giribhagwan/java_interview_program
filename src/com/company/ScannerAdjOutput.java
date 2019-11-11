package com.company;


import java.util.*;

public class ScannerAdjOutput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        Map<String,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
           map.put(s1,x);
        }

        map.forEach((key,value) -> {

            System.out.println(String.format("%-15s", key)+""+String.format("%03d",value));
        });


        System.out.println("================================");
    }
}
