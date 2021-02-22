package com.examples.cls;

class AA {
    void callme() {
        System.out.println("this is A1 callme");
    }
}

class BB extends AA {
    void callme() {
        System.out.println("this is B1 callme");
    }
}

class CC extends BB {
    void callme() {
        System.out.println("this is C1 callme");
    }
}

public class DynamicRef {
    public static void print() {
        AA a = new AA();
        BB b = new BB();
        CC c = new CC();
        AA d;
        d = a;
        d.callme();

        d = b;
        d.callme();

        d = c;
        d.callme();
    }
}
