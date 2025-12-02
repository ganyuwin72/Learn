package com.itheima.test;

import java.util.Scanner;

public class Test7 {
    //需求：把整数上的每一位都添加到数组当中
    //反向推导
    public static void main(String[] args) {
        //1.计算出数组的长度
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //定义一个变量进行统计
        int count = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        //2.需要有一个数组
        //动态 静态 初始化
        int[] arr = new int[count];
        //把整数上的每一位都添加到数组中
        /*
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = number % 10;
            number /= 10;
        }
        */
        int index = arr.length - 1;
        while (number != 0) {
            int ge = number % 10;
            number /= 10;
            arr[index] = ge;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
