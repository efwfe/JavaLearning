package generics;

// 这里T知识一个参数类型；会被后续的真实类型替代
class Gen<T>{
    // A simple generic class
    T ob; // 声明一个对象类型T

    // 通过构造函数创建一个T对象类型的引用
    Gen(T o){
        ob = o;
    }
    // Return ob.
    T getOb(){
        return ob;
    }

    // show type of T
    void showType(){
        System.out.println("Type is :"+ ob.getClass().getName());
    }
}
public class GenericExample {

    public static void print(){
        // 创建一个整数类型的Gen
        Gen<Integer> iOb;
        // 创建一个Gen <int>对象
        iOb = new Gen<Integer>(88);
        iOb.showType();

        // 获取iOb的数据
        int v = iOb.getOb();
        System.out.println("strOb : " + v);

        // ------------------------
        // 字符串类型的Gen对象
        Gen<String> strOb = new Gen<String>("Generics Strings");
        strOb.showType();
        System.out.println("strOb :" + strOb.getOb());

        // iOb = strOb; 范型版本不一定兼容
    }

}
