package com.company;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

public class DuplicationCharecterInString {

    public static void main(String args[]){
        String str1="java";

        Map<Character,Integer> map=new HashMap();
        char[] chars=str1.toCharArray();
        for (char c:chars){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else
                map.put(c,1);
        }

        for (Map.Entry<Character,Integer> entry:map.entrySet()){
            if (entry.getValue()>1)
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
