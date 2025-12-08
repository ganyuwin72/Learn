package com.itheima.test1;

public class ArrTest7 {
    public static void main(String[] args) {
        /*需求：定义一个数组，将数组中0索引和最大索引处的值进行交换*/

        //1.定义一个数组
        int[] arr = {1,2,3,4,5};
        //2.将数组中0索引和最大索引处的值进行交换
        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
        //3.打印数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
