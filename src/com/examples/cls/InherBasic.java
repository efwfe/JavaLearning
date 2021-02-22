package com.examples.cls;

class Box3{
    double width;
    double height;
    double depth;
    // 克隆一个对象的数据
    Box3(Box3 obj){
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }
    Box3(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    Box3(){
        width = -1;
        height = -1;
        depth = -1;
    }

    double volume(){
        return width * height* depth;
    }


}

class BoxWeight extends  Box3{
    double weight; //weight of box
    // constructor for boxweight
    BoxWeight(double w, double h, double d, double m){
        // super 调用超类的构造方法 必须是第一句执行
        super(w,h,d);
        weight = m;
    }
}

public class InherBasic {

    public static void print(){
        BoxWeight bw1 = new BoxWeight(10,10,10,10);
        System.out.println("volume:"+bw1.volume());
        System.out.println("weight:"+bw1.weight);
    }
}
