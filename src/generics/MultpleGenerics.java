package generics;
class TwoGen<T, V>{
    T ob1;
    V ob2;

    TwoGen(T o1, V o2){
        ob1 = o1;
        ob2 = o2;
    }

    void showType(){
        System.out.println("T type: "+ ob1.getClass().getName());
        System.out.println("V type: "+ ob2.getClass().getName());
    }

    T getOb1(){
        return ob1;
    }
    V getOb2(){
        return ob2;
    }
}
public class MultpleGenerics {
    public static void print(){
        TwoGen<Integer, String> Obj = new TwoGen<Integer, String>(11, "zhang");
        // show types
        Obj.showType();
        // Obtain and show values
        int v = Obj.getOb1();
        String str = Obj.getOb2();

        System.out.println("v "+ v);
        System.out.println("str "+ str);
    }
}
