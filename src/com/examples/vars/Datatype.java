package com.examples.vars;

public class Datatype {
     static void printInt() {
        // 整数类型：byte 8
         // short       16
         // integer;    32
         // long;       64

        byte b = 1;
        int inta = 1111;
        long intb = 11123322;
        short intc = 112;
        System.out.printf("byte: %d; int: %d; long: %d; short: %d \n", b, inta, intb, intc);
    }

     static void printFloat() {
        // 浮点类型 double 64位;float 32位;
        float df = 1.001F;
        double da = (1.0 / 288899);

        System.out.println("float " + df);
        System.out.println("double " + da);

    }

     static void printChar() {
        // 字符型 char 16位
        char simpechar = 'a';
        System.out.println("simple char " + simpechar);
    }

    static void  printBool(){
         // 布尔类型 bool
        boolean a = false;
        boolean b = true;
        System.out.println(a);
        System.out.println(b);
    }

    public static void print(){
        printChar();
        printFloat();
        printInt();
        printBool();
    }
}
