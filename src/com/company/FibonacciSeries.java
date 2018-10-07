package com.company;

public class FibonacciSeries {
    public static void main(String args[]){

//        int arr[]=new int[13];
//        arr[0]=0;
//        arr[1]=1;
//
//        for(int i=2;i<=12;i++){
//            arr[i]=arr[i-1]+arr[i-2];
//        }
//        for(int i=0;i<=arr.length-1;i++){
//            System.out.print(arr[i]+" ");
//            System.out.print("\t");
//        }

        Integer number = 456;
        String stringNumber = String.valueOf(number);
        String reverse="";
        for(int i = stringNumber.length()-1;i>=0;i--){
            reverse = reverse+stringNumber.charAt(i);
        }
        System.out.println("the reverse of no is: "+ Integer.valueOf(reverse));
    }
        
    }

