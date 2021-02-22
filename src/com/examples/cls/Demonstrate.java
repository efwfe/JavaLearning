package com.examples.cls;
class A1{
    A1(){
        System.out.println("constructor in A");
    }
}

class B1 extends  A1{
    B1(){
        super();
        System.out.println("constructor in B");
    }
}

class C1 extends B1{
    C1(){
        super();
        System.out.println("constructor in C");
    }
}
public class Demonstrate {
    public static void print(){
        C1 c = new C1();
        System.out.println("simple checkout demonstration of inheritance");
        System.out.println("============================================");
    }
}
