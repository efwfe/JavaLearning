package com.examples.vars;

public class Datatype {
     static void printInt() {
        // 整数类型：byte;integer;long;short
        byte b = 1;
        int inta = 1111;
        long intb = 11123322;
        short intc = 112;
        System.out.printf("byte: %d; int: %d; long: %d; short: %d", b, inta, intb, intc);
    }

     static void printFloat() {
        // 浮点类型 double;float;
        float df = 1.001F;
        double da = (1.0 / 288899);

        System.out.println("float " + df);
        System.out.println("double " + da);

    }

     static void printChar() {
        // 字符型 char
        char simpechar = 'a';
        System.out.println("simple char " + simpechar);
    }

    public static void print(){
        printChar();
        printFloat();
        printInt();
    }
}
