package com.company.assignment;

import java.util.ArrayList;
import java.util.List;

public class Student {

    int roll;
    String name;
    String subject;
    int marks;

    Student(int roll,String name,String subject,int marks){

        this.roll=roll;
        this.name=name;
        this.subject=subject;
        this.marks=marks;

    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", marks=" + marks +
                '}';
    }

    //    public String toString() {
//        return "Student[Roll=" + roll + ",Name=" + name +",Subject="+subject+",Marks="+marks+"]";
//
//    }
}
 class HashMap {

    public static void main(String[] args) {

        Student student=new Student(101,"Chetan", "Java",60);
        Student student1=new Student(101,"Chetan",".NET",70);
        Student student2=new Student(101,"Chetan","php",80);
        Student student3=new Student(101,"Chetan","Kotlin",90);
        Student student4=new Student(101,"Chetan","Angular",50);

        Student student5=new Student(102,"Vinay", "Java",60);
        Student student6=new Student(102,"Vinay",".NET",70);
        Student student7=new Student(102,"Vinay","php",70);
        Student student8=new Student(102,"Vinay","Kotlin",90);
        Student student9=new Student(102,"Vinay","Angular",50);

        Student student10=new Student(103,"Rahul", "Java",60);
        Student student11=new Student(103,"Rahul",".NET",70);
        Student student12=new Student(103,"Rahul","php",70);
        Student student13=new Student(103,"Rahul","Kotlin",90);
        Student student14=new Student(103,"Rahul","Angular",50);


//        Student student2=new Student(103,"Vishal");
        List<Student> list=new ArrayList<>();

        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        list.add(student7);
        list.add(student8);
        list.add(student9);
        list.add(student10);
        list.add(student11);
        list.add(student12);
        list.add(student13);
        list.add(student14);
        //  System.out.println(list);

        list.add(student2);

        BLogic bLogic=new BLogic();
        bLogic.display((ArrayList<Student>) list);


        //careate a method called StudenbtListParser()
        //And pass abpve list as a parameter and write business logic in that method and print



    }
}