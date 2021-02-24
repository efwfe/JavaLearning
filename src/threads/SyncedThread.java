package threads;

class Callme{
    synchronized void call(String name){
        System.out.println("【call "+ name);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("】");
    }
}

class Caller implements Runnable{
    String msg;
    Callme target;
    Thread t;

    public Caller(Callme tag, String s){
        target = tag;
        msg = s;
        t = new Thread(this);
        System.out.println(Thread.currentThread().getName());

    }

    @Override
    public void run() {
        System.out.println(t.getName());
        target.call(msg);
    }
}
public class SyncedThread {
    public static void main(){
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "hello1");
        Caller ob2 = new Caller(target, "hello2");
        Caller ob3 = new Caller(target, "hello3");

        // start threads
        ob1.t.start();
        ob2.t.start();
        ob3.t.start();

        // wait
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


}
