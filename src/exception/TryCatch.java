package exception;

public class TryCatch {
    public static void print(){
        try {
            int i=0;
//            double j = 1/i;
            throw new IllegalAccessException("测试异常");
        }catch (ArithmeticException|IllegalAccessException e){
            System.out.println("exception "+e);
        }finally {
            System.out.println("finally done!");
        }
    }
}

