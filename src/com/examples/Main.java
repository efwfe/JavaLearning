package com.examples;
import com.examples.utils.*;
import com.examples.control.*;
import com.examples.vars.*;
import com.examples.cls.*;

public class Main {
    public static void main(String[] args){
        aboutClasses();
    }
    public static void aboutClasses(){
        // 关于类的学习部分
        BoxDeemo.print();
        // 构造函数
        InitialDemo.print();
        // simple example of stackClass
        StackDemo.print();
    }

    public static void showBasic() {
        //关于java的基础数据类型和控制流
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
