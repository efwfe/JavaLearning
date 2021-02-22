package com.examples.cls;
abstract class ABSA{
    abstract void callme();

    void callme2(){
        System.out.println("this is callme2");
    }
}

class Instance extends ABSA{
    @Override
    void callme() {
        System.out.println("this is callme from subclass");
    }
}
public class AbsClass {
    public static void print(){
        Instance a = new Instance();
        a.callme();
        a.callme2();

    }
}
