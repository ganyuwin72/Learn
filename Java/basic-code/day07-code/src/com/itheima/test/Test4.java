package com.itheima.test;

public class Test4 {
    //数组元素的复制：将一个数组的元素复制到一个新的数组中
    public static void main(String[] args) {
        //1.定义原数组
        int[] arr0 = {12, 43, 893, 324, 45, 45};
        //2.定义新数组
        int[] arr1 = new int[arr0.length];
        //3.复制数组
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr0[i];
        }
        //4.打印数组
        printArray(arr0);
        printArray(arr1);
        //5.直接复制原数组
        int[] arr2 = arr0;
        printArray(arr2);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("]");
    }
}
