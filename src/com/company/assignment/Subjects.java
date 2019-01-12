package com.company.assignment;

public class Subjects {
    String subject;
    int marks;

    public Subjects(String subject, int marks) {
        this.subject = subject;
        this.marks = marks;
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
        return "{" +
                "subject='" + subject + '\'' +
                ", marks=" + marks +
                '}';
    }
}
