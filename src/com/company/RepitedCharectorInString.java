package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RepitedCharectorInString {

    public static void main(String args[]){
        String str="java";
        Set<Character> toReturen=new HashSet<>();
        Set<Character> set=new HashSet<>();
        for (int i=0;i<str.length();i++){
            if (!set.add(str.charAt(i)))
                toReturen.add(str.charAt(i));
        }
        Iterator<Character> iterable=toReturen.iterator();
        while (iterable.hasNext()){
            System.out.println(iterable.next());
        }

    }
}
