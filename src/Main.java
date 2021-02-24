import inter.*;
import exception.*;
import threads.*;

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
//        SyncedThread.main();
        // thread resume and supending
        ResumeThread.main();
    }
}
