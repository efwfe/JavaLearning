package com.examples.control;

public class Switch {
    public static void print(){
        for (int i=0;i<10;i++){
            switch (i){
                case 8:
                case 1:
                case 2:
                case 3:
                    System.out.println(i);
                    break;
                case 4:
                case 5:
                case 6:
                    System.out.println("this is "+i);
                    break;
                default:
                    System.out.println("this is default");
            }
        }

    }
}
