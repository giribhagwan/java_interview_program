package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharInString {
    public static void main(String args[]){
        String str="Java";
        char[] car=str.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for (Character c:car){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else
                map.put(c,1);
        }
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", car);
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }


    }
}
