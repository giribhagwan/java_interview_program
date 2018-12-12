package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayOperationTest {


    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter no of element:");
        int n=scanner.nextInt();
        int[] array=new int[n];
        for (int i=0;i<n;i++){
            array[i]=scanner.nextInt();
        }

        Set<Integer> set= new TreeSet<>();


        for (int e:array){
            System.out.print(""+e+",");
            if (!set.add(e))
                set.remove(e);
            else{
                set.add(e);
            }

        }

        System.out.println();
        List<Integer> list=new ArrayList<>();
        List<Integer> result=new ArrayList<>();
        list.addAll(set);
//        Collections.shuffle(list);
        int temp = 1;
        int[] ar1= new int[4];
        for (int i=0;i<list.size()-1;i++){

               if (list.get(i)>list.get(temp)){
                   ar1[i]=list.get(i);
                   ar1[i]=list.get(temp);
//                   ar1[temp]=list.get(temp);
//                   result.add(list.get(temp));
//                   System.out.println("i="+list.get(i));
//                   System.out.println("temp="+list.get(temp));
                   }
                   temp++;
        }
        System.out.println();
        for (Integer integer:ar1)
        {
            System.out.print(integer+",,");
        }

    }
}
