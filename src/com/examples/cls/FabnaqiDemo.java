package com.examples.cls;

class Fab{
    int fact(int i){
        int result;

        if (i==1)return 1;
        result = i*fact(i-1);
        return result;
    }
}
public class FabnaqiDemo {
    public static void print(){
        int dat = 5;
        Fab fb = new Fab();
        System.out.println(fb.fact(dat));
    }
}
