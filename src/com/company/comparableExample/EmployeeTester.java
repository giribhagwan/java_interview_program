package com.company.comparableExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTester {

    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();

        list.add(new Employee("Madhav",11000,"Mumbai"));
        list.add(new Employee("Nishikant",12000,"Pune"));
        list.add(new Employee("Bhagwan",20000,"Pune"));

        System.out.println("Before Sort");
      list.forEach(System.out::println);
        System.out.println("After sort");
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
