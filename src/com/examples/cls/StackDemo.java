package com.examples.cls;

class Stack {
    int pst;
    int[] arr = new int[10];

    Stack() {
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

}

public class StackDemo {
    public static void print(){
        Stack s1 = new Stack();
        for (int i=0; i<10; i++) s1.push(i);

        for (int i=0; i<10; i++){
            System.out.println(s1.pop());
        }

        for(int num:s1.arr) System.out.println(num);
    }
}
