package com.examples.cls;

class OA{
    int i,j;
    OA(int a, int b){
        i = a;
        j = b;
    }

    void show(){
        System.out.println(" i and j :"+i + " "+ j);
    }
}

class OB extends OA{
    int k;
    OB(int a, int b, int c){
        super(a,b);
        k = c;
    }
    /*只有当两个方法和签名完全一样的时候才会发生重写；否则只是重载*/
    void show(){
        super.show(); // call parent show method
        System.out.println("k :"+k);
    }
}

public class Overriding {
    public static void print(){
        OB b = new OB(1,2,3);
        b.show();
    }
}
