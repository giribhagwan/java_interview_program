package com.company;


public class GetMidNumberOfArray {


    public static void main(String args[]) {

        int[] array = {10, 52, 5, 30,55, 100,8,9,7,2};
//        Arrays.sort(array);

        int m=(array.length-1)-(array.length/2);
        System.out.println(array.length/2);
        System.out.println(array[m]);

//      for (int i:array){
//          System.out.println(i);
//      }
    }
}
