package com.itheima.test;

public class ArrTest1 {
    //定义一个数组，遍历元素得到数组数据和
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
