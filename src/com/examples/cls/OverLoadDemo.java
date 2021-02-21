package com.examples.cls;

class OverRide {

    void test(){
        System.out.println("Just a test!");
    }
    void test(int item){
        System.out.println("Just a args:"+item);
    }

    int test(int item, int item2){
        System.out.printf("Just two args %d %d \n", item, item2);
        return item*10;
    }

}

public class OverLoadDemo {
    public static void print(){
        OverRide or = new OverRide();
        or.test();
        or.test(12);
        or.test(12,3);
    }
}