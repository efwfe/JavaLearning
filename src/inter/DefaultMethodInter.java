package inter;

interface DI{
    default String getStr(){
        return "interface default method";
    }
}

public class DefaultMethodInter implements DI{
    public String getStr(){
        return "override interface default method";
    }

    public void print(){
        String code =  getStr();
        System.out.println("code is : "+ code);
    }
}
