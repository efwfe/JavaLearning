package com.examples.cls;

class Stack2 {
    private int pst;
    private int[] arr = new int[10];

    Stack2() {
        this.pst = -1;
    }

    void push(int item) {
        if (pst == 9) System.out.println("stack is full");
        else {
            arr[++pst] = item;
        }
    }

    int pop() {
        if (pst < 0) {
            System.out.println("stack is empty");
            return 0;
        } else {
            int dat =  arr[pst];
            arr[pst--] = 0;
            return dat;
        }
    }

    int[] arr(){
        return this.arr;
    }


}

public class Stack2Demo {
    public static void print(){
        Stack2 s2 = new Stack2();
        for (int i=0; i<10; i++) s2.push(i);

        for (int i=0; i<10; i++){
            System.out.println(s2.pop());
        }

        for(int num:s2.arr()) System.out.println(num);
    }
}
