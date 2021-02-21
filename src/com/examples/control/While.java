package com.examples.control;

public class While {
    public static void print() {
        int value = 10;
        while (value > 0) {
            System.out.println(value);
            value--;
        }
    }

    public static void nobody() {
        int i, j;
        i = 100;
        j = 200;
        while (++i < --j) ;

        System.out.printf("i %d \nj  %d \n", i, j);
    }

    public static void doWhile(){
        int n=10;
        do{
            System.out.printf("this is start %d \n",n);
        }while (--n>0);
        /*
        * do{
            System.out.printf("this is start %d \n");
        }while (n--);
        * */
    }
}
