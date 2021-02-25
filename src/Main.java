import generics.*;
import inter.*;
import exception.*;
import reflect.Ref;
import threads.*;
import enumerate.*;

public class Main {

    public static void thread(){
        DefaultMethodInter d = new DefaultMethodInter();
        d.print();
        TryCatch.print();
        // thread
        ThreadDemo.print();
        // create thead runnable interface
//        ThreadCreate.print();
        // create thread from extends Thread class
//        ThreadExtends.print();
        // sync
//        SyncedThread.main();
        // thread resume and supending
        // ResumeThread.main();
        Enumerator.print();
        // 反射
        Ref.print();
    }

    public static void main(String[] args){
        GenericExample.print();
        MultpleGenerics.print();
        // 上限范型
        BoundedGeneric.print();
        // 通配符
        SameAvgGeneric.print();
        // 范型 统配 上界函数
        LimitGeneric.print();
    }
}
