package com.company;

public class RemoveDuplicationInArray{
    public static void main(String args[]){
        int[] arr={8,9,7,8,5,2,3,3};
        int[] newArray=new int[arr.length];
        int previous =arr[0];
        for (int i=1;i<arr.length;i++) {
            if (previous !=arr[i]){
                newArray[i]=arr[i];
            }
            previous =arr[i];
        }
        for (int j:newArray
             ) {
            System.out.println(j);

        }
    }
}
