package threads;

class ExtThread extends Thread{
    ExtThread(){
        this.setName("Ext thead");
    }
    public void run(){
        String na = this.getName();
        for (int i=0;i<10;i++){
            System.out.println(na + " "+ i);
        }
    }
}

public class ThreadExtends {
    public static void print(){
        ExtThread et = new ExtThread();
        et.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
