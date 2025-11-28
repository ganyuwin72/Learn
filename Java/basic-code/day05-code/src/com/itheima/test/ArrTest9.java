package com.itheima.test;

import java.util.Random;

public class ArrTest9 {
    public static void main(String[] args) {
        //随机打乱一个数组的顺序

        //1.定义一个数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //2.循环遍历数组，从0索引开始打乱数据的顺序
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[randomIndex];
            arr[randomIndex] = arr[i];
            arr[i] = temp;
        }
        //3.打印打乱数据后的数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
