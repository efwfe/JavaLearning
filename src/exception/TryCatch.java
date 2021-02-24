package exception;

public class TryCatch {
    public static void print(){
        try {
            int i=0;
            double j = 1/i;

        }catch (ArithmeticException e){
            System.out.println("exception "+e);
        }finally {
            System.out.println("finally done!");
        }
    }
}

