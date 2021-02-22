package com.examples.cls;

class A{
    int i=1;
}

class B extends A{
    int i;
    B(int a, int b){
        super.i = a; // A.i
        i = b; // B.i

    }

    void show(){
        System.out.println("A.i:"+super.i);
        System.out.println("B.i:"+i);
    }
}


public class VisitSuper {
    public static void print(){
        B b = new B(1, 2);
        b.show();

    }
}
