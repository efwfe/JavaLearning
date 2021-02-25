package generics;

class Compare<T extends  Number>{
    T[] nums;

    Compare(T[] o){
        nums = o;
    }

    double average(){
        double sum = 0.0;
        for(T num: nums){
            sum += num.doubleValue();
        }
        return sum / nums.length;
    }
    // 如果不是？就是T 但是T限制了整个的类型 就限制了范式的表达范围
    boolean sameAvg(Compare<?> ob){
        return average() == ob.average();
    }
}
public class SameAvgGeneric {
    public static void print(){
        Integer[] anums = {1,2,3,4,5};
        Double[] bnums = {1.0, 2.0, 3.0,4.0,5.0};
        Compare<Integer> iob = new Compare<Integer>(anums);
        Compare<Double> dob = new Compare<Double>(bnums);
        boolean flg = iob.sameAvg(dob);
        System.out.println("Average Compare : "+ flg);
    }
}
