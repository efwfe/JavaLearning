package com.examples.control;

public class Forloop {
    public static void print() {
        for (int i = 0; i < 10; i++)
            System.out.println("for loop " + i);
    }

    public static void multipleVars() {
        for (int i = 1, j = 10; i < j; ++i, --j)
            System.out.printf("multiple for control vars|  %d,%d \n", i, j);

    }

    public static void forEach() {
        // for each 会遍历所有的元素自动终止；也可以使用break提前终止
        // for each style获取的数据是readonly的数据
        // 如果是数组的话 形式位for(int[] x:arr)
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
//        for(int i=0;i<9;i++)
//            sum += nums[i];
        for (int x : nums) sum += x;
        System.out.println("sum result : " + sum);
    }


}
