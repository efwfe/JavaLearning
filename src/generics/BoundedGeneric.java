package generics;

class Stats<T extends Number>{
    T[] nums; // nums is an array of Type T

    Stats(T[] o){
        nums = o;
    }

    double average(){
        double sum=0.0;
        for (T num : nums) {
            sum += num.doubleValue(); // 这里会报错了
        }
        return sum/nums.length;
    }
}

public class BoundedGeneric {

    public static void print(){
        Double[] inums = {1.0, 2.1,3.3};
        Stats<Double> st = new Stats<>(inums);
        System.out.println(st.average());
    }
}
