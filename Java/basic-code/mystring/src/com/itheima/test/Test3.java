package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

/**
 * Author: 86175
 * Version: 1.0
 * Date: 2025/12/17
 */
public class Test3 {
    /*
    需求：打乱字符串
     */
    public static void main(String[] args) {
        //1.键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        //2.打乱字符串
        System.out.println(breakStr(str));
    }

    public static String breakStr(String str) {
        char[] arr = str.toCharArray();
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            char temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        str = new String(arr);
        return str;
    }
}
