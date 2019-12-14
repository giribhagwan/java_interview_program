package com.company;

class A{
    public int sum(int a,int b){
        return a+b;
    }
}
class B extends A{
    @Override
    public int sum(int a, int b) {
        return a-b;
    }
}

public class InheritanceOverride {
    public static void main(String args[]) {


    A a = new B();
    A a1=new A();

        System.out.println(a.sum(2,2));
        System.out.println(a1.sum(2,2));


}

}
