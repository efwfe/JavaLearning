package com.examples.cls;

class Avar{
    int x=1;
    }


class Bvar extends Avar{
    int y=2;}

class Cvar extends Bvar{
    int z=3;
}



public class VarInher {
    public static void print(){
//        var temp1 = createCls(1);
//        var temp2 = createCls(1);
//        var temp3 = createCls(2);
//        System.out.println(temp1.x);
//        System.out.println(temp2.y);
//        System.out.println(temp3.z);

    }

    static Avar createCls(int code){
        switch (code){
            case 0: return new Avar();
            case 1: return new Bvar();
            default:return new Cvar();
        }
    }
}
