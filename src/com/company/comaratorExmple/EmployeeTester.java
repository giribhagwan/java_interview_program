package com.company.comaratorExmple;

import com.company.comaratorExmple.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        Comparator<Employee> employeeNameComparator = Comparator.comparing(Employee::getName);

//        Comparator<Employee> employeeNameComparator = (e1, e2) -> e1.getName().compareTo(e2.getName());

//        Comparator<Employee> employeeNameComparator = new Comparator<Employee>() {
//            @Override
//            public int compare(Employee e1, Employee e2) {
//                return e1.getName().compareTo(e2.getName());
//            }
//        };
        Collections.sort(list,employeeNameComparator);
        list.forEach(System.out::println);
    }
}
