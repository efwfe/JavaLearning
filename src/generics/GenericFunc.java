package generics;

class GenCons{
    private final double val;
    <T extends  Number> GenCons(T args){
        val = args.doubleValue();
    }

    void showval(){
        System.out.println("val: "+ val);
    }
}


public class GenericFunc {
    public static void print(){
        GenCons tet = new GenCons(100);
        GenCons te1t = new GenCons(100.1);

        tet.showval();
        te1t.showval();

    }
}
