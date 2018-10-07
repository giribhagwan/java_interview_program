package com.company;

import java.util.BitSet;

public class SwapTwoNoWithoutThirerdVerifable {
    public static void main(String args[]){
        int i=20,j=30;
        j=i+j;
        i=j-i;
        j=j-i;
        System.out.println(i+" "+j);
    }

}
