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

    }

    public static void main(String[] args){
        Enumerator.print();
        Ref.print();
    }
}
