package com.company.comparableExample;

public class Employee implements Comparable<Employee> {

    private String name;
    private Integer salary;
    private String city;

    public Employee(String name, Integer salary, String city) {
        this.name = name;
        this.salary = salary;
        this.city = city;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Employee o) {
//        return this.salary - o.salary;
//    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
}
