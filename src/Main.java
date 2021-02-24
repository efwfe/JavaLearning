import inter.*;
import exception.*;
import threads.ThreadCreate;
import threads.ThreadDemo;

public class Main {

    public static void main(String[] args){
        DefaultMethodInter d = new DefaultMethodInter();
        d.print();
        TryCatch.print();
        // thread
        ThreadDemo.print();
        // create thead
        ThreadCreate.print();
    }
}
