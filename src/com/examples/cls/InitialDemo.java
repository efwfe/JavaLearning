package com.examples.cls;

class Box2{
    int weight;
    int price;

    Box2(int w, int p){
        // 之前使用weight price这两个参数 在python中十分常见；但是java中在一个封闭的环境中同一个变量名只能使用一次，非法创建
        // 并不能够被正确赋值
//        System.out.println("like python __init__ in java");
//        weight = w;
//        price =p;
        this.weight = w;
        this.price = p;
    }

    int count(){
        return weight * price;
    }

}
public class InitialDemo {
    public static void print(){
        // new 创建的对象会在特定的时间 偶尔执行回收，但是并不总是马上就执行
        Box2 b2 = new Box2(10, 20);
        System.out.println(b2.count());
    }
}
