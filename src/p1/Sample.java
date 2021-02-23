package p1;

class Sample {
    Sample(){
        Data dt = new Data();
        System.out.println("sample package constructor");
        System.out.println("n= "+ dt.i);
        // System.out.println("n= "+ dt.a); // private class only
        System.out.println("n= "+ dt.b);
        System.out.println("n= "+ dt.c);
    }
}
