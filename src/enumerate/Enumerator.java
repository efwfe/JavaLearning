package enumerate;

enum Apple{
    a,b,c,d,e,f,g
}
public class Enumerator {
    public static void print(){
        Apple ai;
        Apple[] vals = Apple.values();
        for(Apple i: vals){
            System.out.println(i);
        }
    }
}
