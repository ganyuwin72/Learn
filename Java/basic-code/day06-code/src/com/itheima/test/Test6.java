package com.itheima.test;

public class Test6 {
    //设计一个方法求数组最大值，并将最大值返回
    public static void main(String[] args) {
        int[] arr = {12, 334, 32, 34, 54};
        System.out.println(getArrMax(arr));
    }

    //1.要干嘛：方法体
    //2.需要什么：形参
    //3.是否返回：返回值
    public static int getArrMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
