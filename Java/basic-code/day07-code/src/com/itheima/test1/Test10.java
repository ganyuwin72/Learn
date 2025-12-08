package com.itheima.test1;

import java.util.Random;

public class Test10 {
    //抽奖结果播报
    public static void main(String[] args) {
        //把奖池里的所有奖项打乱顺序
        int[] arr = {2, 588, 888, 1000, 10000};
        //打乱奖池
        int[] newArr = randomArr(arr);
        //遍历打乱后的奖池输出结果
        for (int i = 0; i < newArr.length; i++) {
            System.out.println("奖金" + newArr[i] + "已被抽到");
        }
    }

    //打乱数组
    public static int[] randomArr(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        return arr;
    }
}
