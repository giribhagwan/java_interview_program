package com.company;

import java.util.Collections;

public class ChalculateVowel {
    public static void main(String args[]){

        String str="Java is a programing language";

        char[] chars=str.toCharArray();
        int count=0;
      for (char c:chars){
          switch (c){
              case 'a':
              case 'e':
              case 'i':
              case 'o':
              case 'u':
                  count++;
                  break;
                  default:

          }
      }
        System.out.println(count);
    }
}
