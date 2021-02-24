import inter.*;
import exception.*;
import threads.SyncedThread;
import threads.ThreadCreate;
import threads.ThreadDemo;
import threads.ThreadExtends;

public class Main {

    public static void main(String[] args){
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
        SyncedThread.main();
    }
}
