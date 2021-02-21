package com.examples.control;

public class Break {
    public static void print(){
        boolean t = false;
        first :{
            second:{
                System.out.println("Before break");
                if (!t)break second;
                System.out.println("Break second");
            }
            System.out.println("Break first");
        }
    }

    public static void scopes(){
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                if (j==5)
                    break;
                else {
                    System.out.println(j);
                }
            }
        }
    }
}
