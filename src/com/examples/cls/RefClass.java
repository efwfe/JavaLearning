package com.examples.cls;

public class RefClass {
    public static void print(){
        BoxWeight bx = new BoxWeight(1,1,2, 4);
        Box3 bxSuper;

        bxSuper =bx;
        // 不能使用bxsuper.weight
        System.out.println("Ref of Box volume:"+bxSuper.volume()+" weight:"+ bx.weight);
    }
}
