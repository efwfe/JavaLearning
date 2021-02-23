package inter;

interface ConstI {
    int a = 10;
    int b = 20;
    String code = "111";
}


public class ConstInterface{
    public static void print(){
        System.out.println(ConstI.a);
       // ConstI.a = 10; // 默认final
    }
}