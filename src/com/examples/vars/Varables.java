package com.examples.vars;

public class Varables {
    public static void print(){
        // declare variables
        int a, b = 10;
        a = 20;
        float e = 1.0F;
        boolean c = false, w =true;
        System.out.println(a);
        System.out.println(b);
        System.out.println(e);
        System.out.println(c);
        System.out.println(w);

        // dynamic initial variable
        double data = Math.sqrt(3*3+4*4);
        System.out.println(data);

        // 变量在输入其作用域时创建，并在其作用域离开时销毁

    }
}
