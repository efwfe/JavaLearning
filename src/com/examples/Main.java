package com.examples;
import com.examples.utils.*;
import com.examples.control.*;
import com.examples.vars.*;

public class Main {

    public static void main(String[] args) {
	    // start node
        System.out.println("this is a nice start");
        // simple one
        simple_1.print();
        // control statement
        Forloop.print();
        Forloop.multipleVars();
        Forloop.forEach();
        // data type
        Datatype.print();
        Array.main();
        // switch control flow
        Switch.print();
        // while control flow
        While.print();
        // while no body
        While.nobody();
        // do-while
        While.doWhile();
        // break
        Break.print();
        Break.scopes();
    }
}
