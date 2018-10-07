package com.company;

import java.util.*;

public class DuplicationInListItem {

    public Set<Integer> findDuplicates(List<Integer> listContainingDuplicates)
    {
        final Set<Integer> setToReturn = new HashSet();
        final Set<Integer> set1 = new HashSet();

        for (Integer item:listContainingDuplicates) {
            if (!set1.add(item))
                setToReturn.add(item);
        }
        return setToReturn;
    }

    public static void main(String agra[]){
        List<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(50);
        list.add(20);
        list.add(50);
        list.add(100);
        Set<Integer> set=new HashSet<>();
        set=new DuplicationInListItem().findDuplicates(list);
        Iterator<Integer> integer=set.iterator();
        while (integer.hasNext()){
            System.out.println(integer.next());
        }
    }
}
