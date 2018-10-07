package com.company;

    class Atom{
        public Atom() {
            System.out.println("Atom");
        }
    }
    class child1 extends Atom{
        public child1(String type) {
            System.out.println(type);
        }
    }
    class child2 extends child1{
        public child2() {
            super("perm..");
            System.out.println();
        }
    }

public class SuperKeyword {

        public static void main(String args[]){

            child2 s=new child2();

        }

    }

