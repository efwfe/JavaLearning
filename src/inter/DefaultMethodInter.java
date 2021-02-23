package inter;

interface DI{
    default String getStr(){
        return "interface default method";
    }
}

interface DI2{
    default String getStr(){
        return "interface default method2";
    }
}

interface DIMixin extends DI,DI2{
    // 必须重写默认方法
    @Override
    default String getStr() {
        return DI2.super.getStr();
    }
}

public class DefaultMethodInter implements DIMixin{


    public void print(){
        String code =  getStr();
        System.out.println("code is : "+ code);
    }
}
