package com.itheima.test1;

public class ArrTest4 {
    public static void main(String[] args) {
        //定义数组求最大值
        int[] arr = {33,5,22,44,55};
        //max的初始化值一定要是数组中的值
        int max = arr[0];
        //循环开始条件如果为0，自己和自己比，为提高效率，开始条件可以写1
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
