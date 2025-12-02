package com.itheima.test;

import java.util.Scanner;

public class Test8 {
    //数字解密
    public static void main(String[] args) {
        //1.键盘录入加密后的数字并转换为数组
        Scanner sc = new Scanner(System.in);
        int numCode = sc.nextInt();
        int count = 0;
        int temp = numCode;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        int[] arrCode = new int[count];
        for (int i = arrCode.length - 1; i >= 0; i--) {
            arrCode[i] = numCode % 10;
            numCode /= 10;
        }
        //2.得到解密后的数字
        int num = getNum(arrCode);
        //3.打印结果
        System.out.println(num);

    }

    public static int getNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 5) {
                arr[i] = arr[i] + 5;
            } else {
                arr[i] = arr[i] - 5;
            }
        }
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num = num * 10 + arr[i];
        }
        return num;
    }
}
