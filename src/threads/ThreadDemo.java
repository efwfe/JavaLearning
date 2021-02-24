package threads;
import java.lang.Thread;

public class ThreadDemo {
    public static void print(){
        Thread cr = Thread.currentThread();
        cr.setName("sample thread");
        System.out.println("current thread "+ cr);
        for (int n=5;n>0;n--){
            try {
                Thread.sleep(100);
                System.out.println(n);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
