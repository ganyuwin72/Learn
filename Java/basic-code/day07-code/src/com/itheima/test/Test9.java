package com.itheima.test;

import java.util.Random;

public class Test9 {
    //抽奖结果播报
    public static void main(String[] args) {
        //1.定义数组表示奖池
        int[] arr = {2, 588, 888, 1000, 10000};
        //2.定义新数组用于存储抽奖的结果
        int[] newArr = new int[arr.length];
        //3.抽奖
        Random r = new Random();
        for (int i = 0; i < arr.length; ) {
            int randomIndex = r.nextInt(arr.length);
            boolean contains = contains(newArr, arr[randomIndex]);
            if (!contains) {
                newArr[i] = arr[randomIndex];
                System.out.println("奖金" + arr[randomIndex] + "已被抽到");
                i++;
            }
        }
    }

    public static boolean contains(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return true;
        }
        return false;
    }
}
