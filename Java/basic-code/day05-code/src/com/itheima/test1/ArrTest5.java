package com.itheima.test1;

import java.util.Random;

public class ArrTest5 {
    public static void main(String[] args) {
        //1.定义一个长度为10的数组
        int[] arr = new int[10];

        //2.生成10个1~100之间的随机数存到数组里
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }

        //3.求所有数据的和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("所有数据的和为：" + sum);

        //4.求所有数据的平均数
        double avg = (sum + 0.0) / arr.length;
        System.out.println("所有数据的平均数为：" + avg);

        //5.判断有多少个数据比平均值小
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < avg){
                 count++;
            }
        }
        System.out.println("比平均值小的数据的个数：" + count);

        //6.打印数组进行验证
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
