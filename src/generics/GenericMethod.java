package generics;

public class GenericMethod {
    // 类型在返回类型之前声明
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y){
        for (V v : y) if (x.equals(v)) return true;
        return false;
    }

    public static void main(){
        Integer[] nums = {1,2,3,4,5};
        if (isIn(2, nums))
            System.out.println("2 is in nums");

        if (!isIn(7, nums))
            System.out.println("7 not in nums");
    }
}
