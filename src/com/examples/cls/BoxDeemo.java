package com.examples.cls;

class Box{
    int size;
    int weight;
    int price;

    int count(){
        return size * weight * price;
    }
}
public class BoxDeemo {
    public static void print(){
        Box b = new Box();
        b.size = 10;
        b.weight = 10;
        b.price = 120;
        System.out.println(b.count());

    }
}
