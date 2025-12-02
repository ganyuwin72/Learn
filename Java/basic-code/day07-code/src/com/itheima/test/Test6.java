package com.itheima.test;

import java.util.Scanner;

public class Test6 {
    //数字加密
    //加密方式：先得到每位数，然后每位数都加上5，再对10取余，最后将所有数字反转，得到一串新数
    public static void main(String[] args) {
        //1.键盘录入要加密的数
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //2.定义变量存储加密后的数
        int numCode = getCode(num);
        //3.输出加密后的数字
        System.out.println(numCode);
    }

    public static int getCode(int num) {
        int numCode = 0;
        while (num != 0) {
            //取num的个位
            int ge = num % 10;
            num /= 10;
            //个位数字加5再对10取余
            ge = (ge + 5) % 10;
            //将个位数字加到numCode中
            numCode = numCode * 10 + ge;
        }
        return numCode;
    }

    public static int getCode(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        int numCode = 0;
        for (int i = 0; i < arr.length; i++) {
            numCode = numCode * 10 + arr[i];
        }
        return numCode;
    }
}
