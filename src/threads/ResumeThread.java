package threads;

class SThread implements Runnable{
    String name;
    Thread t;
    boolean suspendFlag;

    SThread(String threadname){
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New Thread: "+ t);
        suspendFlag = false;
    }

    // this is entry point for thread
    public void run(){
        try {
            for (int i=15; i>0; i--){
                System.out.println(name + " "+ i);
                Thread.sleep(200);
                synchronized (this){
                    while (suspendFlag){
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " exiting.");
    }

    synchronized void mysuspend(){
        suspendFlag = true;
    }

    synchronized void myresume(){
        suspendFlag = false;
        this.notify();
    }
}


public class ResumeThread {

    public static void main(){
        SThread ob1 = new SThread("One");
        SThread ob2 = new SThread("Two");

        ob1.t.start();
        ob2.t.start();

        try {
            ob1.mysuspend();
            System.out.println("Suspending thread One");
            ob2.mysuspend();
            System.out.println("Suspending thread Two");

            Thread.sleep(500);
            ob1.myresume();
            System.out.println("Resume thread One");
            Thread.sleep(500);
            ob2.myresume();
            System.out.println("Resume thread Two");

            try {
                ob1.t.join();
                ob2.t.join();
            }catch (InterruptedException e){
                System.out.println("error : "+ e);
            }
            System.out.println("Main Thread existing");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
