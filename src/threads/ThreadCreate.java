package threads;

class NewThread implements Runnable{
    Thread t;

    NewThread(){
        t = new Thread(this, "demo");
        System.out.println("new thread "+ t.getName());
    }

    @Override
    public void run() {
        try {
            for (int i=0; i<10; i++){
                System.out.println(Thread.currentThread().getName()+' '+i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Exit child thread");
    }
}
public class ThreadCreate {
    public static void print() {
        NewThread nt = new NewThread();
        nt.t.start();

        for (int i=5;i>0;i--){
            System.out.println(Thread.currentThread().getName()+' ' + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
