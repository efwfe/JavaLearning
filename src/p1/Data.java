package p1;

public class Data{
    int i=0;
    private int a = 1;
    protected int b = 2;
    public int c = 3;

    public void print(){
        System.out.println("default "+ i);
        System.out.println("private "+ a);
        System.out.println("protected "+ b);
        System.out.println("public "+ c);
    }
}
